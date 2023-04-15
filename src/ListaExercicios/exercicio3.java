package ListaExercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double saldo,saldoReajuste;
		
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o saldo");

		saldo= read.nextDouble();
		saldoReajuste = saldo * 1.01;
		
		
		System.out.println(saldo);
		
		System.out.println("O saldo reajustado em 1% é");

		System.out.println(saldoReajuste);

		
		

		
	}

}
