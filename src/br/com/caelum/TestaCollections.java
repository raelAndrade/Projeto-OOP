package br.com.caelum;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.banco.conta.ContaCorrente;

/**
 * 
 * @author Israel
 *
 */
public class TestaCollections {

	public static void main(String[] args) {
		
		/*List lista = new ArrayList();
		lista.add("Manoel");
		lista.add("Joaquim");
		lista.add("Maria");*/
		
		ContaCorrente c1 = new ContaCorrente();
		c1.deposita(100);
		
		ContaCorrente c2 = new ContaCorrente();
		c2.deposita(100);
		
		ContaCorrente c3 = new ContaCorrente();
		c3.deposita(100);
		
		List contas = new ArrayList();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		System.out.println(contas.size());
		
		for (int i = 0; i < contas.size(); i++) {
			ContaCorrente cc = (ContaCorrente) contas.get(i);
			System.out.println(cc.getSaldo());
		}

	}

}
