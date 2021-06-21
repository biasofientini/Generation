package PacoteJava;

import java.util.Scanner;

public class EntradaSaida {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, soma;
		System.out.println("Forneça o primeiro valor: ");
		a = ler.nextInt();
		System.out.println("Forneça o segundo valor: ");
		b = ler.nextInt();
		soma = a+b;
		System.out.println("A soma dos valores informados é de: "+soma);
	}
}
