package br.com.caelum.model;

public class Circulo implements AreaCalculavel {
	
	private int raio;

	public Circulo(int raio) {
		this.raio = raio;
	}
	public double calculaArea() {
		return Math.PI * this.raio * this.raio;
	}

}
