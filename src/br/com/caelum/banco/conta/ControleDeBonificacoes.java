package br.com.caelum.banco.conta;

import br.com.caelum.faculdade.Funcionario;

public class ControleDeBonificacoes {
	
	private double totalDeBonificacoes = 0;
	
	public void adiciona(Funcionario funcionario) {
		System.out.println("Adicionando bonificação do funcionario: " + funcionario);
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
	
	public void registra(Funcionario f) {
		System.out.println("Adicionando bonificação do funcionário: " + f);
		this.totalDeBonificacoes += f.getBonificacao();
	}

}
