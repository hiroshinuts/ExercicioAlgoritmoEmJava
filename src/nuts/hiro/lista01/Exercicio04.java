package nuts.hiro.lista01;

import javax.swing.JOptionPane;

/**
 * 4-Efetuar a leitura de um número inteiro e apresentar o resultado do quadrado
 * desse número.
 * 
 * @author hiro
 */

public class Exercicio04 extends Exercicio01 {

	public static void main(String[] args) {
		
		String numero = JOptionPane.showInputDialog("Digite um numero inteiro");
		
		Integer quadradoNumero = Integer.parseInt(numero);
		
		quadradoNumero = quadradoNumero * quadradoNumero;
		
		String mensagem = "O quadrado do numero inteiro digitado é " + quadradoNumero;
				
		JOptionPane.showMessageDialog(null, mensagem);
		
		
	}
	
}
