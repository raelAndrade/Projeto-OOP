package br.com.caelum;

import br.com.caelum.banco.conta.ContaCorrente;
import br.com.caelum.banco.conta.ContaPoupanca;
import br.com.caelum.banco.conta.Contas;
import br.com.caelum.exception.SaldoInsuficienteException;

public class TesteConta {

	public static void main(String[] args) {
		
		Contas cc = new ContaCorrente();
		cc.deposita(100);
		
		Contas cp = new ContaPoupanca();
		cp.deposita(100);
		
		// Sacando das contas
		try {
			cc.saca(50);
			//System.out.println("Consegui sacar da conta corrente!");
			cc.saca(50);
			//System.out.println("Consegui sacar da conta poupança!");
		}catch(SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}				
				
		//Contas c = new ContaCorrente();
		//Tributavel t = new ContaCorrente();
		
		/*Conta minhaConta = new Conta();
		minhaConta.deposita(100);
		minhaConta.setLimite(100);
		if(!minhaConta.saca(1000)) {
			System.out.println("Não saqueeeeiii! :( ");
		}*/
				
		/*Conta c1 = new Conta();
		Data data = new Data();
		
		c1.titularConta = "Israel";
		c1.titular.nome = "Israel Andrade";
		c1.numero = 123;
		c1.agencia = "456789-4";
		c1.saldo = 50.0;
		//c1.dataDeAbertura = "20/09/2018";
			
		c1.dataDeAbertura = data;
		
		c1.deposita(100.0);
		System.out.println("Titular da conta: " + c1.titular.nome);
		System.out.println("Saldo atual: " + c1.saldo);
		System.out.println("Rendimento mensal: " + c1.calculaRendimento());
		
		System.out.println("*********************************");
		
		System.out.println(c1.recuperaDadosParaImpressao());
		
		System.out.println("*********************************");
		
		Conta c2 = new Conta();
		c2.titular.nome = "Danilo";
		c2.saldo = 100;
		
		Conta c3 = new Conta();
		c3.titular.nome = "Danilo";
		c3.saldo = 100;
		
		if(c2 == c3) {
			System.out.println("São iguais");
		}else {
			System.out.println("São contas diferentes");
		}
		
		System.out.println("*********************************");
		
		Conta c4 = new Conta();
		c4.titular.nome = "Hugo";
		c4.saldo = 100;
		
		Conta c5 = c4;
		
		if (c4 == c5) {
			System.out.println("Contas são iguais");
		}else {
			System.out.println("São contas diferentes");
		}*/

	}

}
