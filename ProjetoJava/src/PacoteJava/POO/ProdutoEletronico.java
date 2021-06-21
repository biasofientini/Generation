package PacoteJava;

public class ProdutoEletronico {

	/* Enunciado: Crie uma classe produto eletrônico e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto produto eletrônico,
	defina as instancias deste objeto e apresente as informações deste objeto
	no console. */
	
	private String marca;
	private String modelo;
	private String condicao;
	private int capacidadeMemoria;
	
	public ProdutoEletronico(String marca, String modelo, String condicao, int capacidadeMemoria) {
		this.marca = marca;
		this.modelo = modelo;
		this.condicao = condicao;
		this.capacidadeMemoria = capacidadeMemoria;
	}
	
	public void ligar() {
		System.out.println("Seu aparalho foi ligado!");
	}
	public void desligar() {
		System.out.println("Seu aparelho foi desligado!");
	}
	public void aumentarVolume() {
		System.out.println("O volume foi aumentado!");
	}
	public void diminuirVolume() {
		System.out.println("O volume foi diminuído!");
	}
	public void status() {
		System.out.println("A marca desse produto é "+marca+"\nSeu modelo é "+modelo+"\nSua condição atual é"+condicao
				+"\nE, sua capacidade de memória é de "+capacidadeMemoria+" GB");
	}
	
	//marca
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//modelo
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	//condicao
	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}

	//capacidadeMemoria
	public int getCapacidadeMemoria() {
		return capacidadeMemoria;
	}

	public void setCapacidadeMemoria(int capacidadeMemoria) {
		this.capacidadeMemoria = capacidadeMemoria;
	}
}