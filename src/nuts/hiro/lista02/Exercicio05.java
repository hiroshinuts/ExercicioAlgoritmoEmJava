package nuts.hiro.lista02;

import javax.swing.JOptionPane;

/**
 * 5 - Ler um valor numérico inteiro que esteja na faixa de valores de 1 até 9.
 * O programa deve apresentar a mensagem “O valor está na faixa permitida”, caso
 * o valor informado esteja entre 1 e 9. Se o valor estiver fora da faixa, o
 * programa deve apresentar a mensagem “O valor está fora da faixa permitida”
 * 
 * 
 * @author hiro
 *
 */

public class Exercicio05 {

	public static void main(String[] args) {
		
		String numero = JOptionPane.showInputDialog("Digite um numero inteiro entre 1 e 9");
		Integer n = Integer.parseInt(numero);
		
		if (n > 0 && n < 10){
			
			String mensagem = "O valor está na faixa permitida";
			JOptionPane.showMessageDialog(null, mensagem);
	
		}else{
			
			String mensagem = "O valor está fora da faixa permitida";
			JOptionPane.showMessageDialog(null, mensagem);
			
		}
		

	}

}
