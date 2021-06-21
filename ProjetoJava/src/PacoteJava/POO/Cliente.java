package PacoteJava;

public class Cliente {
	
	/* Enunciado: Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
	
	private String nome;
	private int idade;
	private String endereco;
	private String CPF;
	private String email;
	private boolean pedidos;
	
	
	public Cliente(String nome, int idade, String endereco, String CPF, String email, boolean pedidos) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.CPF = CPF;
		this.email = email;
		this.pedidos = pedidos;
	}
	
	public void cadastrar() {
		System.out.println("Cliente cadastrado com sucesso! Confira as informações gravadas: "
				+ "\nNome: "+nome+"\nIdade: "+idade+"\nEndereço: "+endereco+"\nCPF: "+CPF+"\nE-mail: "+email);
	}
	public void perguntar() {
		System.out.println("Recebemos a sua requisição de atentimento, ficamos felizes em poder ajudar! "
				+ "Por favor, nos envie sua dúvida via e-mail: contato@atentimento.com");
	}
	public void statusCliente() {
		if(pedidos==true) {
		System.out.println("Atualmente você possui pedidos realizados! Para realizar mais pedidos,"
				+ "nos contate via e-mail!");
		}
		else {
			System.out.println("Atualmente você não possui nenhum pedido realizado");
		}
	}
	
	//nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//idade
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	//endereco
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//CPF
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	//email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//pedidos
	public boolean isPedidos() {
		return pedidos;
	}
	public void setPedidos(boolean pedidos) {
		this.pedidos = pedidos;
	}
}