package br.com.caelum.threads;

public class MeuPrograma {

	public static void main(String[] args) {

		GerarPDF gerarPDF = new GerarPDF();
		Thread threadDoPdf = new Thread(gerarPDF);
		threadDoPdf.start();
		
		BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
		Thread threadDaBarra = new Thread(barraDeProgresso);
		threadDaBarra.start();

	}

}
