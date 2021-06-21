package PacoteJava;

import java.util.Scanner;

public class IdadeDias {

	public static void main(String[] args) {
		int idadeanos, idademeses, idadedias, idadef;
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe sua idade em anos: ");
		idadeanos = ler.nextInt();
		System.out.print("Informe sua idade em meses: ");
		idademeses = ler.nextInt();
		System.out.print("Informe sua idade em dias: ");
		idadedias = ler.nextInt();
		idadef = (((idadeanos*12)+idademeses)*30)+idadedias;
		System.out.print("Sua idade total em dias é de: "+idadef);
	}
}
