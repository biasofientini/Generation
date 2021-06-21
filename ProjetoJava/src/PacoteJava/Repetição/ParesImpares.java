package PacoteJava;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, pares=0, impares=0;
		for(int qtd=1; qtd<=10;qtd++) {
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			if(num%2==0) {pares++;}
			else {impares++;}
		}
		System.out.println("O total de números pares informados foi de "+pares);
		System.out.println("O total de números ímpares informados foi de "+impares);
	}
}
	
