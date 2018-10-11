package br.com.caelum;

import br.com.caelum.banco.conta.ContaPoupanca;
import br.com.caelum.banco.conta.Contas;
import br.com.caelum.exception.ValorInvalidoException;

public class TestaDeposita {

	public static void main(String[] args) {
		Contas cp = (Contas) new ContaPoupanca();
		
		try {
			cp.deposita(-100);
		}catch(ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}

}
