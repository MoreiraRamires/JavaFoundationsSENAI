package ListaExercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float percentualIPI;
		int codPeca01 = 33;
		double valorPeca01 = 50;
		int quantdadePeca01 = 10;
		int codPeca02 =77;
		double valorPeca02 =48.50;
		int quantdadePeca02 = 30;
		double resultado;
		String resultadoFormatado;

		
		
		
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		
		System.out.println("Digite o percentual desejado") ;

		percentualIPI = read.nextFloat()/100 + 1;
		resultado = (valorPeca01*quantdadePeca01 + valorPeca02*quantdadePeca02) * percentualIPI ;
		
		resultadoFormatado = df.format(resultado); 

		
		
		
		
		
		
		
		

		
	}

}
