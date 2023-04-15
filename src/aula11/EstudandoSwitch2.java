package aula11;

import java.util.Scanner;

public class EstudandoSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String operacao;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual a operacao?");
		operacao = scanner.next();
		
		switch (operacao) {
		case "+":
			soma();
			break;
		case "-":
			subtracao();
			break;
			
		case "*":
			multiplicacao();
			break;
		default:
			break;
		}
		
	}

	
public static void soma() {

	double valor1,valor2,total;
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.println("Qual o valor?");
	valor1 = scanner.nextInt();
	System.out.println("Qual o valor?");
	valor2 = scanner.nextInt();
	
	 
	total = valor1+valor2;
	
	System.out.println("O resultado da soma é " + total);

}

public static void subtracao() {

	double valor1,valor2,total;
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.println("Qual o valor?");
	valor1 = scanner.nextInt();
	System.out.println("Qual o valor?");
	valor2 = scanner.nextInt();
	
	 
	total = valor1-valor2;
	
	System.out.println("O resultado da soma é " + total);

}

public static void multiplicacao() {

	double valor1,valor2,total;
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.println("Qual o valor?");
	valor1 = scanner.nextInt();
	System.out.println("Qual o valor?");
	valor2 = scanner.nextInt();
	
	 
	total = valor1*valor2;
	
	System.out.println("O resultado da soma é " + total);

}

}


