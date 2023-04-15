package ListaExercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
		//calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
		//(1SM=R$788,00)
		
		double salarioUsuario,umSalarioMinimo = 788.00, salarioMinimosRecebidos;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite seu salário: ");
		salarioUsuario = read.nextDouble();
		
		
		
		salarioMinimosRecebidos = salarioUsuario/umSalarioMinimo;
		
		
		System.out.printf("Voce ganha %s Salarios Minimos \n ",salarioMinimosRecebidos );

		
		
	}

}
