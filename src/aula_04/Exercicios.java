package aula_04;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Calcular area do triangulo
		
		//A= b*h/2
			
		Scanner read = new Scanner(System.in);
		
		
		double base;
		double altura;
		
		System.out.print("Qual a base do triangulo?");
		base = read.nextDouble();
		System.out.print("Qual a altura do triangulo?");
		altura = read.nextDouble();
		
		
		System.out.print("A área do triangulo é ");
		double area = (base* altura)/2;
		
		System.out.println(area);
		
		
		// calcular velocidade media 
		
		
		
	}

}
