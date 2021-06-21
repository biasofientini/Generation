package PacoteJava;

import java.util.Scanner;

public class IdadeAnosMesesDias {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idadeanos, idademeses, idadediasf, idadedias;
		System.out.print("Informe sua idade total em dias: ");
		idadedias = ler.nextInt();
		idadeanos = idadedias/365;
		idademeses = (idadedias%365)/30;
		idadediasf = (idadedias%365)%30;
		System.out.println("Sua idade é de "+idadeanos+" anos, "+idademeses+" meses e "+idadediasf+" dias");
	}

}
