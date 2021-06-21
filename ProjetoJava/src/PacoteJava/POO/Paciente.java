package PacoteJava;

public class Paciente {

	/* Enunciado: Crie uma classe paciente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto paciente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
	
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	
	public Paciente(String nome, int idade, double peso, double altura) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setPeso(peso);
		this.setAltura(altura);
	}
	
	public void examinar() {
		System.out.println("Paciente examinado!");
	}
	public void medicar() {
		System.out.println("O paciente foi medicado com Benzetacil");
	}
	public void status() {
		System.out.println("O paciente "+nome+", de "+idade+" anos, "+peso+" kg e "+altura+" metros");
	}

	//nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	//idade
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	//peso
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	//altura
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
