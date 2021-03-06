package br.com.caelum.banco.conta;

//public class ContaCorrente implements ContaTributavel {
public class ContaCorrente extends Conta implements Comparable<ContaCorrente> {
	
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

	public int compareTo(ContaCorrente outra) {
		if(this.saldo < outra.saldo) {
			return -1;
		}
		if (this.saldo > outra.saldo) {
			return 1;
		}
		return 0;
	}
	/*@Override
	public double calculaTributos() {
		// TODO Auto-generated method stub
		return 0;
	}*/
	
	/*public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}*/
	
	/*public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}*/

	
}
