package PacoteJava;

import java.util.Scanner;

public class Expressao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c, r, s, d;
		System.out.println("Digite o primeiro valor: ");
		a = ler.nextFloat();
		System.out.println("Digite o segundo valor: ");
		b = ler.nextFloat();
		System.out.println("Digite o terceiro valor: ");
		c = ler.nextFloat();
		r = Math.pow(a+b, 2.0);
		s = Math.pow(b+c, 2.0);
		d = (s+r)/2;
		System.out.println("O resultado final da média aritmética das somas realizadas é de "+d);
	}

}
