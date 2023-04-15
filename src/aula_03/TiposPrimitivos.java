package aula_03;

import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String nome;
		int idade;
		String endereco;
		String email;

		
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite seu nome");
		
		nome = leia.next();
		
		System.out.print("Qual sua idade");
		idade = leia.nextInt();
		
		System.out.print("Qual seu email?");
		email=leia.next();
	
		
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(email);

		
		
		
		
	}

}
