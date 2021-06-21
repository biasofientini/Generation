package PacoteJava;

import java.util.Scanner;

public class CustoCons {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int porcentagem=28, impostos=45;
		float custo, custofab;
		System.out.println("Informe o valor do custo de fábrica: ");
		custofab = ler.nextFloat();
		custo = (((custofab*porcentagem)/100)+((custofab*impostos)/100))+custofab;
		System.out.printf("\nO custo do consumidor é de %2.2f",custo);
	}

}
