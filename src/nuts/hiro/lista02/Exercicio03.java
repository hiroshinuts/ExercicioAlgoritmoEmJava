package nuts.hiro.lista02;

import javax.swing.JOptionPane;

/**
 * 3 - Ler 3 valores numéricos (representados pelas variáveis A, B e C) e fazer
 * o cálculo da equação completa de segundo grau, utilizando a fórmula de
 * Baskara (considerar todas as possíveis condições para delta: delta < 0, delta
 * > 0 e delta = 0). Lembre-se de que é completa a equação de segundo grau que
 * possui simultaneamente as variáveis A, B e C diferentes de zero.
 * 
 * 
 * @author hiro
 *
 */


 
public class Exercicio03 {
	
	public static void main(String[] args) {
		
		
		/**
		 *  FORMULA DE BASKARA 
		 *  
		 *   delta = b^2 - 4 * a * c
		 *   
		 *   x1 = (-b + RAIZ(delta))/2a
		 *   
		 *   x2 = (-b - RAIZ(delta))/2a
		 */
		
		String a1 = JOptionPane.showInputDialog("Digite o valor de A");
		Double a = Double.parseDouble(a1);
		
		String b1 = JOptionPane.showInputDialog("Digite o valor de B");
		Double b = Double.parseDouble(b1);
		
		String c1 = JOptionPane.showInputDialog("Digite o valor de C");
		Double c = Double.parseDouble(c1);
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if ( (a != 0 && b != 0 && c != 0) && delta == 0) {
			
			double x1 = ((-b + Math.sqrt(delta))/2*a );
			
			String mensagem = "Como o valor de delta é 0, a raiz é " + x1;
			JOptionPane.showMessageDialog(null, mensagem);
			
		}else if((a != 0 && b != 0 && c != 0) && delta > 0) {
			
			
			double x1 = ((-b + Math.sqrt(delta))/2*a );
			double x2 = ((-b - Math.sqrt(delta))/2*a );
			
			String mensagem = "O valor de X1 é de " + x1 + "O valor de X2 é de " + x2 ;
			JOptionPane.showMessageDialog(null, mensagem);
			
		}else if ((a != 0 && b != 0 && c != 0) && delta < 0) {
			
			String mensagem = "Não existe raizes com delta negativo!";
			JOptionPane.showMessageDialog(null, mensagem);
			
		}else{
			
			String mensagem = "Deve ser Informado o valor de A , B e C para o calculo de Bhaskara";
			JOptionPane.showMessageDialog(null, mensagem);
		}
		
		
	}

}
