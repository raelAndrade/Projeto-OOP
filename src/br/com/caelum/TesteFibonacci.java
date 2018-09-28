package br.com.caelum;

import br.com.caelum.area.Fibonacci;

public class TesteFibonacci {

	public static void main(String[] args) {
		
		Fibonacci fibonacci = new Fibonacci();
		
//		for(int i = 1; i <= 6; i++) {
//			int resultado = (int) fibonacci.fibo(i);
//			System.out.println(resultado);
//		}
		for(int i = 1; i <= 30; i++) {
			System.out.print("(" + i + "):" + fibonacci.fibo(i) + "\t");
		}

	}

}
