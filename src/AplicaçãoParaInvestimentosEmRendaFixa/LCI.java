package AplicaçãoParaInvestimentosEmRendaFixa;

import java.util.Scanner;

final public class LCI extends RendaFixa implements InterfaceJuros{
	
	private final double juros = 1;
	private static Scanner scanner = new Scanner(System.in);
	private double taxaDeJurosFinalPorAno;
	private double calculoDeJurosFinal;
	private String nomeDoInvestimento;
	private double mesesParaDecimal;
	private double rendimentoBruto;
	
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
				+ "%.2f meses \nTaxa Selic do Ano: %.2f por cento", this.getNome(), this.getCPF(), this.getBanco(), 
				this.getValorASerInvestido(), this.getQuantidadeDeMeses(), this.getSelic());
	}
	
	public void criarConta() {
				
		System.out.println("\n Você entrou no LCI!\n");	
		System.out.println("O LCI rende 100% do CDI!");
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
		
		this.setNome(nome);
		this.setCPF(cpf);
		this.setBanco(banco);
		this.setValorASerInvestido(valorASerInvestido);
		this.setQuantidadeDeMeses(quantidadeDeMeses);
		this.setSelic(taxaSelicDoAno);
	

	}
	
public void calcularJurosInvestimento() {
		
		System.out.println("Nome do investimento: " + this.getNomeDoInvestimento());
		taxaDeJurosFinalPorAno = ((this.getSelic() * juros)) / 100;
		System.out.println("Taxa de juros por mês: Aproximadamente: " + taxaDeJurosFinalPorAno);
		mesesParaDecimal =  this.getQuantidadeDeMeses() / 12;
		calculoDeJurosFinal = this.getValorASerInvestido() * Math.pow((1 + taxaDeJurosFinalPorAno), mesesParaDecimal);
		System.out.println("Rendimento líquido final: Aproximadamente: " + calculoDeJurosFinal);
		rendimentoBruto = calculoDeJurosFinal - this.getValorASerInvestido();
		System.out.println("Rendimento líquido: " + rendimentoBruto);
	}
}
