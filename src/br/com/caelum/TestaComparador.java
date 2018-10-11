package br.com.caelum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.caelum.comparador.ComparadorPorTamanho;

public class TestaComparador {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		lista.add("Sergio");
		lista.add("Paulo");
		lista.add("Bernardo");
		
		// Invocando o sort passando o comparador
		ComparadorPorTamanho comparador = new ComparadorPorTamanho();
		Collections.sort(lista, comparador);
		
		System.out.println(lista);

	}

}
