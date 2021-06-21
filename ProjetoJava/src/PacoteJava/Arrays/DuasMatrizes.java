package PacoteJava;

import java.util.Scanner;

public class DuasMatrizes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][] matriz1 = new int[2][2];
		int[][] matriz2 = new int[2][2];
		int[][] matriz3 = new int[2][2];
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println("Digite o valor do elemento de linha "+(i+1)+" e coluna "+(j+1)+" para a primeira matriz:");
				matriz1[i][j] = ler.nextInt();
			}
		}
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println("Digite o valor do elemento de linha "+(i+1)+" e coluna "+(j+1)+" para a segunda matriz:");
				matriz2[i][j] = ler.nextInt();
			}
		}
		int opcao, constante;
		System.out.println("Escolha uma opção: \n[1] Somar duas matrizes\n[2] Subtrair a primeira matriz da segunda\n[3] Adicionar uma constante às duas matrizes\n[4] Imprimir as matrizes");
		opcao = ler.nextInt();
		if(opcao==1) {
			for(int i=0; i<2; i++) {
				for(int j=0; j<2; j++) {
					matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
				}
			}
			System.out.println("Matriz resultante da soma das duas matrizes: ");
			for(int i=0; i<2; i++) {
				if(i==1) {System.out.print("\n");}
				for(int j=0; j<2; j++) {
					System.out.print("["+matriz3[i][j]+"]");
				}
			}
		}
		else if(opcao==2) {
			for(int i=0; i<2; i++) {
				for(int j=0; j<2; j++) {
					matriz3[i][j] = matriz1[i][j] - matriz2[i][j];
				}
			}
			System.out.println("Matriz resultante da diferença das duas matrizes: ");
			for(int i=0; i<2; i++) {
				if(i==1) {System.out.print("\n");}
				for(int j=0; j<2; j++) {
					System.out.print("["+matriz3[i][j]+"]");
				}
			}
		}
		else if(opcao==3) {
			System.out.println("Digite o valor desejado para a constante: ");
			constante = ler.nextInt();
			for(int i=0; i<2; i++) {
				for(int j=0; j<2; j++) {
					matriz1[i][j] += constante;
					matriz2[i][j] += constante;
				}
			}
			System.out.println("Matriz número um: ");
			for(int i=0; i<2; i++) {
				if(i==1) {System.out.print("\n");}
				for(int j=0; j<2; j++) {
					System.out.print("["+matriz1[i][j]+"]");
				}
			}
			System.out.println("\nMatriz número dois: ");
			for(int i=0; i<2; i++) {
				if(i==1) {System.out.print("\n");}
				for(int j=0; j<2; j++) {
					System.out.print("["+matriz2[i][j]+"]");
				}
			}
		}
		else {
			System.out.println("Matriz número um: ");
			for(int i=0; i<2; i++) {
				if(i==1) {System.out.print("\n");}
				for(int j=0; j<2; j++) {
					System.out.print("["+matriz1[i][j]+"]");
				}
			}
			System.out.println("\nMatriz número dois: ");
			for(int i=0; i<2; i++) {
				if(i==1) {System.out.print("\n");}
				for(int j=0; j<2; j++) {
					System.out.print("["+matriz2[i][j]+"]");
				}
			}
		}
	}

}