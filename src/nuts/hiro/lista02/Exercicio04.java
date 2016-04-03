package nuts.hiro.lista02;

import javax.swing.JOptionPane;

public class Exercicio04 {

	/**
	 * 4 - Ler um valor numérico inteiro e apresentar uma mensagem informando se
	 * o valor é par ou ímpar
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String numeroInteiro = JOptionPane.showInputDialog("Digite um numero inteiro para saber se é par ou impar");
		Integer n = Integer.parseInt(numeroInteiro);

		if (n % 2 == 0) {

			String mensagem = "O numero inteiro digitado é PAR";
			JOptionPane.showMessageDialog(null, mensagem);

		} else {
			String mensagem = "O numero inteiro digitado é IMPAR";
			JOptionPane.showMessageDialog(null, mensagem);
		}

	}

}
