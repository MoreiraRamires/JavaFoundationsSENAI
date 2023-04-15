package aula06;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EstudandoClassesRandom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		
		List<String>options = Arrays.asList("opcao01","opcao02","opcao03","opcao04");
		String chance = options.get(random.nextInt(options.size()));
		
		
		
		
	}

}
