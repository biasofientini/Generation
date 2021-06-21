package PacoteJava;

public class ContaBancaria {

	/* Enunciado: Crie uma classe conta bancaria e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto conta bancaria, defina
	as instancias deste objeto e apresente as informações deste objeto no
	console. */
	
	private double saldo;
	private String tipoConta;
	private String dono;
	private boolean status;
	
	public ContaBancaria(double saldo, String tipoConta, String dono, boolean status) {
		this.setSaldo(saldo);
		this.setTipoConta(tipoConta);
		this.setDono(dono);
		this.setStatus(status);
	}
	
	public void fecharConta() {
		if(saldo!=0) {
			System.out.println("Primeiro saque seu dinheiro!");
		}
		else {
			System.out.println("Conta encerrada.");
		}
	}
	public void sacar() {
		System.out.println("Dinheiro sacado, total retirado: "+saldo);
	}
	public void acessarSaldo() {
		System.out.println("Seu saldo atual é de "+saldo);
	}
	public void status() {
		System.out.println("Dono da conta: "+dono+"\nTipo da conta: "+tipoConta+"\nSaldo atual da conta: "+saldo);
	}

	
	//saldo
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	//tipoConta
	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	
	//dono
	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	
	//status
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
