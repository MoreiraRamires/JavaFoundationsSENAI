package aula11;

import java.util.Scanner;

public class EstudandoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PergunteDiaSemana();
		
	}

	public static void PergunteDiaSemana() {
		
		int diaSemana;
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Qual dia da semana? ");
		
		diaSemana = scanner.nextInt();
		
		
		switch (diaSemana) {
		case 1:
			System.out.println("Hoje é domingo");
			break;
		case 2:
			System.out.println("Hojee é segunda-feira");
		case 3:
			System.out.println("Hojee é terca-feira");
		case 4:
			System.out.println("Hojee é quarta-feira");
		case 5:
			System.out.println("Hojee é quinta-feira");
		case 6:
			System.out.println("Hojee é sexta-feira");
		case 7:
			System.out.println("Hojee é sabadou");
			
		default: 
			System.out.println("Dia da semana invalido");
			PergunteDiaSemanaAgain();
			break;
		}
	}
	
	
	public static void PergunteDiaSemanaAgain() {
		System.out.println("==============VAMOS NOVAMENTE=============");
		PergunteDiaSemana();
	}
	
}
