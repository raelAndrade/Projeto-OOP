package br.com.caelum;

import br.com.caelum.model.Carro;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro meuCarro = new Carro();
		
		meuCarro.cor = "Verde";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		meuCarro.ligar();
		System.out.println(meuCarro);
		
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);		

	}

}
