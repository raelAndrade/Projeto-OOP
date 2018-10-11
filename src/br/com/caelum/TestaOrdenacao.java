package br.com.caelum;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.caelum.banco.conta.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {
		
		//List<ContaPoupanca> contas = new ArrayList<>();
		List<ContaPoupanca> contas = new LinkedList<>();
		
		ContaPoupanca cp1 = new ContaPoupanca();
		cp1.setNumero(1973);
		cp1.setSaldo(1000);
		contas.add(cp1);
		
		ContaPoupanca cp2 = new ContaPoupanca();
		cp2.setNumero(1462);
		cp2.setSaldo(1500);
		contas.add(cp2);
		
		ContaPoupanca cp3 = new ContaPoupanca();
		cp3.setNumero(1854);
		cp3.setSaldo(4500);
		contas.add(cp3);
		
		Collections.sort(contas);
		
		// Imprime todos os números das contas na lista já ordenada
		for (int i = 0; i < contas.size(); i++) {
			//Conta atual = contas.get(i);
			//System.out.println("Número: " + atual.getNumero());
			//System.out.println("Número: " + contas.get(i).getNumero());
			System.out.println("Nome: " + contas.get(i).getNomeDoCliente());
		}
		
		System.out.println(contas);
		
		/*for(ContaPoupanca c : contas) {
			System.out.println(c.getNomeDoCliente());
		}*/

	}

}
