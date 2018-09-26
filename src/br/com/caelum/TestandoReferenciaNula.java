package br.com.caelum;

import br.com.caelum.model.Conta;

public class TestandoReferenciaNula {

	public static void main(String[] args) {
		
		Conta c = null;
		System.out.println("Saldo atual: " + c.getSaldo());
		
		/*if(c != null) 
			System.out.println("Saldo atual: " + c.getSaldo());
		else
			System.out.println("Você não tem saldo suficiente!");*/
		
	}

}
