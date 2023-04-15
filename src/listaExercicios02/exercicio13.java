package listaExercicios02;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n1,n2,n3,n4,mediaPonderada;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Valor 001");

		n1 = read.nextInt() * 1;
		System.out.println("Valor 02");

		n2 = read.nextInt() * 2;
		
		System.out.println("Valor 03");

		n3 = read.nextInt() * 3;
		
		System.out.println("Valor 04");

		n4 = read.nextInt() * 4;
		
		System.out.println("Media ponderada: ");
		mediaPonderada = (n1+n2+n3+n4)/10;

		System.out.println(mediaPonderada);
		

	

		
	}

}
