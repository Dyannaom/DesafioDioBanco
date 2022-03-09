
public interface iConta {
	
	void sacar(double var1);
		
	void depositar(double var1);
	
	void transferir (double var1, iConta var3);

	void imprimirExtrato();
}
