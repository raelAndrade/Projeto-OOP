package br.com.caelum.model;

public class Diretor extends Gerente implements Autenticavel {

	private int senha;
	
	private int numeroDeFuncionariosGerenciados;

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		}else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
}
