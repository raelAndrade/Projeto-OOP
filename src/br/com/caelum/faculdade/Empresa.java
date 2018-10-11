package br.com.caelum.faculdade;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Israel
 *
 */
public class Empresa {

	/**
	 * Também declaramos atributos como List em vez de nos comprometer como uma ou outra implementação.
	 * Dessa forma obtemos um baixo acoplamento: podemos trocar a implementação, já que estamos programando 
	 * para a interface
	 */
	private List<Funcionario> empregados = new ArrayList<>();

}
