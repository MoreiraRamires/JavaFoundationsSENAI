package aula07;

import java.util.Scanner;

public class EstudandoCondicionais4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor,valor2,total=0;
		String operacao;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor");
		valor = scanner.nextDouble();
		
		System.out.println("Digite o valor 2");
		valor2 = scanner.nextDouble();
		
		System.out.println("Digite a operação (+,-,* ou /");
		operacao = scanner.next();
		
		
		if(operacao.equals("+")){
			total = valor + valor2;
		} else if (operacao.equals("-")){
			total = valor - valor2;
		}else if (operacao.equals("*")){
			total = valor * valor2;
		} else if(operacao.equals("/")) {
			total = valor / valor2;
		} else if (operacao.equals("elevado")) {
			total = Math.pow(valor,valor2);
		}
		
			
		
		System.out.println("Total: "+total);
		

		
		
		
		
		
	}

}
