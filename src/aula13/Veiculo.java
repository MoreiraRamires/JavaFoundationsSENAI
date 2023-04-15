package aula13;

public class Veiculo {
	String marca;
	String modelo;
	boolean ligado;
	
	
	public void ligar() {
		ligado = true;
		System.out.println("Seu carro está ligado");
	}
	
	public void deligar() {
		ligado = false;
		System.out.println("Faiooo.... seu carro está desligado");

	}
	
	
}
