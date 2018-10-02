package br.com.caelum;

import br.com.caelum.banco.conta.Conta;

public class TesteEquals {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(100);
		Conta c2 = new Conta(100);
		
		if (c1 != c2) {
			System.out.println("Objetos referenciados são diferentes!");
		}

	}

}
