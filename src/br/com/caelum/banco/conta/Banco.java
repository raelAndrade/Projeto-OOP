package br.com.caelum.banco.conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	List<Conta> contas = new ArrayList<>();
	
	public void adiciona(Conta c) {
		contas.add(c);
	}
	
	public Conta pega(int x) {
		return pega(x);
	}
	
	public int pegaQuantidadeDeContas() {
		Conta.getTotalDeContas();
		return pegaQuantidadeDeContas();
	}
	
	public Conta buscarPorNome(String nome) {
		if(nome.equals(nome)) {
			this.buscarPorNome(nome);
		}
		return buscarPorNome(nome);		
	}

}
