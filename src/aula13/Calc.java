package aula13;

import java.util.Scanner;

public class Calc {

	private double number01;
	private double number02;
	private double total;	

	
	Scanner scanner = new Scanner(System.in);
	
	
	public double getNumber01() {
		return number01;
	}
	
	
	public void setNumber01(double number01) {
		this.number01 = number01;
	}
	
	public double getNumber02() {
		return number02;
	}
	
	
	public void setNumber02(double number02) {
		this.number02 = number02;
	}
	

	

	
	public double Soma(double n1 ,double  n2) {
		total =  getNumber01()+ getNumber02();
		return total;
	}
	
	public double Subtracao(double n1 ,double  n2) {
		total = getNumber01()+getNumber02();
		return total;
	}
	
	public double getTotal() {
		return total;
	}
	
}
