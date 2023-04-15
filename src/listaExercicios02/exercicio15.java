package listaExercicios02;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		
		double sin,cos,tan,a;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the number ");

		a = read.nextInt();
		
		sin = Math.sin(a);
		cos = Math.cos(a);
		tan = Math.tan(a);

		
		System.out.println("Seno  " + sin);
		System.out.println("Coseno  " + cos);
		System.out.println("Tangente  " + tan);


		
	}

}
