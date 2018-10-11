package br.com.caelum.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
//public class ContaPoupanca extends Conta {	

	private double saldo;
	private String nomeDoCliente;

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
	
	/*public int compareTo(ContaPoupanca o) {
		if (this.getNumero() < o.getNumero()) {
			return -1;
		}
		if (this.getNumero() > o.getNumero()) {
			return 1; 
		}
		return 0;
	}*/
	
	public int compareTo(ContaPoupanca cp) {
		int nomeCliente = this.getNomeDoCliente().compareTo(cp.getNomeDoCliente());
		
		if (nomeCliente < 0) {
			return -1;
		}
		if (nomeCliente > 0) {
			return 1; 
		}
		return 0;
	}
	
	/*public int compareTo(ContaPoupanca c) {
		return this.getNomeDoCliente().compareTo(c.getNomeDoCliente());
	}*/

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}
	
	/*public int compareTo(ContaPoupanca outra) {
		return Integer.compare(this.getNumero(), outra.getNumero());
	}*/

}
