package br.com.caelum.programacaoconcorrente;

import java.util.ArrayList;
import java.util.Collection;

public class RegistroDeMensagens {

	public static void main(String[] args) throws InterruptedException {
		Collection<String> mensagens = new ArrayList<String>();
		
		Thread t1 = new Thread(new ProduzMensagens(0, 10000, mensagens));
		Thread t2 = new Thread(new ProduzMensagens(10000, 20000, mensagens));
		Thread t3 = new Thread(new ProduzMensagens(20000, 30000, mensagens));
		
		t1.start();
		t2.start();
		t3.start();
		
		// Faz com que a thread que roda o main aguarde o fim dessas
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Threads produtoras de mensagens finalizadas!");
		
		// Verifica se todas as mensagens foram guardadas
		for (int i = 0; i < 15000; i++) {
			if (!mensagens.contains("Mensagens" + i)) {
				throw new IllegalStateException("Nãop encontrei a mensagem: " + i);
			}
		}
		
		// Verifica se alguma mensagem ficou nula
		if(mensagens.contains(null)) {
			throw new IllegalStateException("não deveria ter null aqui dentro!");
		}
		
		System.out.println("Fim da execução com sucesso");

	}

}
