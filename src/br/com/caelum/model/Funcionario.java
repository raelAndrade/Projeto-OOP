package br.com.caelum.model;

public abstract class Funcionario {
	
	protected double salario;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double getBonificacao();

}
