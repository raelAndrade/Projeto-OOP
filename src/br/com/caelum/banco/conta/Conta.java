package br.com.caelum.banco.conta;

import br.com.caelum.exception.SaldoInsuficienteException;
import br.com.caelum.exception.ValorInvalidoException;

public class Conta {
// public abstract class Conta {

	private String titular;
	private double saldo;
	private double limite;
	protected int numero;

	// public Cliente titular = new Cliente();
	// public Data dataDeAbertura;
	// public int numero;
	// public String agencia;
	// public String titularConta;
	// public String dataDeAbertura;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

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
	
	public Conta (double saldo) {
		this.saldo = saldo;
	}
	
	// Método toString
	public String toString() {
		return "Uma conta com valor: " + this.saldo;
	}
	
	/**
	 * O equals recebe um Object como argumento e deve vericar se ele mesmo é igual ao Object 
	 * recebido para retornar um boolean. Se você não reescrever esse método, o comportamento 
	 * herdado é fazer um == com o objeto recebido como argumento.
	 * 
	 * Seria correto, então, reescrever este método, fazendo as comparações dos atributos, e o 
	 * usuário passaria a invocar equals em vez de comparar com ==
	 * 
	 * Pelo contrato definido pela classe Object devemos retornar false também no caso do objeto
	 * passado não ser de tipo compatível com a sua classe. Então antes de fazer o casting devemos
	 * vericar isso, e para tal usamos a palavra chave instanceof, ou teríamos uma exception sendo
	 * lançada.
	 */
	
	/*public boolean equals(Object object) {		
		if (!(object instanceof Conta)) 
			return false;
		Conta outraConta = (Conta) object;
		return this.saldo == outraConta.saldo;
	}*/
	
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero;
	}
	
	/**
	 * O método hashCode() anda de mãos dadas com o método equals() e é de fundamental entendimento 
	 * no caso de você utilizar suas classes com estruturas de dados que usam tabelas de espalhamento.	 * 
	 */

	// Método
	
	public void deposita(double valor) {
		synchronized (this) {
			double novoSaldo = this.saldo + valor;
			this.saldo = novoSaldo;
			
			/*if(valor < 0) {
				throw new ValorInvalidoException(valor);	
			}else {
				this.saldo += valor - 0.10;
			}*/
		}
	}
	
	/*public void deposita(double quantidade) {
		this.saldo += quantidade;
	}*/

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo Insuficiente, tente um valor menor");
			//throw new RuntimeException();
		} else {
			this.saldo -= valor;
		}
	}
	
	/**
	 * A palavra chave synchronized dá essa característica a um bloco de código e recebe qual é o objeto 
	 * que será usado como chave. A chave só é devolvida no momento em que a Thread que tinha essa chave sair 
	 * do bloco, seja por return ou disparo de uma exceção (ou ainda na utilização do método wait()).
	 * 
	 * @param taxa
	 */
	public void atualiza(double taxa) {
		synchronized (this) {
			double saldoAtualizado = this.saldo * (1 + taxa);
			this.saldo = saldoAtualizado;
			//this.saldo += this.saldo * taxa;
		}
	}

	/*
	 * public boolean saca(double quantidade) { if (quantidade > this.saldo +
	 * this.limite) { System.out.println(
	 * "Seu Limite para sacar é inferior ao seu saldo! Por gentileza faça um novo deposito para minha conta! :D"
	 * ); return false; } else { this.saldo = this.saldo - quantidade; return true;
	 * } }
	 */

	/* public abstract void atualiza(double taxa); */

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
