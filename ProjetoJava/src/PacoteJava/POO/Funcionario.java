package PacoteJava;

public class Funcionario {

	/* Enunciado: Crie uma classe funcionário e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto funcionário, defina as
	instancias deste objeto e apresente as informações deste objeto no
	console. */
	
	private String nome;
	private String CPF;
	private String RG;
	private double salario;
	private boolean presenca;
	
	public Funcionario(String nome, String CPF, String RG, double salario, boolean presenca) {
		this.setNome(nome);
		this.setCPF(CPF);
		this.setRG(RG);
		this.setSalario(salario);
		this.setPresenca(presenca);
	}
	
	public void iniciarTrabalho() {
		System.out.println("O status atual do trabalho é: iniciado");
	}
	public void finalizarTrabalho() {
		System.out.println("O status atual do trabalho é: finalizado");
	}
	public void salarioAumentado() {
		System.out.print("O salário era de R$"+salario);
		this.setSalario(salario += 100.00);
		System.out.print(". E o salário agora será de R$"+salario);
	}
	
	//nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	//CPF
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	//RG
	public String getRG() {
		return RG;
	}

	public void setRG(String RG) {
		this.RG = RG;
	}
	
	//salario
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//presenca
	public boolean isPresenca() {
		return presenca;
	}

	public void setPresenca(boolean presenca) {
		this.presenca = presenca;
	}
}