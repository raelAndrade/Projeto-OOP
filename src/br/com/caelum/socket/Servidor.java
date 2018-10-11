package br.com.caelum.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {

	public static void main(String[] args) throws IOException {
		
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta!");
		
		Socket cliente = servidor.accept();
		System.out.println("Nova conexão com o cliente " + 
				cliente.getInetAddress().getHostAddress()
		); // imprime o IP do cliente
		
		Scanner scanner = new Scanner(cliente.getInputStream());
		
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		
		scanner.close();
		servidor.close();
		cliente.close();

	}

}
