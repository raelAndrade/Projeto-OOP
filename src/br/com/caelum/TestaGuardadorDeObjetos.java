package br.com.caelum;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;
import br.com.caelum.banco.conta.ContaPoupanca;
import br.com.caelum.javalangobject.GuardadorDeObjetos;

/**
 * @author Israel
 *
 */

public class TestaGuardadorDeObjetos {

	public static void main(String[] args) {
		
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		
		ContaCorrente cc = new ContaCorrente();
		guardador.adicionaObjeto(cc);
		
		ContaPoupanca cp = (ContaPoupanca) guardador.pegaObjeto(0);
		
		Conta conta = new Conta(100);
		//System.out.println(conta.toString());
		
		/**
		 * Nesse caso não é necessário chamar o método toString, automaticamente ele já é chamado
		 * O toString() é chamado pela classe PrintStream
		 */
		System.out.println("Descrição: " + conta); 
		
		guardador.adicionaObjeto(conta);
		
		// Pega a conta referenciado como objeto
		Object object = guardador.pegaObjeto(0);
		
		/**
		 * Para realizar essa atribuição, para isso devemos “avisar” o compilador Java 
		 * que realmente queremos fazer isso, sabendo do risco que corremos. 
		 * Fazemos o casting de referências, parecido com de tipos primitivos:
		 */
		Conta contaResgatada = (Conta) object;
	
		((Conta) object).getSaldo();

	}

}
