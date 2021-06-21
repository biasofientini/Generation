package PacoteJava;

import java.util.Scanner;

public class EqLineares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float a, b, c, d, e, f, x, y;
		System.out.println("Digite o valor do coeficiente 'a': ");
		a = ler.nextFloat();
		System.out.println("Digite o valor do coeficiente 'b': ");
		b = ler.nextFloat();
		System.out.println("Digite o valor do coeficiente 'c': ");
		c = ler.nextFloat();
		System.out.println("Digite o valor do coeficiente 'd': ");
		d = ler.nextFloat();
		System.out.println("Digite o valor do coeficiente 'e': ");
		e = ler.nextFloat();
		System.out.println("Digite o valor do coeficiente 'f': ");
		f = ler.nextFloat();
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		System.out.printf("\nO valor de x para o sistema informado é de %2.2f e o de y é de %2.2f", x, y);

	}

}
