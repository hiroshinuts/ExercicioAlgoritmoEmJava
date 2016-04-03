package nuts.hiro.lista02;

import javax.swing.JOptionPane;

/**
 * 7 - Ler um valor numérico inteiro positivo ou negativo e apresentar o valor
 * lido como sendo um valor positivo, ou seja, se o valor lido for menor ou
 * igual a zero, ele deve ser multiplicado por -1.
 * 
 * 
 * @author hiro
 *
 */

public class Exercicio07 {

	public static void main(String[] args) {

		String numero = JOptionPane.showInputDialog("Digite um valor inteiro positivo ou negativo");
		Integer n = Integer.parseInt(numero);

		if (n <= 0) {

			n = n * (-1);

			JOptionPane.showMessageDialog(null, n);

		} else {

			JOptionPane.showMessageDialog(null, n);
		}

	}

}
