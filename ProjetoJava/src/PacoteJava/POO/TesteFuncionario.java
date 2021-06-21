package PacoteJava;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		/* Enunciado: Crie uma classe funcionário e apresente os atributos e métodos
		referentes esta classe, em seguida crie um objeto funcionário, defina as
		instancias deste objeto e apresente as informações deste objeto no
		console. */
		
		Funcionario f1 = new Funcionario("Joao", "xxx.xxx.xxx-xx", "xx.xxx.xxx-x", 2500.00, true);
		System.out.println("\n---------------Testando Gets-------------");
		System.out.println();
		System.out.println("Nome do(a) funcionário(a):"+f1.getNome());
		System.out.println("CPF do(a) funcionário(a):"+f1.getCPF());
		System.out.println("RG do(a) funcionário(a):"+f1.getRG());
		System.out.println("Salário atual do(a) funcionário(a):"+f1.getSalario());
		if(f1.isPresenca()==true) {
			System.out.println("Presente");
		}
		else{
			System.out.println("Não está presente");
		}
		f1.iniciarTrabalho();
		f1.finalizarTrabalho();
		System.out.println("\n---------------Testando Sets-------------");
		f1.setNome("Maria");
		f1.setCPF("yyy.yyy.yyy-yy");
		f1.setRG("yy.yyy.yyy-yy");
		f1.setSalario(2000.00);
		f1.setPresenca(false);
		System.out.println();
		System.out.println("Nome do(a) funcionário(a):"+f1.getNome());
		System.out.println("CPF do(a) funcionário(a):"+f1.getCPF());
		System.out.println("RG do(a) funcionário(a):"+f1.getRG());
		System.out.println("Salário atual do(a) funcionário(a):"+f1.getSalario());
		if(f1.isPresenca()==true) {
			System.out.println("Presente");
		}
		else{
			System.out.println("Não está presente");
		}
		f1.salarioAumentado();
		System.out.println("Salário atual do(a) funcionário(a):"+f1.getSalario());
	}
}
