package aula14;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class GPS {
	private String idioma;
	private String rota;

	
	public GPS() {
		
	}
	
	public GPS(String idioma, String rota) {
		this.idioma = idioma;
		this.rota = rota;
		
		
	}

	public String getIdioma() {
		return idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public String getRota() {
		return rota;
	}
	
	public void setRota(String rota) {
		this.rota = rota;
	}
	
	
	public void selectIdioma() {
		int codeIdioma;
		String idioma;
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("Qual idioma do programa?");
		System.out.println("=========================");
		System.out.println("Digite 0 para Portugues");
		System.out.println("Digite 1 para Ingles");
		System.out.println("Digite 2 para Espanhol");
		System.out.println("Digite 3 para Chines");
		System.out.println("=========================");
		
		codeIdioma = scanner.nextInt();
				
				
		switch(codeIdioma) {
		case 0:
			
			System.out.println("Voce definiu o Portugues");
			setIdioma("Portugues");
			
			break;
		case 1:
			System.out.println("Voce definiu o Ingles");
			setIdioma("Ingles");
			break;
		case 2:
			System.out.println("Voce definiu o Espanhol");
			setIdioma("Espanhol");
			break;
		case 3:
			System.out.println("Voce definiu o Chines");
			setIdioma("Chines");
			break;
		default:
			System.out.println("Idioma invalido");
			selectIdioma();
			;
			break;
		}
		
		
	
		
		

	}

	public void definaRota() {
		String destino;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um destino rota");
		destino = scanner.next();
		
		System.out.println("Calculando Rota...");
		try {
			Thread.sleep(3000);
			System.out.println("Estamos prontos! ");
			System.out.println("Vamos para  "+destino);
			setRota(destino);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void mostrar () {
		System.out.println(idioma);
		System.out.println(rota);

	}
}
