package aula06;

import java.util.Random;

public class EstudandoClassesRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		int numeroAleatorio = random.nextInt(6);
		System.out.print(numeroAleatorio);
		
		double chance = random.nextDouble();
		System.out.println(chance);
		
		

	}

}
