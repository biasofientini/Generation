package PacoteJava;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2, num3, primeiro=0, segundo=0, terceiro=0;
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = ler.nextInt();
		System.out.println("Digite o terceiro número: ");
		num3 = ler.nextInt();
		if(num1>num2 && num1>num3) {
			terceiro = num1;
			if(num2>num3) {
				segundo = num2;
				primeiro = num3;
			}
			else {
				segundo = num3;
				primeiro = num2;
			}
		}
		else if(num2>num1 && num2>num3) {
			terceiro = num2;
			if(num1>num3) {
				segundo = num1;
				primeiro = num3;
			}
			else {
				segundo = num3;
				primeiro = num1;
			}
		}
		if(num3>num2 && num3>num1) {
			terceiro = num3;
			if(num2>num1) {
				segundo = num2;
				primeiro = num1;
			}
			else {
				segundo = num1;
				primeiro = num2;
			}
		}
		System.out.println("\nColocando os números informados em ordem crescente: "+primeiro+" ,"+segundo+" ,"+terceiro);
	}

}

