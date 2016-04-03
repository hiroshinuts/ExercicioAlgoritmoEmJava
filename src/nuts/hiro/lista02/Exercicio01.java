package nuts.hiro.lista02;

import javax.swing.JOptionPane;

public class Exercicio01 {

	/*
	 * 1 - Ler dois valores numéricos inteiros e apresentar o resultado da
	 * diferença do maior valor pelo menor valor.
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		String numero1 = JOptionPane.showInputDialog("Digite o Primeiro Numero");
		
		String numero2 = JOptionPane.showInputDialog("Digite o Segundo Numero");
		
		Double n1 = Double.parseDouble(numero1);
		Double n2 = Double.parseDouble(numero2);
		
		if (n1 >= n2){
			
			double valor = n1 - n2;
			
			String mensagem = " A diferença do Maior pelo menor valor é de: " + valor;
			
			JOptionPane.showMessageDialog(null, mensagem);
		
		}else {
		
			double valor = n2 - n1;
			
			String mensagem = " A diferença do Maior pelo menor valor é de : " + valor;
			
			JOptionPane.showMessageDialog(null, mensagem);
			
			
		}
			
			
		
		
	}

}
