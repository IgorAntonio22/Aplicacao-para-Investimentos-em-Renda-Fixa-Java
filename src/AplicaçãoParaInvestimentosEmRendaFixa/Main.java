package Aplica��oParaInvestimentosEmRendaFixa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	private static int opcao;
	private static CDB contaCDB = new CDB();
	private static LCI contaLCI = new LCI();
	private static LCA contaLCA = new LCA();
	private static Poupanca contaPoupanca = new Poupanca();
	
	private static void imprimirTudo() {
		if(contaCDB.getNome() == null) {
			
		} else {
			System.out.println("Dados inseridos Conta CDB: ");
			System.out.println(contaCDB.toString());
			System.out.println("\n");
			contaCDB.calcularJurosInvestimento();
			System.out.println("\n");
		}
		
		if(contaLCI.getNome() == null) {
			
		} else {
			System.out.println("\nDados inseridos Conta LCI: ");
			System.out.println(contaLCI.toString());
			System.out.println("\n");
			contaLCI.calcularJurosInvestimento();
			System.out.println("\n");
		}
	
		if(contaLCA.getNome() == null) {
			
		} else {
			System.out.println("\nDados inseridos Conta LCA: ");
			System.out.println(contaLCA.toString());
			System.out.println("\n");
			contaLCA.calcularJurosInvestimento();
			System.out.println("\n");
		}
		
		if(contaPoupanca.getNome() == null) {
			
		} else {
			System.out.println("\nDados inseridos Conta Poupan�a: ");
			System.out.println(contaPoupanca.toString());
			System.out.println("\n");
			contaPoupanca.calcularJurosInvestimento();
			System.out.println("\n");
			
		}
		
	}
	
	private static void escreverArquivo() {
		String caminhoArquivo = "C:/Users/igora/Desktop/arquivoJava/arquivo.txt";
		
		try {
			FileWriter fileWriter = new FileWriter(caminhoArquivo);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			if(contaCDB.getNome() == null) {
				
			} else {
				bufferedWriter.write("Dados inseridos Conta CDB: ");
				bufferedWriter.write(contaCDB.toString());
				bufferedWriter.write("\n");
				bufferedWriter.write("\nNome do investimento: " + contaCDB.getNomeDoInvestimento());
				bufferedWriter.write("\nTaxa de juros por m�s: Aproximadamente: " + contaCDB.getTaxaDeJurosFinalPorAno());
				bufferedWriter.write("\nRendimento bruto final: Aproximadamente: R$" + contaCDB.getCalculoDeJurosBruto());
				bufferedWriter.write("\nRendimento bruto: R$" + contaCDB.getRendimentoBruto());
				
				if(contaCDB.getQuantidadeDeMeses() < 6) {
					
					bufferedWriter.write("\nValor do IR de 22,5%: Aproximadamente: R$" + contaCDB.getImpostoDeRenda());
				
					System.out.println("\nValor l�quido do investimento com IR: Aproximadamente: R$" + contaCDB.getCalculoDeJurosFinal() + "\n");
				} else if(contaCDB.getQuantidadeDeMeses() >= 6 && contaCDB.getQuantidadeDeMeses() < 12 ) {
					
					bufferedWriter.write("\nValor do IR de 20%: Aproximadamente: R$" + contaCDB.getImpostoDeRenda());
				
					bufferedWriter.write("\nValor l�quido do investimento com IR: Aproximadamente: R$" + contaCDB.getCalculoDeJurosFinal() + "\n");
				} else if(contaCDB.getQuantidadeDeMeses() >= 12 && contaCDB.getQuantidadeDeMeses() < 24) {
					
					bufferedWriter.write("\nValor do IR de 20%: Aproximadamente: R$" + contaCDB.getImpostoDeRenda());
			
					bufferedWriter.write("\nValor l�quido do investimento com IR: Aproximadamente: R$" + contaCDB.getCalculoDeJurosFinal() + "\n");
				} else if(contaCDB.getQuantidadeDeMeses() >= 24) {
					
					bufferedWriter.write("\nValor do IR de 20%: Aproximadamente: R$" + contaCDB.getImpostoDeRenda());

					bufferedWriter.write("\nValor l�quido do investimento com IR: Aproximadamente: R$" + contaCDB.getCalculoDeJurosFinal() + "\n");
				} else {
					
				}
				
			}
			
			if(contaLCI.getNome() == null) {
				
			} else {
				bufferedWriter.write("\nDados inseridos Conta LCI: ");
				bufferedWriter.write(contaLCI.toString());
				bufferedWriter.write("\n");
				bufferedWriter.write("\nNome do investimento: " + contaLCI.getNomeDoInvestimento());
				bufferedWriter.write("\nTaxa de juros por m�s: Aproximadamente: " + contaLCI.getTaxaDeJurosFinalPorAno());
				bufferedWriter.write("\nRendimento l�quido final: Aproximadamente: R$" + contaLCI.getCalculoDeJurosFinal());
				bufferedWriter.write("\nRendimento l�quido: R$" + contaLCI.getRendimentoBruto() + "\n");
				
			}
		
			if(contaLCA.getNome() == null) {
				
			} else {
				bufferedWriter.write("\nDados inseridos Conta LCA: ");
				bufferedWriter.write(contaLCA.toString());
				bufferedWriter.write("\n");
				bufferedWriter.write("\nNome do investimento: " + contaLCA.getNomeDoInvestimento());
				bufferedWriter.write("\nTaxa de juros por m�s: Aproximadamente: " + contaLCA.getTaxaDeJurosFinalPorAno());
				bufferedWriter.write("\nRendimento l�quido final: Aproximadamente: R$" + contaLCA.getCalculoDeJurosFinal());
				bufferedWriter.write("\nRendimento l�quido: R$" + contaLCA.getRendimentoBruto()+ "\n");
				
			}
			
			if(contaPoupanca.getNome() == null) {
				
			} else {
				bufferedWriter.write("\nDados inseridos Conta Poupan�a: ");
				bufferedWriter.write(contaPoupanca.toString());
				bufferedWriter.write("\n");
				bufferedWriter.write("\nNome do investimento: " + contaPoupanca.getNomeDoInvestimento());
				bufferedWriter.write("\nTaxa de juros por m�s: Aproximadamente: " + contaPoupanca.getTaxaDeJurosFinalPorAno());
				bufferedWriter.write("\nRendimento l�quido final: Aproximadamente: R$" + contaPoupanca.getCalculoDeJurosFinal());
				bufferedWriter.write("\nRendimento l�quido: R$" + contaPoupanca.getRendimentoBruto()+ "\n");			
			}
			
			bufferedWriter.close();
			
			System.out.println("Arquivo criado com sucesso!");
			
		} catch (IOException e) {
			
			
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
		System.out.println("Escolha uma op��o de investimento : ");
		System.out.println("1 - CDB");
		System.out.println("2 - LCI");
		System.out.println("3 - LCA");
		System.out.println("4 - Poupan�a");
		System.out.println("5 - Imprimir �ltimos dados inseridos");
		System.out.println("6 - Gerar arquivo com dados inseridos");
		System.out.println("7 - Sair");
		opcao = scanner.nextInt();
		
		
		switch (opcao){
		case 1:

			contaCDB.criarConta();
			contaCDB.setNomeDoInvestimento("CDB");
			contaCDB.calcularJurosInvestimento();
			break;
		case 2:
		
			contaLCI.criarConta();
			contaLCI.setNomeDoInvestimento("LCI");
			contaLCI.calcularJurosInvestimento();
			
			break;
		case 3: 
		
			contaLCA.criarConta();
			contaLCA.setNomeDoInvestimento("LCA");
			contaLCA.calcularJurosInvestimento();
			
			break;
		case 4:
			contaPoupanca.criarConta();
			contaPoupanca.setNomeDoInvestimento("Poupan�a");
			contaPoupanca.calcularJurosInvestimento();
			break;
			
		case 5: 
			
			imprimirTudo();
			break;
		case 6:
			escreverArquivo();
			break;
		case 7:
			
			break;
		default:
			
			break;
		}
	
		} while (opcao != 7);
		
		scanner.close();
	}

}
