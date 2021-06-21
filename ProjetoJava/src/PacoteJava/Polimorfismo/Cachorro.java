package PacoteJava;

public class Cachorro extends Animal {
	
	/* Enunciado: Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
	comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
	características de forma que tudo o que for comum a todos os animais fique na classe
	Animal */
	
	public Cachorro(String nome, int idade, boolean emitindoSom) {
		super(nome, idade, emitindoSom);
	}

	@Override
	public void acao(String acao) {
		System.out.println("O cachorro está "+acao+"...");
	}
	@Override
	public void emitirSom(String som) {
		System.out.println("Emitindo som de cachorro: "+som);
	}

	
}