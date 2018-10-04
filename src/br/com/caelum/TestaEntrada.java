package br.com.caelum;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntrada {

	/**
	 * @author Israel Andrade
	 * InputStream, InputStreamReader e BufferedReader
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		/**
		 * A classe InputStream é abstrata e FileInputStream uma de suas lhas concretas. FileInputStream vai 
		 * procurar o arquivo no diretório em que a JVM fora invocada (no caso do Eclipse, vai ser a partir de dentro 
		 * do diretório do projeto). Alternativamente você pode usar um caminho absoluto.
		 */
		InputStream is = new FileInputStream("arquivo.txt");
		//int b = is.read();
		
		/**
		 * InputStreamReader é lha da classe abstrata Reader, que possui diversas outras lhas - são classes que manipulam chars.
		 */
		InputStreamReader isr = new InputStreamReader(is);
		//int c = isr.read();
		
		/**
		 * A classe BufferedReader é um Reader que recebe outro Reader pelo construtor e concatena os
		 * diversos chars para formar uma String através do método readLine:
		 */
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine(); // Primeira linha
		
		/**
		 * Esse padrão de composição é bastante utilizado e conhecido. É o Decorator Pattern.
		 */
		while(s != null) {
			System.out.println(s);
			s = br.readLine();
		}
		
		br.close();
		

	}

}
