package PacoteJava;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		/* Enunciado: Crie uma classe produto eletrônico e apresente os atributos e métodos
		referentes esta classe, em seguida crie um objeto produto eletrônico,
		defina as instancias deste objeto e apresente as informações deste objeto
		no console. */
		
		ProdutoEletronico pe1 = new ProdutoEletronico("XYZ", "JLK", "novo", 128);
		pe1.status();

		System.out.println("\n----------------Testando Gets--------------");
		System.out.println();
		System.out.println("Marca do produto: "+pe1.getMarca());
		System.out.println("Modelo do produto: "+pe1.getModelo());
		System.out.println("Condição do produto: "+pe1.getCondicao());
		System.out.println("Capacidade de memória do produto: "+pe1.getCapacidadeMemoria()+" GB");
		System.out.println("\n----------------Testando Sets--------------");
		pe1.setMarca("ZXY");
		pe1.setModelo("KLJ");
		pe1.setCondicao("usado");
		pe1.setCapacidadeMemoria(256);
		System.out.println();
		System.out.println("Marca do produto: "+pe1.getMarca());
		System.out.println("Modelo do produto: "+pe1.getModelo());
		System.out.println("Condição do produto: "+pe1.getCondicao());
		System.out.println("Capacidade de memória do produto: "+pe1.getCapacidadeMemoria()+" GB");
	}

}
