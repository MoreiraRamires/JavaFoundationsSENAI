package listaExercicios1702;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Usando a classe Scanner para entrada de dados, faça uma classe que receba dois
		//valores inteiros.O primeiro valor corresponde à quantidade de pontos do líder do
		//campeonato brasileiro de futebol. O segundo valor corresponde à quantidade de
		//pontos do time lanterna. Considerando que cada vitória vale 3 pontos, elabore uma
		//classe que calcule o número de vitórias necessárias para que o time lanterna alcance
		//(ou ultrapasse) o líder. Por exemplo, supondo que as quantidades de ponto fornecidas
		//sejam 40 e 22, então o número de vitórias apresentada na saída deverá ser 6, pois
		//(40-22) / 3 = 6.

		
		
		int   lider, lanterna,vitoriasNecessarias;
		
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Quantos pontos tem o líder? ");
		lider = scanner.nextInt();
		
		System.out.printf("Quantos pontos tem o lanterna? ");
		lanterna = scanner.nextInt();
		
		vitoriasNecessarias = (lider-lanterna)/3;
		
		
		System.out.printf("O lanterna precisa de  " + vitoriasNecessarias + " pontos");

	}

}
