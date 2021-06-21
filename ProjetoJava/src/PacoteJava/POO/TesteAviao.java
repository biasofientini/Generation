package PacoteJava;

public class TesteAviao {

	public static void main(String[] args) {
		/* Enunciado: Crie uma classe avião e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto avião, defina as instancias deste
		objeto e apresente as informações deste objeto no console.*/

		
		Aviao a1 = new Aviao("XXX", 858.5, 300, true);
		a1.status();
		System.out.println("\n---------------Testando Gets-------------");
		System.out.println();
		System.out.println("Empresa do avião fornecida: "+a1.getEmpresa());
		System.out.println("Velocidade instantânea do avião fornecida: "+a1.getVelocidadeinst());
		System.out.println("Capacidade do avião fornecida: "+a1.getCapacidade());
		if(a1.isAbastecimento()==true) {
			System.out.println("O avião está abastecido!");
		}
		else {
			System.out.println("O avião não está devidamente abastecido!");
		}
		System.out.println("\n---------------Testando Sets-------------");
		a1.setEmpresa("YYY");
		a1.setVelocidadeinst(900.0);
		a1.setCapacidade(400);
		a1.setAbastecimento(false);
		System.out.println();
		System.out.println("Empresa do avião fornecida: "+a1.getEmpresa());
		System.out.println("Velocidade instantânea do avião fornecida: "+a1.getVelocidadeinst());
		System.out.println("Capacidade do avião fornecida: "+a1.getCapacidade());
		if(a1.isAbastecimento()==true) {
			System.out.println("O avião está abastecido!");
		}
		else {
			System.out.println("O avião não está devidamente abastecido!");
		}
	}

}
