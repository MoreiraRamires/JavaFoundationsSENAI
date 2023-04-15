package aula13;

import java.util.Scanner;

public class Calcular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		
		System.out.println("Digite o primeiro valor");
		calculadora.valor1 = scanner.nextDouble();
		System.out.println("Digite o segundo valor");
		calculadora.valor2 = scanner.nextDouble();
		
		
		calculadora.somar();

	}

}
