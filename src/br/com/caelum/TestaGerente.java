package br.com.caelum;

import br.com.caelum.model.ControleDeBonificacoes;
import br.com.caelum.model.Funcionario;
import br.com.caelum.model.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		
		/*Gerente gerente = new Gerente();
		Funcionario funcionario = gerente;
		funcionario.setSalario(5000.0);
		System.out.println(funcionario.getBonificacao());*/
		
		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(5000.0);
		controle.adiciona(funcionario1);
		controle.adiciona(funcionario1);
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setSalario(1000.0);
		controle.adiciona(funcionario2);
		
		System.out.println(controle.getTotalDeBonificacoes());
		
		// Podemos chamar métodos do funcionário:
		/*gerente.setNome("João Pé de Feijão");
		System.out.println(gerente.getNome());*/
		
		// E também métodos do gerente!
		/*gerente.setSenha(123456);
		gerente.setSalario(5000.0);
		System.out.println(gerente.getBonificacao());*/
		
	}

}
