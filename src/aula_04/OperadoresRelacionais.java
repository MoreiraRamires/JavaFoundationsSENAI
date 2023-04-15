package aula_04;

import java.util.Scanner;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double idadePaulo;
		double idadeRafael;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Idade Paulo:");
		idadePaulo = leia.nextInt();
		System.out.println("Idade Rafael:");
		idadeRafael = leia.nextInt();

		
		boolean PauloMaisVelho = idadePaulo > idadeRafael;
		
		System.out.println("Idade do Paulo é maior que do Rafael?:" + PauloMaisVelho );

		
	}

}