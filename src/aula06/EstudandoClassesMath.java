package aula06;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EstudandoClassesMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
double base,expoente,resultado;
		
		Scanner read = new Scanner(System.in);
		
		
		System.out.println("Digite o valor da base");
		base = read.nextDouble();
		
		System.out.println("Digite o valor da expoente");
		expoente = read.nextDouble();
		
		
		resultado = Math.pow(base, expoente);
		System.out.println(resultado);
		
		
	}

}
