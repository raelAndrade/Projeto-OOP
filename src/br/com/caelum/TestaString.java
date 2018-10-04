package br.com.caelum;

public class TestaString {

	public static void main(String[] args) {
		
		String x = new String("fj11");
		String y = new String("fj11");
		if (x == y) {
			System.out.println("Referência para o mesmo objeto");
		}else {
			System.out.println("Referência para objetos diferentes");
		}
		
		if(x.equals(y)) {
			System.out.println("Consideramos iguais no critério de igualdade");
		}else {
			System.out.println("Consideramos diferentes no critério de igualdade");
		}
		
		int total = 5;
		System.out.println("O total gasto é: " + total);
		
		/**
		 * A classe String conta também com um método split, que divide a String em um array de Strings, 
		 * dado determinado critério.
		 */
		String frase = "Java é demais";
		String palavras[] = frase.split(" ");
		
		/**
		 * Se quisermos comparar duas Strings, utilizamos o método compareTo, que recebe uma String como argumento 
		 * e devolve um inteiro indicando se a String vem antes, é igual ou vem depois da String recebida. 
		 * Se forem iguais, é devolvido 0; se for anterior à String do argumento, devolve um inteiro negativo; 
		 * e, se for posterior, um inteiro positivo.
		 */
		String str1 = "Abacaxi";
		String str2 = "Banana";
		int comp = str1.compareTo(str2);
		if(comp < 0) {
		  System.out.println("A str1 é menor que str2");
		} else if(comp > 0) {
		  System.out.println("A str1 é maior que str2");
		} else {
		  System.out.println("A str1 e str2 são iguais");
		}
		
		String palavra = "fj11";
		String outro = palavra.toUpperCase();
		System.out.println(outro);
		
		String palavra1 = "fj11";
		palavra1 = palavra1.toUpperCase();
		System.out.println(palavra1);
		
		String palavra2 = "fj11";
		palavra2 = palavra2.toUpperCase();
		palavra2 = palavra2.replace("1", "2");
		System.out.println(palavra2);
		
		String palavra3 = "fj11";
		palavra3 = palavra3.toUpperCase().replace("1", "2");
		System.out.println(palavra3);
		
		String s = "fj11";
		s = s.replaceAll("1", "2");
		System.out.println(s);
		
		String sb = "Socorram-me, subi no ônibus em Marrocos";
		StringBuffer sb1 = new StringBuffer(sb);
		sb1.reverse();
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer(sb);
		System.out.println(sb);
		
		/**
		 * O método charAt(i), retorna o caractere existente na posição i da String
		 * 
		 * O método length retorna o número de caracteres na mesma
		 * 
		 * O método substring que recebe um int e devolve a SubString a partir da posição passada por aquele int
		 * 
		 * O indexOf recebe um char ou uma String e devolve o índice em que aparece pela primeira vez na 
		 * 	String principal (há também o lastIndexOf que devolve o índice da última ocorrência)
		 * 
		 * O toUpperCase e o toLowerCase devolvem uma nova String toda em maiúscula e toda em minúscula, respectivamente.
		 * 
		 * O método isEmpty, que devolve true se a String for vazia ou false caso contrário.
		 * 
		 * Alguns métodos úteis para buscas são o contains e o matches.
		 * 
		 * No caso de você trabalhar muito com a manipulação de uma mesma String (por exemplo, dentro de um laço), 
		 * 	o ideal é utilizar a classe StringBuffer. A classe StringBuffer representa uma sequência de caracteres. 
		 * 	Diferentemente da String, ela é mutável, e não possui aquele pool.
		 *  
		 */

	}

}
