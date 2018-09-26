package br.com.caelum;

import br.com.caelum.model.AreaCalculavel;
import br.com.caelum.model.Circulo;
import br.com.caelum.model.Quadrado;
import br.com.caelum.model.Retangulo;

public class TestaAreaCalculavel {

	public static void main(String[] args) {
		
		AreaCalculavel r = new Retangulo(3,2);		
		System.out.println(r.calculaArea());
		
		AreaCalculavel q = new Quadrado(4);
		System.out.println(q.calculaArea());
		
		AreaCalculavel c = new Circulo(5);
		System.out.println(c.calculaArea());

	}

}
