package br.com.caelum;

import br.com.caelum.model.ContaCorrente;
import br.com.caelum.model.Tributavel;

public class TestaTributavel {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		//System.out.println(cc.calculaTributos());
		
		// Testando polimorfismo:
		//Tributavel t = cc;
		//System.out.println("Tributos: " + t.calculaTributos());
	}

}
