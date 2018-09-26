package br.com.caelum.model;

public class ContaPoupanca implements Contas {

	private double saldo;

	@Override
	public double getSaldo() {		
		return this.saldo;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;		
	}

	@Override
	public void saca(double valor) {
		this.saldo = saldo - valor;
	}

	@Override
	public void atualiza(double taxaSelic) {
		this.saldo = this.saldo * (1 + taxaSelic);		
	}

}
