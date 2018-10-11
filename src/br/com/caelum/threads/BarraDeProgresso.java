package br.com.caelum.threads;

public class BarraDeProgresso implements Runnable{

	public void rodar() {
		
	}

	/**
	 * Esse contrato existe e é feito pela interface Runnable: devemos dizer que nossa classe é “executável” 
	 * e que segue esse contrato. Na interface Runnable, há apenas um método chamado run. Basta implementá-lo, 
	 * “assinar” o contrato e a classe Thread já saberá executar nossa classe.
	 * 
	 * A classe Thread recebe no construtor um objeto que é um Runnable, e seu método start chama o método
	 * run da nossa classe. Repare que a classe Thread não sabe qual é o tipo especíco da nossa classe; 
	 * para ela, basta saber que a classe segue o contrato estabelecido e possui o método run.
	 */
	@Override
	public void run() {
				
	}
}
