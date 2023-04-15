package listaExercicios1702;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Usando a classe BufferedReader para entrada de dados, crie uma classe que
		//receba o valor de um produto e a porcentagem de desconto, calcule e mostre o valor
		//do desconto e o valor do produto com o desconto. Observação: o valor do desconto é
		//calculado por meio da fórmula: valor do desconto = valor do produto * percentual de
		//desconto / 100.

		
		
		double  produto,descontoPorcentagem, descontoProduto,valorDesconto;
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Qual preço do produto?");
		produto = scanner.nextDouble();
		
		System.out.printf("Qual o desconto que você quer aplicar?");
		descontoPorcentagem = scanner.nextDouble();
		
		valorDesconto = produto * (descontoPorcentagem)/100;
		
		descontoProduto = produto - valorDesconto;
		
		System.out.printf("O preço com desconto é :" + descontoProduto);

		
	}

}
