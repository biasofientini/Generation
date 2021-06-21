package PacoteJava;

import java.util.Scanner;

public class AteZero {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, soma=0;
		do {
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			soma += num;
		}
		while(num != 0);
		System.out.println("A soma dos valores inseridos diferentes de zero foi de "+soma);
	}

}