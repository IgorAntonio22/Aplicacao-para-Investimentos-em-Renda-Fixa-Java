package AplicaçãoParaInvestimentosEmRendaFixa;

import java.util.Scanner;

final public class Poupanca extends RendaFixa implements InterfaceJuros{
	
	private final double juros = 0.5;
	private static Scanner scanner = new Scanner(System.in);
	private String nomeDoInvestimento;
	private double rendimentoAbaixoDe8EMeioporCento = (this.getSelic() * 0.7) + this.getTaxaReferencial();
	private double taxaDeJurosFinalPorAno;
	private double calculoDeJurosFinal;
	private double mesesParaDecimal;
	private double rendimentoBruto;
	
	
	public String getNomeDoInvestimento() {
		return nomeDoInvestimento;
	}

	public void setNomeDoInvestimento(String nomeDoInvestimento) {
		this.nomeDoInvestimento = nomeDoInvestimento;
	}

	public double getJuros() {
		return juros;
	}
	
	@Override
	public String toString() {
		return String.format("\nNome: %s \nCPF: %s \nBanco: %s \nValor a ser investido:R$ %.2f \nQuantidade de meses: "
				+ "%.2f meses \nTaxa Selic do Ano: %.2f por cento \nTaxa Referencial: %.2f", this.getNome(), this.getCPF(), this.getBanco(), 
				this.getValorASerInvestido(),this.getQuantidadeDeMeses(), this.getSelic(), this.getTaxaReferencial());
	}
	
	public void criarConta() {
		
		System.out.println("\nVocê entrou na Poupança!\n");
		System.out.println("A poupança rende 70% da SELIC ao mês + Taxa Referencial"
				+ " se a SELIC estiver abaixo de 8.5% "
				+ " caso contrário renderá 0.5% ao mês + Taxa Referencial.");
		
		System.out.println("Digite o Nome do titular: ");
		String nome = scanner.next();
		System.out.println("Digite o CPF do titular: ");
		String cpf = scanner.next();
		System.out.println("Digite o Banco do titular: ");
		String banco = scanner.next();
		
		
		System.out.println("Digite o valor a ser investido: ");
		double valorASerInvestido = scanner.nextDouble();
		System.out.println("Digite a quantidade de meses do investimento: ");
		double quantidadeDeMeses = scanner.nextInt();
		System.out.println("Digite a taxa SELIC do ano: ");
		double taxaSelicDoAno = scanner.nextDouble();
		System.out.println("Digite a taxa Referencial do ano, utilize vírgula e não ponto, exemplo: 0,08");
		double taxaReferencial = scanner.nextDouble();
		
		this.setNome(nome);
		this.setCPF(cpf);
		this.setBanco(banco);
		this.setValorASerInvestido(valorASerInvestido);
		this.setQuantidadeDeMeses(quantidadeDeMeses);
		this.setSelic(taxaSelicDoAno);
		this.setTaxaReferencial(taxaReferencial);
	

	}
	
public void calcularJurosInvestimento() {
		
		if(this.getSelic() > 8.5) {
			rendimentoAbaixoDe8EMeioporCento = (0.5 + this.getTaxaReferencial()) * 12; 		
		}
		
		System.out.println("Nome do investimento: " + this.getNomeDoInvestimento());
		taxaDeJurosFinalPorAno = rendimentoAbaixoDe8EMeioporCento / 100;
		System.out.println("Taxa de juros por mês: Aproximadamente: " + taxaDeJurosFinalPorAno);
		mesesParaDecimal =  this.getQuantidadeDeMeses() / 12;
		calculoDeJurosFinal = this.getValorASerInvestido() * Math.pow((1 + taxaDeJurosFinalPorAno), mesesParaDecimal);
		System.out.println("Rendimento líquido final: Aproximadamente: " + calculoDeJurosFinal);
		rendimentoBruto = calculoDeJurosFinal - this.getValorASerInvestido();
		System.out.println("Rendimento líquido: " + rendimentoBruto);
		
	}

public double getRendimentoAbaixoDe8EMeioporCento() {
	return rendimentoAbaixoDe8EMeioporCento;
}

public void setRendimentoAbaixoDe8EMeioporCento(double rendimentoAbaixoDe8EMeioporCento) {
	this.rendimentoAbaixoDe8EMeioporCento = rendimentoAbaixoDe8EMeioporCento;
}

public double getTaxaDeJurosFinalPorAno() {
	return taxaDeJurosFinalPorAno;
}

public void setTaxaDeJurosFinalPorAno(double taxaDeJurosFinalPorAno) {
	this.taxaDeJurosFinalPorAno = taxaDeJurosFinalPorAno;
}

public double getCalculoDeJurosFinal() {
	return calculoDeJurosFinal;
}

public void setCalculoDeJurosFinal(double calculoDeJurosFinal) {
	this.calculoDeJurosFinal = calculoDeJurosFinal;
}

public double getMesesParaDecimal() {
	return mesesParaDecimal;
}

public void setMesesParaDecimal(double mesesParaDecimal) {
	this.mesesParaDecimal = mesesParaDecimal;
}

public double getRendimentoBruto() {
	return rendimentoBruto;
}

public void setRendimentoBruto(double rendimentoBruto) {
	this.rendimentoBruto = rendimentoBruto;
}
	
	
}
