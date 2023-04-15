package aula11;

import java.util.Arrays;
import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int sum = 0;
	int number;
	Scanner scanner = new Scanner(System.in);
	
	while (true) {
		System.out.println("Digite um numero ou aperte 0 para sair ");
		number = scanner.nextInt();
		if(number == 0) {
			System.out.println("tks");
			break;

		}
		sum = sum + number;
		
	}
	System.out.println("soma e :" + sum);
	
	}
		
	}

	
	
	


