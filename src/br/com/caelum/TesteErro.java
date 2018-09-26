package br.com.caelum;

public class TesteErro {

	public static void main(String[] args) {		
		System.out.println("Início do main");
		try {
			metodo1();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("err: " + e);
		}		
		System.out.println("Fim do main");
	}
	
	static void metodo1() {
		System.out.println("Inicio do método1");
		metodo2();
		System.out.println("Fim do método");	
	}
	
	static void metodo2() {
		System.out.println("Inicio do método2");
		int[] array = new int[10];
		
		for(int i=0; i <= 15; i++ ) {
			array[i] = i;
				System.out.println(i);
		}		
		System.out.println("Fim do método2");
	}

}
