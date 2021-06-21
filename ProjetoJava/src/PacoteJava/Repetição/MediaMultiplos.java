package PacoteJava;

import java.util.Scanner;

public class MediaMultiplos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		float media, multiplos=0, qtdmultiplos=-1;
		do {
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			if(num%3==0) {
				multiplos+=num;
				qtdmultiplos++;
			}
		}
		while(num!=0);
		media = multiplos/qtdmultiplos;
		System.out.printf("\nA média dos números que são múltiplos de 3 informados é de %2.2f",media);
	}

}