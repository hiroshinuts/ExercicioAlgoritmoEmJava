package nuts.hiro.lista01;

import javax.swing.JOptionPane;

/**
 * 5- Elaborar um programa que apresente o valor da conversão em real (R$) de um
 * valor lido em dólar (US$). O programa deve solicitar o valor da cotação do
 * dólar e também a quantidade de dólares disponível com o usuário.
 * 
 * 
 * @author hiro
 *
 */

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		String dolares = JOptionPane.showInputDialog("Digite a Quantidade de Dolares Disponiveis");
		String taxa = JOptionPane.showInputDialog("Qual a taxa de conversao?");
		
		Double valorEmDolares = Double.parseDouble(dolares);
		Double valorTaxa = Double.parseDouble(taxa);
		double valorConvertidoParaReais = valorEmDolares * valorTaxa;
		
		String mensagem = "O valor convertido em Reais é de : " + valorConvertidoParaReais;
		
		JOptionPane.showMessageDialog(null, mensagem);
		
	}

}
