package PacoteJava;

public class Animal {

	/* Enunciado: Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
	comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
	características de forma que tudo o que for comum a todos os animais fique na classe
	Animal */
	
	private String nome;
	private int idade;
	private boolean emitindoSom;
	
	public Animal(String nome, int idade, boolean emitindoSom) {
		super();
		this.setNome(nome);
		this.setIdade(idade);
		this.setEmitindoSom(emitindoSom);
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
	
	//emitindoSom
	public boolean isEmitindoSom() {
		return emitindoSom;
	}

	public void setEmitindoSom(boolean emitindoSom) {
		this.emitindoSom = emitindoSom;
	}	
}