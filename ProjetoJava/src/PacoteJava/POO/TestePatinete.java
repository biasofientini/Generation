package PacoteJava;

public class TestePatinete {

	public static void main(String[] args) {
		
		/* Enunciado: Crie uma classe patinete e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto patinete, defina as instancias deste
		objeto e apresente as informações deste objeto no console.*/
		
		Patinete p1 = new Patinete("Verde", 15);
		p1.status();
		
		System.out.println("\n---------------Testando Gets-------------");
		System.out.println();
		System.out.println("Cor do patinete: "+p1.getCor());
		System.out.println("Tamanho do patinete: "+p1.getTamanho());
		System.out.println("\n---------------Testando Sets-------------");
		p1.setCor("Azul");
		p1.setTamanho(20);
		System.out.println();
		System.out.println("Cor do patinete: "+p1.getCor());
		System.out.println("Tamanho do patinete: "+p1.getTamanho());
	}

}
