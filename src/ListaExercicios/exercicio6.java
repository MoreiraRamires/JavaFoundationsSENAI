package ListaExercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		double numero,antecessor,sucessor;
		
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite seu numero: ");
		numero = read.nextDouble();
		
		antecessor = numero - 1;
		sucessor = numero + 1;
		

		System.out.println(antecessor);
		System.out.println(numero);
		System.out.println(sucessor);
		
	}

}
