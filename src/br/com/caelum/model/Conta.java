package br.com.caelum.model;

public class Conta {

//public abstract class Conta {

	private String titular;
	private double saldo;
	private double limite;
	private int numero;

	// public Cliente titular = new Cliente();
	// public Data dataDeAbertura;
	// public int numero;
	// public String agencia;
	// public String titularConta;
	// public String dataDeAbertura;

	/*
	 * Qnd declaramos um atributo como static, ele passa a não ser mais um atributo
	 * de cada objeto, e, sim um atributo da classe, a informação fica guardada pela
	 * a classe, não é mais individual para cada objeto
	*/
	private static int totalDeContas;

	public double getSaldo() {
		return this.saldo;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}

	// Construtor
	/*
	 * Para acessarmos um atributo estático, não usamos a palavra chave this, mas
	 * sim o nome da classe
	 */
	public Conta() {
		Conta.totalDeContas = Conta.totalDeContas + 1;
		// System.out.println("Construindo uma conta.");
	}

	// Construtor com argumentos
	public Conta(String titular) {
		this.titular = titular;
	}

	// Chamando outro construtor
	public Conta(int numero, String titular) {
		this(titular);// chama outro construtor que foi declarado acima
		this.numero = numero;
	}

	// Método
	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}

	public boolean saca(double quantidade) {
		if (quantidade > this.saldo + this.limite) {
			System.out.println(
					"Seu Limite para sacar é inferior ao seu saldo! Por gentileza faça um novo deposito para minha conta! :D");
			return false;
		} else {
			this.saldo = this.saldo - quantidade;
			return true;
		}
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}
	
	/*public abstract void atualiza(double taxa);*/

	/*
	 * public boolean sacaMoney(double valor) { if(this.saldo < valor) { return
	 * false; }else { this.saldo = this.saldo - valor; return true; } }
	 */

	/*
	 * public void saca(double valor) { if(valor > this.saldo) {
	 * System.out.println("Não posso sacar um valor maior que o saldo!"); }else {
	 * this.saldo = this.saldo - valor; } }
	 */

	/*
	 * public double calculaRendimento() { this.saldo = this.saldo * 0.1; return
	 * saldo; }
	 */

	/*
	 * public boolean transfere(Conta destino, double valor) { boolean retirou =
	 * this.sacaMoney(valor); if (retirou == false) { return false; }else {
	 * destino.deposita(valor); return true; } }
	 */

	/*
	 * public String recuperaDadosParaImpressao() { String dados = "Titular: " +
	 * this.titular; dados += "\nNúmero: " + this.numero; dados += "\nAgencia: " +
	 * this.agencia; dados += "\nDia: " + this.dataDeAbertura.dia; dados +=
	 * "\nMes: " + this.dataDeAbertura.mes; dados += "\nAno: " +
	 * this.dataDeAbertura.ano; dados += "\nSaldo: " + this.saldo; return dados; }
	 */

}
