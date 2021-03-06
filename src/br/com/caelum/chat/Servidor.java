package br.com.caelum.chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Servidor {

	public static void main(String[] args) throws IOException {
		new Servidor(1234).executa();
	}
	
	private int porta;
	private List<PrintStream> clientes;
	
	public Servidor (int porta) {
		this.porta = porta;
		this.clientes = new ArrayList<PrintStream>();
	}
	
	public void executa() throws IOException {
		ServerSocket servidor = new ServerSocket(this.porta);
		System.out.println("Porta 1234 aberta!");
		
		while (true) {
			// aceita um cliente
			
			Socket cliente = servidor.accept();
			System.out.println("Nova conexão com o cliente " + 
					cliente.getInetAddress().getHostAddress()
			);
			
			// Adiciona saida do cliente à lista
			PrintStream ps = new PrintStream(cliente.getOutputStream());
			this.clientes.add(ps);
			
			// cria tratador de cliente numa nova thread
			TrataCliente tc = new TrataCliente(cliente.getInputStream(), this);
			new Thread(tc).start();
		}
	}
	
	public void distribuirMensagens(String msg) {
		// envia msg para todo mundo
		for(PrintStream cliente : this.clientes) {
			cliente.println(msg);
		}
	}
		
//		ServerSocket server = new ServerSocket(1234);
//		System.out.println("Porta 1234 aberta!");
//		
//		Socket cliente = server.accept();
//		System.out.println("Nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());
//		
//		Scanner input = new Scanner(cliente.getInputStream());
//		while (input.hasNextLine()) {
//			System.out.println(input.nextLine());
//		}
//		
//		input.close();
//		server.close();
//	}

}
