package PacoteJava;

import java.util.Scanner;

public class CaracPsico {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int pessoas=0, idade, sexo, opcoes, calmos=0, mnervosas=0, hagressivos=0, ocalmos=0, nervosos40=0, calmos18=0;
		while(pessoas!=150) {
			System.out.println("Digite a sua idade: ");
			idade = ler.nextInt();
			System.out.println("Informe seu sexo: " + "\n[1] Feminino" + "\n[2] Masculino" + "\n[3] Outros");
			sexo = ler.nextInt();
			System.out.println("Escolha uma opção: " + "\n[1] Me considero uma pessoa calma" + "\n[2] Me considero uma pessoa nervosa" + "\n[3] Me considero uma pessoa agressiva");
			opcoes = ler.nextInt();
			if(opcoes==1) {calmos++;}
			else if(sexo==1 && opcoes==2) {mnervosas++;}
			else if(sexo==2 && opcoes==3) {hagressivos++;}
			else if(sexo==3 && opcoes==1) {ocalmos++;}
			else if(idade>40 && opcoes==2) {nervosos40++;}
			else if(idade<18 && opcoes==1) {calmos18++;}
			pessoas++;
		}
		System.out.println("O número total de pessoas calmas é de "+calmos);
		System.out.println("O número total de mulheres nervosas é de "+mnervosas);
		System.out.println("O número total de homens agressivos é de "+hagressivos);
		System.out.println("O número total de outros calmos é de "+ocalmos);
		System.out.println("O número total de pessoas com idade superior a 40 anos que são nervosas é de "+nervosos40);
		System.out.println("O número total de pessoas com idade inferior a 18 anos que são calmas é de "+calmos18);
	}

}