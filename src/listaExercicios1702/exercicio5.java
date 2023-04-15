package listaExercicios1702;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {


		String genero;
		int idade,tempoContribuicao,aposentarContribuicao,aposentarIdade;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual seu genero?");
		genero = scanner.next().toUpperCase();
		System.out.print("Qual sua idade?");
		idade = scanner.nextInt();	
		System.out.print("Quantos anos de contribuicao?");
		tempoContribuicao = scanner.nextInt();

		genero =genero.substring(0, 1);
		
		if(genero.equals("M")) {
			if(idade >= 65 || tempoContribuicao >= 35) {
				System.out.print("Voce já pode se aposentar");
			} else {
				aposentarContribuicao = 35 - tempoContribuicao;
				aposentarIdade = 65 - idade;
				
				System.out.printf("Para se aposentar por idade você precisa de %s anos /n",aposentarContribuicao);
				System.out.printf("Para se aposentar por idade você precisa de %s anos /n",aposentarIdade);

				
				System.out.printf("Para se aposentar por contribuicao você precisa de %s anos",aposentarContribuicao);

			}
			
		}  else if (genero.equals("F")){
			
			if(idade >= 60 || tempoContribuicao >= 30) {
				System.out.print("Voce já pode se aposentar");
			} else {
				aposentarContribuicao = 30 - tempoContribuicao;
				aposentarIdade = 60 - idade;
				
				System.out.printf("Para se aposentar por idade você precisa de %s anos /n",aposentarContribuicao);
				System.out.printf("Para se aposentar por idade você precisa de %s anos /n",aposentarIdade);

				
				System.out.printf("Para se aposentar por contribuicao você precisa de %s anos",aposentarContribuicao);

			}
		}
		
		else {
			System.out.print("Genero não reconhecido. Tente novamente.");
			

		}
		

	}

}
