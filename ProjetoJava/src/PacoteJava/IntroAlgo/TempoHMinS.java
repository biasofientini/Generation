package PacoteJava;

import java.util.Scanner;

public class TempoHMinS {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tempo, tempohoras, tempomin, temposeg;
		System.out.println("Digite a duração total do evento em segundos: ");
		tempo = ler.nextInt();
		tempohoras = tempo/3600;
		tempomin = (tempo%3600)/60;
		temposeg = (tempo%3600)%60;
		System.out.println("A duração do evento foi de "+tempohoras+" horas, "+tempomin+" minutos e "+temposeg+" segundos.");
	}
}
