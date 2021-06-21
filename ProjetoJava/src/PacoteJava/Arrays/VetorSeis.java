package PacoteJava;

public class VetorSeis {

	public static void main(String[] args) {
		int[] vetor = {1, 0, 5, -2, -5, 7};
		int soma=0;
		soma = vetor[0] + vetor[1] + vetor[5];
		System.out.println("A soma das posições de index 0, 1 e 5 do vetor é de: "+soma);
		vetor[4] = 100;
		for(int i=0; i<6; i++) {
			System.out.println("valor da posição "+i+" do vetor: "+vetor[i]);
		}
	}

}
