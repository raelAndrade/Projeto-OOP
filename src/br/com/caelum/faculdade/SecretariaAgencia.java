package br.com.caelum.faculdade;

public class SecretariaAgencia extends Secretaria{

	@Override
	public double getBonificacao() {
		return this.salario * 1.2 + 500;
	}

	
}
