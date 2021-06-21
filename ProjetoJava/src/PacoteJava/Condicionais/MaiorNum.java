package PacoteJava;

import java.util.Scanner;

public class MaiorNum {

	public static void main(String[] args) {
		int num1, num2, num3, maior;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = ler.nextInt();
		System.out.println("Digite o terceiro número: ");
		num3 = ler.nextInt();
		if(num1>num2 && num1>num3) {
			maior = num1;
		}
		else if(num2>num1 && num2>num3) {
			maior = num2;
		}
		else {
			maior = num3;
		}
		System.out.println("\nO maior número informado foi "+maior);
	}

}
