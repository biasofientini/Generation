package PacoteJava;

import java.util.Scanner;

public class Categoria {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Informe a idade da pessoa: ");
		idade = ler.nextInt();
		if(idade>=10 && idade<=14) {
			System.out.println("A categoria dessa pessoa é: Infantil");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("A categoria dessa pessoa é: Juvenil");
		}
		else {
			System.out.println("A categoria dessa pessoa é: Adulto");
		}

	}

}
