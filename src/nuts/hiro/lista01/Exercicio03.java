package nuts.hiro.lista01;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 3- Elaborar um programa que calcule e apresente o volume de uma caixa
 * retangular, utilizando a fórmula: Volume = comprimento * largura * altura.
 * 
 * @author hiro
 *
 *         Utilizarei JOPTIONPANE - para testar
 */

public class Exercicio03 {

	public static void main(String[] args) {
		
		String comprimento = JOptionPane.showInputDialog("Digite o comprimento");
		String largura = JOptionPane.showInputDialog("Digite a largura");
		String altura = JOptionPane.showInputDialog("Digite a altura");

		double comprimentoCalculo = Double.parseDouble(comprimento);
		double larguraCalculo = Double.parseDouble(largura);
		double alturaCalculo = Double.parseDouble(altura);
		double volume = comprimentoCalculo * larguraCalculo * alturaCalculo;
		
		
		Object mensagem = "O valoro do retangulo é de " + volume;
		
		JOptionPane.showMessageDialog(null, mensagem);
		
		
		
	}

}
