package PacoteJava;

public class Patinete {

	/* Enunciado: Crie uma classe patinete e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto patinete, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
	
	private String cor;
	private int tamanho;
	
	public Patinete(String cor, int tamanho) {
		this.setCor(cor);
		this.setTamanho(tamanho);
	}
	
	public void andar() {
		System.out.println("Andando...");
	}
	public void correr() {
		System.out.println("Correndo...");
	}
	public void parar() {
		System.out.println("Parando...");
	}
	public void status() {
		System.out.println("Seu patinete é da cor "+cor+" e possui tamanho de "+tamanho+" centímetros");
	}

	//cor
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	//tamanho
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}