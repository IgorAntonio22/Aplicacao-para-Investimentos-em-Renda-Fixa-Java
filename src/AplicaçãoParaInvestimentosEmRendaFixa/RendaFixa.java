package AplicaçãoParaInvestimentosEmRendaFixa;

public abstract class RendaFixa {

	private String nome;
	private String CPF;
	private String Banco;
	private double valorASerInvestido;
	private double quantidadeDeMeses;
	private double selic; 
	private double taxaReferencial;
	
	public double getTaxaReferencial() {
		return taxaReferencial;
	}
	public void setTaxaReferencial(double taxaReferencial) {
		this.taxaReferencial = taxaReferencial;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBanco() {
		return Banco;
	}
	public void setBanco(String banco) {
		Banco = banco;
	}
	public String getCPF() {
		return CPF;
	}
	
	public void setCPF(String cpf) {
		CPF = cpf;
	}
	public double getValorASerInvestido() {
		return valorASerInvestido;
	}
	public void setValorASerInvestido(double valorASerInvestido) {
		this.valorASerInvestido = valorASerInvestido;
	}
	public double getQuantidadeDeMeses() {
		return quantidadeDeMeses;
	}
	public void setQuantidadeDeMeses(double quantidadeDeMeses2) {
		this.quantidadeDeMeses = quantidadeDeMeses2;
	}
	
	
	public void setSelic(double selic) {
		this.selic = selic;
	}
	public double getSelic() {
		return selic;
	}
	
	
	

}
