import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;
	private List<Cliente> clientes;
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public List<Conta> getContas() {
		return this.contas;
	}
	
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public List<Cliente> getClientes() {
		return this.clientes;
	}
	
	public void imprimirDadosCadastrais(String nome, String senha) {
		for (Cliente c : this.clientes) {
			if (c.getNome() == nome && c.getSenha() == senha) {
				System.out.println("Dados Cadastrais");
				System.out.println(String.format("Nome: %s", c.getNome()));
				System.out.println(String.format("CPF: %s", c.getCpf()));
				System.out.println(String.format("Data de nascimento: %s", c.getDataNascimento()));
			} else {
				System.out.println("Erro. Pessoa Física não encontrada."); /* Nessa situação, é bom manter apenas o retorno de erro de pessoa 
																			  não encontrada, visto que se alguma pessoa mal intencionada acertasse 
																			  o nome e o sistema retornasse que apenas a senha estava incorreta, essa
																			  pessoa poderia tentar coletar os dados cadastrais de outra pessoa,
																			  comprometendo o sigilo e a proteção de informações da conta do cliente. */
			}
		}
	}
}
