import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Banco bancoDoBrasil = new Banco();
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date data = null;
		
		try {
			data = formato.parse("15/07/2005");
		} catch (ParseException e) {
			System.out.println("Erro ao realizar a conversão.");
		} 
		
		Cliente cliente1 = new Cliente("Fábio", "1112223334", "senhaforte", data);
		
		Conta cc = new ContaCorrente(cliente1); // Tanto faz instanciar como IConta, Conta ou ContaCorrente, para o interpretador a ContaCorrente é uma Conta
		Conta poupanca = new ContaPoupanca(cliente1);
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(cliente1);
		
		List<Conta> contas = new ArrayList<>();
		contas.add(cc);
		contas.add(poupanca);
		
		bancoDoBrasil.setClientes(clientes);
		bancoDoBrasil.setContas(contas);
		
		bancoDoBrasil.imprimirDadosCadastrais("Fábio", "senhaforte");
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc.depositar(15);
		poupanca.depositar(50);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc.transferencia(15, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc.sacar(10);
		
	}
}
