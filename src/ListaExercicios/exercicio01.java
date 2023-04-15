package ListaExercicios;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1,n2,n3,n4,n5,media01,media02;
		
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite 5 numeros diferentes");

		n1= read.nextDouble();
		n2= read.nextDouble();
		n3= read.nextDouble();
		n4= read.nextDouble();
		n5= read.nextDouble();

		media01 = (n1+n2)/2;
		media02 = (n5+n3+n4)/3;
		
		
		System.out.println(media01);
		System.out.println(media02);

		
		

		
	}

}
