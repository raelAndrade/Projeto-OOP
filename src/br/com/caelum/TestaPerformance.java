package br.com.caelum;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		
		System.out.println("Inciando...");
		
		//Collection<Integer> teste = new ArrayList<>();
		Collection<Integer> teste = new HashSet<>();
		long inicio = System.currentTimeMillis();
		
		int total = 100000;
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		
		long fim = System.currentTimeMillis();
		long tempoAdd = fim - inicio;
		
		System.out.println("Tempo gasto add: " + tempoAdd);
		
		long first = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}		
		long last = System.currentTimeMillis();
		long tempoContains = last - first;		
		System.out.println("Tempo gasto: " + tempoContains);		

	}

}
