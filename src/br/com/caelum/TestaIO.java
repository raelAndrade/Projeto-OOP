package br.com.caelum;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @author Israel Andrade
 */
public class TestaIO {

	public static void main(String[] args) throws IOException {
		
		/*InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Digite sua mensagem: ");
		String linha;
		try {
			linha = br.readLine();
			
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();

				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		/*InputStream is = new FileInputStream("arquivo.txt");
		Scanner entrada = new Scanner(is);
		//Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua mensagem: ");
		while(entrada.hasNextLine()) {
			System.out.println(entrada.nextLine());
		}
		entrada.close();*/
		
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
	
		Scanner entrada = new Scanner(System.in);
		while(entrada.hasNextLine()) {
			String linha = entrada.nextLine();
			bw.write(linha);
			bw.newLine();
		}
		bw.close();

	}

}
