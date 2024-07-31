import java.util.Date;

public class Cliente {
	private String nome;
	private String cpf;
	private String senha;
	private Date dataDeNascimento;
	
	public Cliente(String nomeCliente, String cpf, String senha, Date dataDeNascimento) {
		this.nome = nomeCliente;
		this.cpf = cpf;
		this.senha = senha; // No contexto do meu domínio, faz sentido inserir a senha no construtor, imaginando-se que o Cliente irá realizar a abertura de conta pelo aplicativo ou na própria agência.
		this.dataDeNascimento = dataDeNascimento;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public Date getDataNascimento() {
		return this.dataDeNascimento;
	}
}
