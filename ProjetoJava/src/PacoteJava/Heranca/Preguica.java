package PacoteJava;

public class Preguica extends Animal {

	/* Enunciado: Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
	comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
	características de forma que tudo o que for comum a todos os animais fique na classe
	Animal */
	
	public Preguica(String nome, int idade, boolean emitindoSom) {
		super(nome, idade, emitindoSom);
	}
	
	public void subirArvores() {
		System.out.println("Subindo nas árvores...");
	}
	
	public void emitirSom() {
		System.out.println("Emitindo som de preguiça....");
		super.setEmitindoSom(true);
	}
}