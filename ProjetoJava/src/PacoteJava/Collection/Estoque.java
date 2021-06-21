package PacoteJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	
	public static void main(String[] args) {
		
		int opcao;
		String produto;
		String novoProduto;
		int index;
		
		ArrayList<String>estoque = new ArrayList();
		Scanner read = new Scanner(System.in);
		System.out.println("Bem vindo ao programa de estoques! Para começar, escolha uma opção abaixo: ");
		do {
			System.out.println("\n--------------------------------------------");
			System.out.println("\n[1] Adicionar produto\n[2] Remover produto\n[3] Atualizar produto\n[4] Ver produtos do estoque\n[5] Encerrar programa");
			opcao = read.nextInt();
			switch(opcao) {
			case 1:
				read.nextLine();
				System.out.println("\nDigite o produto que deseja inserir: ");
				produto = read.nextLine();
				estoque.add(produto);
				break;
			case 2:
				read.nextLine();
				System.out.println("\nDigite o produto que deseja remover: ");
				produto = read.nextLine();
				estoque.remove(produto);
				break;
			case 3:
				read.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar: ");
				produto = read.nextLine();
				if(estoque.contains(produto)) {
					System.out.println("\nDigite o produto que deseja inserir no lugar: ");
					novoProduto = read.nextLine();
					estoque.remove(produto);
					estoque.add(novoProduto);
				}
				break;
			case 4:
				System.out.println("Produtos no estoque atualmente: ");
				if(estoque.isEmpty()==false) {
					for(String produtos: estoque) {
						System.out.println(produtos);
					}
				}
				else {System.out.println("Estoque vazio, adicione algo e tente novamente...");}
				break;
			    default:
			System.out.println("Programa encerrado!");
			}
		}
		while(opcao!=5);
	}
	
}
