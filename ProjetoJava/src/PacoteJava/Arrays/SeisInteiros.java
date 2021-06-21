package PacoteJava;

import java.util.Scanner;

public class SeisInteiros {

	public static void main(String[] args) {
		int[] vetor = new int[6];
		int somaPares=0, quantidadeImpares=0;
		Scanner ler = new Scanner(System.in);
		for(int i=0; i<6; i++) {
			System.out.print("Digite a posição "+(i+1)+" da lista: ");
			vetor[i] = ler.nextInt();
			if(vetor[i]%2==0) {
				somaPares += vetor[i];
				System.out.println("\nO número digitado foi: "+vetor[i]+". E esse número é par!");
			}
			else {
				quantidadeImpares++;
				System.out.println("\nO número digitado foi: "+vetor[i]+". E esse número é ímpar!");
			}
			
		}
		System.out.println("\nA soma dos números pares digitados é de "+somaPares);
		System.out.println("A quantidade total de números ímpares digitados é de "+quantidadeImpares);
	}
}