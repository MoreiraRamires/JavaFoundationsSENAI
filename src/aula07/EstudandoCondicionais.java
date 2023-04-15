package aula07;

import java.util.Scanner;

public class EstudandoCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		double altura;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a idade da candidata");
		idade = scanner.nextInt();
		
		System.out.println("Digite a altura da candidata");
		altura = scanner.nextDouble();
		
		
		
		if(idade == 15 && altura==1.70) {
			System.out.println("Aprovada");
			return;
		}

		
		System.out.println("Reprovado");
		
		

		
		
		
		
		
	}

}
