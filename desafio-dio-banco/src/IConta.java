
public interface IConta {
	
	void sacar(double valorSaque);
	
	void depositar(double valorDeposito);
	
	void transferencia(double valorTransferencia, Conta contaDestino);
	
	void imprimirExtrato();
	
}
