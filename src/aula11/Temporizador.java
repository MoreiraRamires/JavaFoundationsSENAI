package aula11;

import java.util.Arrays;
import java.util.Scanner;

public class Temporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				
		try {
			int count = 10;
			while (count>0) {
				Thread.sleep(1000);
				
				System.out.println(count);
				count --;
				
			}
			
			System.out.println("Lancamento");
		
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}	
			
		
		
	}
}

	

	


