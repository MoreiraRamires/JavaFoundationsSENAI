package listaExercicios1702;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		3. O Imposto sobre a Transmissão de Bens Móveis (ITBI) é aplicado sobre o valor de
//		um imóvel a ser negociado. A base de cálculo do ITBI (o valor a ser considerado no
//		cálculo) será o maior valor entre o valor de transação (o valor negociado) e o valor
//		venal de referência (fornecido pela Prefeitura).
		
		//Com base nisso, elabore uma classe
//		que receba o valor da transação, o valor venal e o percentual de imposto. Após isso,
//		encontre o maior valor e aplique o percentual sobre ele. Ao final, apresente o valor do
//		imposto a ser pago. Observação: o valor do imposto a ser pago é calcula-
//		do por meio da fórmula: valor do imposto = maior valor * percentual / 100. Para
//		entrada e saída de dados utilize a classe Scanner. 
		
		Scanner scanner = new Scanner(System.in);

		double valorVenal,valorTransacao,percentualImposto,valorNegociado, valorImposto;
		System.out.printf("Digite o Valor Venal ");
		valorVenal = scanner.nextDouble();
		
		System.out.printf("Digite o Valor Transacao ");
		valorTransacao = scanner.nextDouble();
		
		System.out.printf("Digite o Valor Percentual do Imposto ");
		
		percentualImposto = scanner.nextDouble();
		
		
		if(valorVenal > valorTransacao) {
			valorNegociado = valorVenal;
		} else {
			valorNegociado = valorTransacao;
		}
		
		valorImposto = valorNegociado * percentualImposto/100;
		
		System.out.printf("O valor a ser negociado é " + valorNegociado);
		System.out.printf("O valor de imposto é  " + valorImposto);


		

	}

}
