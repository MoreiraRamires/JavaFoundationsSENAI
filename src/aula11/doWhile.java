package aula11;

import java.util.Arrays;
import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horas,minutos,segundos;
		
		for (horas = 0; horas < 24; horas++) {
			for (minutos = 0; minutos < 60; minutos++) {
					for (segundos = 0; segundos <60; segundos++) {
						
						
						try {
							Thread.sleep(100);
							
						} catch (Exception e) {
							e.toString();
						}
						System.out.println(horas+"H: "+minutos+" MIN: "+segundos+"S: ");

					}
				
			}
			
		}
	
	
	}
		
	}

	
	
	


