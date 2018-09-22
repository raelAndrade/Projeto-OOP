package br.com.caelum.model;

public class SecretariaAgencia extends Secretaria{

	@Override
	public double getBonificacao() {
		return this.salario * 1.2 + 500;
	}

	
}
