package nuts.hiro.lista01;

import javax.swing.JOptionPane;

/**
 * 6- Elaborar um programa que leia três valores inteiros (representados pelas
 * variáveis A, B e C) e apresente como resultado final o valor da soma dos
 * quadrados dos três valores lidos.
 * 
 * 
 * @author hiro
 *
 */

public class Exercicio06 {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Digite o Valor de A");
		String b = JOptionPane.showInputDialog("Digite o Valor de B");
		String c = JOptionPane.showInputDialog("Digite o Valor de C");
		
		Integer aQuadrado = Integer.parseInt(a);
		Integer bQuadrado = Integer.parseInt(b); 
		Integer cQuadrado = Integer.parseInt(c);
		
		int SomaDosQuadrados = (int) (Math.pow(aQuadrado, 2) + Math.pow(bQuadrado, 2) + Math.pow(cQuadrado, 2));
		
		String mensagem = "A soma do quadrado de A , B e C é : " + SomaDosQuadrados;
		
		JOptionPane.showMessageDialog(null, mensagem);

	}

}
