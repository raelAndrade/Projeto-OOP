package br.com.caelum.model;

public class SistemaInterno {
	
	public void login(Autenticavel a) {
		int senha = 0;
		boolean ok = a.autentica(senha);
	}

}
