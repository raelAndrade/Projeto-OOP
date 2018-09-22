package br.com.caelum.model;

public class Gerente extends Funcionario{
	
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	/**
	 * Método para autenticar a senha
	 * @param senha
	 */
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		}else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
	
	@Override
	public double getBonificacao() {
		return this.salario * 1.4 + 1000;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	

}
