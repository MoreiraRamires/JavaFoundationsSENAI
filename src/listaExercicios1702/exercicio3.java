package listaExercicios1702;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		4. Usando a classe Scanner para entrada de dados, elabore uma classe que receba a
//		nota de duas provas e de um trabalho. Calcule e mostre a média e o resultado final
//		(aprovado ou reprovado). Para calcular a média utilize a fórmula seguinte: média =
//		(nota da prova 1 + nota da prova 2 +nota do trabalho) / 3. Considere que a média
//		mínima para aprovação é 6.
		
		Scanner scanner = new Scanner(System.in);

		double prova01,prova02,trabalho,media;
		
		
		System.out.printf("Digite o Valor Prova 01 ");
		prova01 = scanner.nextDouble();
		
		System.out.printf("Digite o Valor Prova 02 ");
		prova02 = scanner.nextDouble();
		
		System.out.printf("Digite o Valor Trabalho ");
		
		trabalho = scanner.nextDouble();
		
		media = (prova01+prova02+trabalho)/3;
		
		
		
		if(media >= 6) {
			System.out.printf("Aprovado ");
		} else {
			System.out.printf("Reprovado");
		}
		


		

	}

}
