package aula14;

import java.sql.Time;
import java.util.Iterator;
import java.util.Scanner;

public class BombaAgua {

	boolean status;
	int seconds;
	
	Scanner scanner = new Scanner(System.in);
	
	public int getSeconds() {
		return seconds;
	}
	
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	private boolean getStatus() {
		return status;

	}
	
	
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	public void timer(int seconds) {
		
		
		
		for (int i = seconds; i > 0; i--) {
			System.out.println("A maquina desligara em " + i + "segundos");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		desligar();
	}
	
	public void ligar() {
		setStatus(true);
		System.out.println("Maquina ligou...");
		System.out.println("Quantos segundos a maquina deve ficar ligada?");
		timer(scanner.nextInt());
		
	}
	
	public void desligar() {
		setStatus(false);
		System.out.println("Bomba desligou");

		
	};
	
	
	
	
	
}
