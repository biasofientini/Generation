package PacoteJava;

public class TesteContaBancaria {

	public static void main(String[] args) {
	
		/* Enunciado: Crie uma classe conta bancaria e apresente os atributos e métodos
		referentes esta classe, em seguida crie um objeto conta bancaria, defina
		as instancias deste objeto e apresente as informações deste objeto no
		console. */
		
		ContaBancaria cb1 = new ContaBancaria(7500.00, "Conta Corrente", "João", true);
		cb1.status();
		System.out.println("\n---------------Testando Gets-------------");
		System.out.println();
		System.out.println("Nome do(a) dono(a) da conta: "+cb1.getDono());
		System.out.println("Tipo da conta: "+cb1.getTipoConta());
		System.out.println("Saldo da conta: "+cb1.getSaldo());
		if(cb1.isStatus()==true) {
			System.out.println("Status da conta: Ativa");
		}
		else {
			System.out.println("Status da conta: Inativa");
		}
		System.out.println("\n---------------Testando Sets-------------");
		cb1.setDono("Maria");
		cb1.setSaldo(3000.00);
		cb1.setStatus(false);
		cb1.setTipoConta("Conta Poupança");
		System.out.println();
		System.out.println("Nome do(a) dono(a) da conta: "+cb1.getDono());
		System.out.println("Tipo da conta: "+cb1.getTipoConta());
		System.out.println("Saldo da conta: "+cb1.getSaldo());
		if(cb1.isStatus()==true) {
			System.out.println("Status da conta: Ativa");
		}
		else {
			System.out.println("Status da conta: Inativa");
		}
	}

}
