package PacoteJava;

import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		/* Enunciado: Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

		Scanner ler = new Scanner(System.in);
		Cliente c1 = new Cliente("Beatriz", 18, "Rua 876, Bairro X", "xxx.xxx.xxx-xx", "bia@email.com", false);
		c1.cadastrar();
		System.out.println("\n----------------Testando Gets--------------");
		System.out.println();
		System.out.println("Nome do(a) Cliente: "+c1.getNome());
		System.out.println("Idade do(a) Cliente: "+c1.getIdade());
		System.out.println("Endereço do(a) Cliente: "+c1.getEndereco());
		System.out.println("CPF do(a) Cliente: "+c1.getCPF());
		System.out.println("E-mail do(a) Cliente: "+c1.getEmail());
		if(c1.isPedidos()==true) {
			System.out.println("Status de pedidos do(a) Cliente: Ativo");
		}
		else {
			System.out.println("Status de pedidos do(a) Cliente: Inativo");
		}
		System.out.println("\n----------------Alterando Sets--------------");
		String novoNome, novoEndereco, novoCPF, novoemail;
		int novaIdade;
		boolean novopedidos;
		System.out.println("Informe o nome do(a) cliente: ");
		novoNome = ler.nextLine();
		System.out.println("Informe a idade do(a) cliente: ");
		novaIdade = ler.nextInt();
		System.out.println("Informe o endereço do(a) cliente: ");
		novoEndereco = ler.nextLine();
		System.out.println("Informe o CPF do(a) cliente: ");
		novoCPF = ler.nextLine();
		System.out.println("Informe o e-mail do(a) cliente: ");
		novoemail = ler.nextLine();
		System.out.println("Informe se há pedidos realizados pelo(a) cliente: ");
		novopedidos = ler.nextBoolean();
		c1.setNome(novoNome);
		c1.setIdade(novaIdade);
		c1.setEndereco(novoEndereco);
		c1.setCPF(novoCPF);
		c1.setEmail(novoemail);
		c1.setPedidos(novopedidos);
		c1.cadastrar();
	}
}
