package aula11;

import java.util.Arrays;
import java.util.Scanner;

public class EstudandoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {88,150,1996,325,158,650} ;
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println("Digite o numero a ser somado");
		
		Arrays.sort(numeros);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		

		}
		
	}

	
	
	


