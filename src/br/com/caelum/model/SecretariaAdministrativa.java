package br.com.caelum.model;

public class SecretariaAdministrativa extends Secretaria{

	@Override
	public double getBonificacao() {
		return this.salario * 1.3 + 500;
	}

}
