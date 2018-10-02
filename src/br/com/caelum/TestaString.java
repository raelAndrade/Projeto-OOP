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

	}

}
