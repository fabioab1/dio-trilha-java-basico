package exemploenum;

public enum EstadoBrasileiro {
	SAO_PAULO ("SP","São Paulo", 00),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 01),
	PIAUI ("PI", "Piauí", 02),
	MARANHAO ("MA","Maranhão", 03),
	CEARA ("CE", "Ceará", 04);
	;
	
	private String nome;
	private String sigla;
	private int ibge;
	
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
	public int getIbge() {
		return ibge;
	}
	
}
