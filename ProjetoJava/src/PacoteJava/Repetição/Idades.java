package PacoteJava;

import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, m21=0, m50=0;
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		while(idade!=-99) {
			if(idade<21) {m21++;}
			else if(idade>50){m50++;}
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
		}
		System.out.println("O total de pessoa com idade inferior a 21 anos é de "+m21);
		System.out.println("O total de pessoa com idade superior a 50 anos é de "+m50);
	}

}