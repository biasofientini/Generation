package PacoteJava;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		float nota1, nota2, nota3, media;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informa a primeira nota do aluno(a): ");
		nota1 = ler.nextFloat();
		System.out.println("Informa a segunda nota do aluno(a): ");
		nota2 = ler.nextFloat();
		System.out.println("Informa a terceira nota do aluno(a): ");
		nota3 = ler.nextFloat();
		media = ((2*nota1)+(3*nota2)+(5*nota3))/10;
		System.out.printf("\nA média das notas informadas é de %2.2f", media);
	}

}
