package br.com.caelum;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import br.com.caelum.banco.conta.ContaCorrente;

/**
 * 
 * @author Israel
 *
 */
public class TestaCollections {

	public static void main(String[] args) {
		
		/*List lista = new ArrayList();
		lista.add("Manoel");
		lista.add("Joaquim");
		lista.add("Maria");*/
		
		ContaCorrente c1 = new ContaCorrente();
		c1.deposita(100);
		
		ContaCorrente c2 = new ContaCorrente();
		c2.deposita(100);
		
		ContaCorrente c3 = new ContaCorrente();
		c3.deposita(100);
		
		List<ContaCorrente> contas = new ArrayList<>();
		contas.add(c1);
		contas.add(c3);
		contas.add(c2);
		
		Collections.sort(contas);
		
		System.out.println(contas.size());
		
		for (int i = 0; i < contas.size(); i++) {
			ContaCorrente cc = (ContaCorrente) contas.get(i);
			System.out.println(cc.getSaldo());
		}
		
		List<ContaCorrente> cc = new ArrayList<>();
		cc.add(c1);
		cc.add(c2);
		cc.add(c3);
		
		System.out.println(cc.size());
		
		for(int i = 0; i < cc.size(); i++) {
			ContaCorrente contaCorrente = cc.get(i);
			System.out.println(contaCorrente.getSaldo());
		}
		
		List<String> lista = new ArrayList<>();
		lista.add("Marina");
		lista.add("Ciro Gomes");
		lista.add("Geraldo Alckmin");
		lista.add("Bolsonaro");
		lista.add("Tancredo Neves");
		
		// Repare que o toString de ArrayList foi sobrescrito
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
		
		/**
		 * A classe Collections traz uma grande quantidade de métodos estáticos úteis na manipulação de coleções
		 * 
		 * binarySearch(List, Object): Realiza uma busca binária por determinado elemento na lista ordenada 
		 * e retorna sua posição ou um número negativo, caso não encontrado.
		 * 
		 * max(Collection): Retorna o maior elemento da coleção.
		 * 
		 * min(Collection): Retorna o menor elemento da coleção
		 * 
		 * reverse(List): Inverte a lista
		 */
		
		// java.util.set
		
		/**
		 * Um conjunto é representado pela interface Set e tem como suas principais implementações as 
		 * classes HashSet, LinkedHashSet e TreeSet.
		 */
		Set<String> cargos = new HashSet<>();
		cargos.add("Gerente");
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secretária");
		cargos.add("Funcionário");
		cargos.add("Diretor");
		
		System.out.println(cargos);
		
		/**
		 * Percorrendo coleções
		 */
		Set<String> conjunto = new HashSet<>();
		conjunto.add("java");
		conjunto.add("vraptor");
		conjunto.add("scala");
		
		for(String palavra : conjunto) {
			System.out.println(palavra);
		}
		
		// java.util.iterator 
		
		/**
		 * A interface Iterator possui dois métodos principais: hasNext() (com retorno booleano), 
		 * indica se ainda existe um elemento a ser percorrido; next(), retorna o próximo objeto.
		 */
		Set<String> items = new HashSet<>();
		items.add("item 1");
		items.add("item 2");
		items.add("item 3");
		items.add("item 4");
		
		// retorna o iterator
		Iterator<String> i = items.iterator();
		while (i.hasNext()) {
			// recebe a palavra
			String palavra = i.next();
			System.out.println(palavra);
		}
		
		/**
		 * O while anterior só termina quando todos os elementos do conjunto forem percorridos, 
		 * isto é, quando o método hasNext mencionar que não existem mais itens.
		 */
		
		// java.util.map
		
		/**
		 * Muitas vezes queremos buscar rapidamente um objeto dado alguma informação sobre ele. 
		 * Um exemplo seria, dada a placa do carro, obter todos os dados do carro. 
		 * Poderíamos utilizar uma lista para isso e percorrer todos os seus elementos, mas isso pode 
		 * ser péssimo para a performance, mesmo para listas não muito grandes. Aqui entra o mapa.
		 * 
		 * Um mapa é composto por um conjunto de associações entre um objeto chave a um objeto valor.
		 * 
		 * O método put(Object, Object) da interface Map recebe a chave e o valor de uma nova associação.
		 * 
		 * Um mapa é muito usado para “indexar” objetos de acordo com determinado critério, para podermos 
		 * buscar esse objetos rapidamente.
		 * 
		 *  Suas principais implementações são o HashMap, o TreeMap e o Hashtable.
		 */
		ContaCorrente conta1 = new ContaCorrente();
		conta1.deposita(10000);
		
		ContaCorrente conta2 = new ContaCorrente();
		conta2.deposita(3000);
		
		// Cria o mapa
		Map<String, ContaCorrente> mapaDeContas = new HashMap<>();
		
		// Adiciona duas chaves e seus respectivos valores
		mapaDeContas.put("diretor", conta1);
		mapaDeContas.put("gerente", conta2);
		
		// Qual a conta do diretor? (sem casting)
		ContaCorrente contaDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDiretor.getSaldo());
		
		// Properties
		/**
		 * Um mapa importante é a tradicional classe Properties, que mapeia strings e é muito utilizada 
		 * para a configuração de aplicações.
		 * 
		 * A Properties possui, também, métodos para ler e gravar o mapeamento com base em um arquivo 
		 * texto, facilitando muito a sua persistência.
		 */
		Properties config = new Properties();
		
		config.setProperty("database.login", "scott");
		config.setProperty("database.password", "tiger");
		config.setProperty("database.url", "jdbc:mysql:/localhost/teste");
		
		String login = config.getProperty("database.login");
		String password = config.getProperty("database.password");
		String url = config.getProperty("database.url");
		try {
			DriverManager.getConnection(url, login, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// Equals e HashCode
		/**
		 * Muitas das coleções do java guardam os objetos dentro de tabelas de hash. 
		 * Essas tabelas são utilizadas para que a pesquisa de um objeto seja feita de maneira rápida.
		 */
		
		

	}

}
