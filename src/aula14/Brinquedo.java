package aula14;

public class Brinquedo {
	private String nome;
	private String faixaEtaria;
	private double preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	public String getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Brinquedo() {
		
	}
	
	public Brinquedo(String nome) {
		this.nome = nome;
	}
	
	public Brinquedo(String nome, String faixaEtaria, double preco) {
		this.nome = nome;
		this.faixaEtaria =faixaEtaria;
		this.preco = preco;
		
	}
	
	public void mostrar() {
		
		if( getFaixaEtaria() == null) {
			setFaixaEtaria("Indefinido a idade");
		}
		
		
		
	
		
		System.out.println(getNome());
		System.out.println(getFaixaEtaria());
		System.out.println(getPreco());
		
	}

}
