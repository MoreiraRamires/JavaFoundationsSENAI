package aula_04;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class OperadoresAritimeticos {

	public static void main(String[] args) {

		
		int soma;
		int subtracao;
		int multiplicacao;
		double divisao;
		
		

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Idade Rafael :");
		int input01 = leia.nextInt();
		System.out.print("Idade PH:");
		int input02 = leia.nextInt();
		
		soma = input01 + input02;
		subtracao = input01 - input02;
		multiplicacao = input01 * input02;
		divisao = input01 / input02;

		


		
		System.out.println("Resultado da soma é : "+soma);
		System.out.println("Resultado da subtracao é : "+subtracao);
		System.out.println("Resultado da multiplicacao é : "+multiplicacao);
		System.out.println("Resultado da divisao é : "+divisao);

		
	}

}
