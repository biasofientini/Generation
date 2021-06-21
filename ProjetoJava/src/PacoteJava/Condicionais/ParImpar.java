package PacoteJava;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		double raiz, quadrado;
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		if(num%2==0) {
			raiz = Math.sqrt(num);
			System.out.println("O número informado é um número par! E sua raiz quadrada é: "+raiz);
		}
		else {
			quadrado = Math.pow(num, 2.0);
			System.out.println("O número informado é um número ímpar! E seu quadrado é: "+quadrado);
		}
		
	}

}
