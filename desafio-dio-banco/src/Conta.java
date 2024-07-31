
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia, conta;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public void sacar(double valorSaque) {
		if (valorSaque <= this.saldo) {
			this.saldo -= valorSaque;
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public void transferencia(double valorTransferencia, Conta contaDestino) {
		this.sacar(valorTransferencia);
		contaDestino.depositar(valorTransferencia);
	}
	
	protected void imprimirDadosBancários() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println("Agencia: " + agencia);
		System.out.println("Número da conta: " + conta);
		System.out.println(String.format("Saldo: R$ %.2f", saldo));
	}
	
	protected int getAgencia() {
		return this.agencia;
	}
	
	protected int getConta() {
		return this.conta;
	}
	
	protected double getSaldo() {
		return this.saldo;
	}
}
