package br.com.caelum.banco.conta;

import br.com.caelum.faculdade.EmpregadoDaFaculdade;

public class GeradorDeRelatorio {
	
	public void adiciona(EmpregadoDaFaculdade f) {
		System.out.println(f.getInfo());
		System.out.println(f.getGastos());
	}

}
