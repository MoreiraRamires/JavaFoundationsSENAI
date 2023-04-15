package listaExercicios02;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner read = new Scanner(System.in);

		 
		double salarioMinimo,kiloWattsUsados, valorConta, valorContaDesconto;
		
		

		//100kw = 1/7 salarioMinimo
		

		//Receba salario minimo 
		
		System.out.printf("Qual valor do salario minimo?");
		salarioMinimo = read.nextDouble();
		
		
		double custo100KW = salarioMinimo /7;

		// quantos kw vc gastou ?
		
		
		System.out.printf("Quantos KiloWatts/Hora foram gastos?");

		kiloWattsUsados = read.nextDouble();
		
		valorConta = (kiloWattsUsados/100) * custo100KW;
		valorContaDesconto = valorConta * 0.9;
		
		System.out.println("O valor da susa conta é:" + valorConta);
		System.out.println("Quantos KiloWatts/Hora foram gastos?"+ valorContaDesconto);
		

		

		
	}

}
