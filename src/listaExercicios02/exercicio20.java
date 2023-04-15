package listaExercicios02;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a,b,c,auxiliar;
		Scanner read = new Scanner(System.in);

		
		System.out.println("Digite 3  numero desejado");
		a = read.nextLine().charAt(0);
		b = read.nextLine().charAt(0);
		c = read.nextLine().charAt(0);

		System.out.println(a+""+b+""+c);
		auxiliar = a;
		a = c;
		c = auxiliar;
		
		
		System.out.print(a+""+b+""+c);

		
		

		
		


		
	}

}
