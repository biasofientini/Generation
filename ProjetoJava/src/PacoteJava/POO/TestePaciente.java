package PacoteJava;

public class TestePaciente {

	public static void main(String[] args) {
		
		/* Enunciado: Crie uma classe paciente e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto paciente, defina as instancias deste
		objeto e apresente as informações deste objeto no console.*/
		
		Paciente p1 = new Paciente("Alexandre", 19, 55.0, 1.90);
		p1.status();
		System.out.println("\n---------------Testando Gets-------------");
		System.out.println();
		System.out.println("Nome do(a) paciente: "+p1.getNome());
		System.out.println("Idade do(a) paciente: "+p1.getIdade());
		System.out.println("Peso do(a) paciente: "+p1.getPeso());
		System.out.println("Altura do(a) paciente: "+p1.getAltura());
		System.out.println("\n---------------Testando Sets-------------");
		p1.setNome("Gabriel");
		p1.setIdade(20);
		p1.setPeso(85.6);
		p1.setAltura(1.70);
		System.out.println("Nome do(a) paciente: "+p1.getNome());
		System.out.println("Idade do(a) paciente: "+p1.getIdade());
		System.out.println("Peso do(a) paciente: "+p1.getPeso());
		System.out.println("Altura do(a) paciente: "+p1.getAltura());
	}

}
