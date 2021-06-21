package PacoteJava;

import java.util.Scanner;

public class DistanciaPontos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double x1, y1, x2, y2, d;
		System.out.println("Digite o valor da coordenada 'x' do primeiro ponto: ");
		x1 = ler.nextFloat();
		System.out.println("Digite o valor da coordenada 'y' do primeiro ponto: ");
		y1 = ler.nextFloat();
		System.out.println("Digite o valor da coordenada 'x' do segundo ponto: ");
		x2 = ler.nextFloat();
		System.out.println("Digite o valor da coordenada 'y' do segundo ponto: ");
		y2 = ler.nextFloat();
		d = Math.sqrt(Math.pow(x2-x1, 2.0)+Math.pow(y2-y1, 2.0));
		System.out.println("\nA distância entre os pontos informados é de "+d);
	}

}
