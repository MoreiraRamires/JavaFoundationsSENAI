package aula14;

public class Motorista {

	public static void main(String[] args) {
		GPS waze = new GPS();
		
		waze.selectIdioma();
		waze.definaRota();
		waze.mostrar();
		
	
		//GPS googleMaps = new GPS("Portugues","Bar do Alemão");
		//googleMaps.mostrar();
	
	}

}
