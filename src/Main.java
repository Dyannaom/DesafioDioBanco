
public class Main {
	public Main() {
	}

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");		
		
		Conta cc = new ContaCorrente(venilton); 		
		Conta poupanca = new ContaPoupanca(venilton);
		
		cc.depositar(1500.0D);
		cc.transferir(500, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
	
}
