package br.com.caelum;

import br.com.caelum.javalangobject.GuardadorDeObjetos;

public class TestaIntegerClassesWrappers {

	public static void main(String[] args) {
		
		/**
		 * Cuidado! Usamos aqui o termo “transformar”, porém o que ocorre não é uma transformação entre 
		 * os tipos e sim uma forma de conseguirmos uma String dado um int e vice-versa. O jeito mais 
		 * simples de transformar um número em String é concatená-lo da seguinte maneira
		 */
		int i1 = 100;
		String s = "" + i1;
		System.out.println(s);
		
		double d2 = 1.2;
		String s2 = "" + d2;
		System.out.println(s2);
		
		/**
		 * Para formatar o número de uma maneira diferente, com vírgula e número de casas decimais 
		 * devemos utilizar outras classes de ajuda (NumberFormat, Formatter)
		 * 
		 * Para transformar a String s3 em um número inteiro utilizamos o método estático da classe Integer
		 */
		String s3 = "101";
		int i2 = Integer.parseInt(s3);
		System.out.println(i2);
		
		/**
		 * Essas classes também são muito utilizadas para fazer o wrapping (embrulho) de tipos 
		 * primitivos como objetos, pois referências e tipos primitivos são incompatíveis. Imagine 
		 * que precisamos passar como argumento um inteiro para o nosso guardador de objetos. 
		 * Um inteiro não é um Object, como fazer?
		 */
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		int i3 = 5;
		Integer x1 = new Integer(i3);
		guardador.adicionaObjeto(x1);
		System.out.println(guardador);
		
		/**
		 * E, dado um Integer, podemos pegar o int que está dentro dele (desembrulhá-lo)
		 */
		int i4 = 5;
		Integer x2 = new Integer(i4);
		int numeroDeVolta = x2.intValue();
		System.out.println("Convertento número: " + numeroDeVolta);
		
		/**
		 * O Java 5.0 em diante traz um recurso chamado de autoboxing, que faz isso sozinho para você, 
		 * custando legibilidade
		 */
		Integer x3 = 5;
		int y1 = x3;
		System.out.println(y1);
		
		/**
		 * Você pode fazer o autoboxing diretamente para Object também, possibilitando passar um tipo 
		 * primitivo para um método que receber Object como argumento
		 */
		Object o = 5;
		System.out.println(o);
		
	}

}
