package br.com.caelum.carro;

public class Carro {

	public String cor;
	public String modelo;
	public double velocidadeAtual;
	public double velocidadeMaxima;
	
	public Motor motor;
	
	public void ligar() {
		System.out.println("O carro está ligado");
	}
	
	public void acelera(double quantidade) {
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
 	}
	
	public int pegaMarcha() {
		if(this.velocidadeAtual < 0) {
			return -1;
		}else if(this.velocidadeAtual >= 0 && this.velocidadeAtual < 40 ) {
			return 1;
		}else if(this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			return 2;
		}
		return 3;
	}
	
}
