import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente cli = new Cliente();
		
		System.out.println("Nome do Titular: ");
        Scanner scan = new Scanner(System.in);
        cli.setNome(scan.next());
		
		Conta cc = new ContaCorrente(cli);
		Conta poupanca = new ContaPoupanca(cli);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
	
}
