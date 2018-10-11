package br.com.caelum.banco.conta;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Israel
 *
 */
public class Agencia {
	
	public List<Conta> buscaTodasContas (){
		ArrayList<Conta> contas = new ArrayList<>();
		
		// Para cada conta do banco de dados, contas.add
		
		return contas;
	}
	
	/**
	 * Métodos que precisam receber uma lista de objetos têm List como parâmetro em vez de uma implementação em
	 * específico como ArrayList, deixando o método mais flexível:
	 * 
	 * @param contas
	 */
	public void atualizaContas(List<Contas> contas) {
		
		
	}

}
