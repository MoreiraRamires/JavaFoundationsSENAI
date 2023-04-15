package aula13;

import java.util.Scanner;

public class CalculadoraCientifica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calculo = new Calc();
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digite um valor");
		calculo.setNumber01(ler.nextDouble());
		
		System.out.println("Digite outro valor");
		calculo.setNumber02(ler.nextDouble());
		
		
		calculo.Soma(calculo.getNumber01(), calculo.getNumber02());
		System.out.println(calculo.getTotal());
		
	}

}
