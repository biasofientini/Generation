package PacoteJava;

public class TesteAnimal {

	public static void main(String[] args) {
		
		/* Enunciado: Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
		comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
		características de forma que tudo o que for comum a todos os animais fique na classe
		Animal */
		
		Cachorro c1 = new Cachorro("Cac", 3, false);
		Cavalo cv1 = new Cavalo("Cav", 4, false);
		Preguica p1 = new Preguica("Preg", 5, false);
		System.out.println("Cachorro está emitindo som? "+c1.isEmitindoSom());
		System.out.println("Cavalo está emitindo som? "+c1.isEmitindoSom());
		System.out.println("Preguiça está emitindo som? "+c1.isEmitindoSom());
		//emitindo sons
		c1.emitirSom();
		cv1.emitirSom();
		p1.emitirSom();
	}
}