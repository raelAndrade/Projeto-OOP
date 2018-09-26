package br.com.caelum.model;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(String message) {
		super(message);
	}
}
