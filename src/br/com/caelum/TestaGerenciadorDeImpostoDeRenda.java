package br.com.caelum;

import br.com.caelum.model.ContaCorrente;
import br.com.caelum.model.GerenciadorDeImpostoDeRenda;
import br.com.caelum.model.SeguroDeVida;

public class TestaGerenciadorDeImpostoDeRenda {
	
	public static void main(String[] args) {
		
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		
		System.out.printf("O saldo é: %.2f", cc.getSaldo());
		
		//gerenciador.adiciona(cc);
		
		
		System.out.println("\n" + gerenciador.getTotal());
	}

}
