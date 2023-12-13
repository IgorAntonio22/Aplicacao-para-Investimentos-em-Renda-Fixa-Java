package AplicaçãoParaInvestimentosEmRendaFixa;

import java.util.Scanner;

final public class CDB extends RendaFixa implements InterfaceJuros {
	
	private final double juros = 1.2;
	private static Scanner scanner = new Scanner(System.in);
	private double taxaDeJurosFinalPorAno;
	private double calculoDeJurosFinal;
	private double impostoDeRenda;
	private String nomeDoInvestimento;
	private double mesesParaDecimal;
	private double rendimentoBruto;
	private double calculoDeJurosBruto;
	
	public double getCalculoDeJurosBruto() {
		return calculoDeJurosBruto;
	}

	public void setCalculoDeJurosBruto(double calculoDeJurosBruto) {
		this.calculoDeJurosBruto = calculoDeJurosBruto;
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
		
		System.out.println("\nVocê entrou no CDB!\n");
		System.out.println("O CDB rende 120% do CDI!");
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
		calculoDeJurosBruto = calculoDeJurosFinal;
		System.out.println("Rendimento bruto final: Aproximadamente: " + calculoDeJurosFinal);
		
		rendimentoBruto = calculoDeJurosFinal - this.getValorASerInvestido();
		System.out.println("Rendimento bruto: " + rendimentoBruto);
		
		
		if(this.getQuantidadeDeMeses() < 6) {
			impostoDeRenda = (calculoDeJurosFinal - this.getValorASerInvestido()) * 0.225;
			System.out.println("Valor do IR de 22,5%: Aproximadamente: " + impostoDeRenda);
			calculoDeJurosFinal = calculoDeJurosFinal - impostoDeRenda;
			System.out.println("Valor líquido do investimento com IR: Aproximadamente: " + calculoDeJurosFinal);
		} else if(this.getQuantidadeDeMeses() >= 6 && this.getQuantidadeDeMeses() < 12 ) {
			impostoDeRenda = (calculoDeJurosFinal - this.getValorASerInvestido()) * 0.2;
			System.out.println("Valor do IR de 20%: Aproximadamente: " + impostoDeRenda);
			calculoDeJurosFinal = calculoDeJurosFinal - impostoDeRenda;
			System.out.println("Valor líquido do investimento com IR: Aproximadamente: " + calculoDeJurosFinal);
		} else if(this.getQuantidadeDeMeses() >= 12 && this.getQuantidadeDeMeses() < 24) {
			impostoDeRenda = (calculoDeJurosFinal - this.getValorASerInvestido()) * 0.175;
			System.out.println("Valor do IR de 20%: Aproximadamente: " + impostoDeRenda);
			calculoDeJurosFinal = calculoDeJurosFinal - impostoDeRenda;
			System.out.println("Valor líquido do investimento com IR: Aproximadamente: " + calculoDeJurosFinal);
		} else if(this.getQuantidadeDeMeses() >= 24) {
			impostoDeRenda = (calculoDeJurosFinal - this.getValorASerInvestido()) * 0.5;
			System.out.println("Valor do IR de 20%: Aproximadamente: " + impostoDeRenda);
			calculoDeJurosFinal = calculoDeJurosFinal - impostoDeRenda;
			System.out.println("Valor líquido do investimento com IR: Aproximadamente: " + calculoDeJurosFinal);
		}
		
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

	public double getImpostoDeRenda() {
		return impostoDeRenda;
	}

	public void setImpostoDeRenda(double impostoDeRenda) {
		this.impostoDeRenda = impostoDeRenda;
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
