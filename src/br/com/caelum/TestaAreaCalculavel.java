package br.com.caelum;

import br.com.caelum.area.AreaCalculavel;
import br.com.caelum.area.Circulo;
import br.com.caelum.area.Quadrado;
import br.com.caelum.area.Retangulo;

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
