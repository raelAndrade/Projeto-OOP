package br.com.caelum.banco.conta;

public interface Contas {

	public double getSaldo();
	public void deposita(double valor);
	public void saca(double valor);
	public void atualiza(double taxaSelic);
	
}
