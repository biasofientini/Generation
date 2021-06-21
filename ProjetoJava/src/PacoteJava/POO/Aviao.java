package PacoteJava;

public class Aviao {
	
	/* Enunciado: Crie uma classe avião e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto avião, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
	
	private String empresa;
	private double velocidadeinst;
	private int capacidade;
	private boolean abastecimento;
	
	public Aviao(String empresa, double velocidadeinst, int capacidade, boolean abastecimento) {
		this.empresa = empresa;
		this.velocidadeinst = velocidadeinst;
		this.capacidade = capacidade;
		this.abastecimento = abastecimento;
	}
	public void acelerar() {
		System.out.println("Acelerando aeronave! Velocidade imediatamente antes da aceleração: "+velocidadeinst);
	}
	public void desacelerar() {
		System.out.println("Desacelerando aeronave! Velocidade imediatamente antes da desaceleração: "+velocidadeinst);
	}
	public void virar() {
		System.out.println("Virando aeronave!");
	}
	public void planar() {
		System.out.println("Modo 'Planar' ativado!");
	}
	public void status() {
		System.out.println("Nesse momento, o avião da empresa "+empresa+", encontra-se a uma velocidade de "+velocidadeinst
				+", com sua capacidade máxima de "+capacidade+" pessoas totalmente utilizada!");
		if(abastecimento==true) {
			System.out.println("E encontra-se devidamente abastecido.");
		}
		else {
			System.out.println("Mas, está em um baixo nível de abastecimento; Por favor, "
					+ "retire-se da pista de decolagem para realizar o ajuste necessário");
		}
	}
	
	//empresa
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	//velocidadeinst
	public double getVelocidadeinst() {
		return velocidadeinst;
	}
	public void setVelocidadeinst(double velocidadeinst) {
		this.velocidadeinst = velocidadeinst;
	}
	//capacidade
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	//abastecimento
	public boolean isAbastecimento() {
		return abastecimento;
	}
	public void setAbastecimento(boolean abastecimento) {
		this.abastecimento = abastecimento;
	}
}