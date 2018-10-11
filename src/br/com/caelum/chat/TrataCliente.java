package br.com.caelum.chat;

import java.io.InputStream;
import java.util.Scanner;

public class TrataCliente implements Runnable {

	private InputStream cliente;
	private Servidor servidor;
	
	public TrataCliente(InputStream cliente, Servidor servidor) {
		this.cliente = cliente;
		this.servidor = servidor;
	}
	
	@Override
	public void run() {
		// quando chegar uma msg, distribui para todos
		Scanner s = new Scanner(this.cliente);
		while (s.hasNextLine()) {
			servidor.distribuirMensagens(s.nextLine());
		}
		s.close();
	}

}
