package PacoteJava;

import java.util.Scanner;

public class MatrizMaiorDez {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int maiorDez=0;
		Scanner ler = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("Digite o valor para o elemento de linha "+(i+1)+" e coluna "+(j+1)+" da sua matriz: ");
				matriz[i][j] = ler.nextInt();
				if(matriz[i][j]>10) {maiorDez++;}
			}
		}
		System.out.println("\nA quantidade de valores maiores do que dez informados para a matriz foi de: "+maiorDez);
	}
}