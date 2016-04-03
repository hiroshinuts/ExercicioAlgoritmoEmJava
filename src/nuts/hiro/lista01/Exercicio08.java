package nuts.hiro.lista01;

import javax.swing.JOptionPane;

/**
 * 8-Faça um programa que leia 3 números e execute as seguintes atividades: 
 *- Exibir em ordem crescente os números digitados; 
 *- Exibir o maior valor  digitado; 
 *- Exibir o menor valor digitado;
 * 
 * @author hiro
 *
 */

 /**
  *  A >= B e B >= C -- A B C
  *  A >= C e C >= B -- A C B
  *  B >= A e A >= C -- B A C
  *  B >= C e C >= A -- B C A
  *  C >= A e A >= B -- C A B
  *  C >= B e B >= A -- C B A
  *  
  */

public class Exercicio08 {
	
	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Digite o Primeiro Numero : " );
		String b = JOptionPane.showInputDialog("Digite o segundo Numero : " );
		String c = JOptionPane.showInputDialog("Digite o Terceiro Numero : " );
		
		Double aNumero = Double.parseDouble(a);
		Double bNumero = Double.parseDouble(b);
		Double cNumero = Double.parseDouble(c);
		
		//A >= B e B >= C -- A B C
		if (aNumero >= bNumero && bNumero >= cNumero ){
			
			String mensagem = "Os numeros Digitados em ordem crescente são : " + aNumero + " , " + bNumero + " , " +
							cNumero + "O maior numero digitado é : " + aNumero + " e o Menor numero é : " + cNumero;
			
			JOptionPane.showMessageDialog(null, mensagem);
			
		//	A >= C e C >= B -- A C B
		}else if(aNumero >= cNumero && cNumero >= bNumero){
			
			String mensagem = "Os numeros Digitados em ordem crescente são : " + aNumero + " , " + cNumero + " , " +
					bNumero + "O maior numero digitado é : " + aNumero + " e o Menor numero é : " + bNumero;
	
			JOptionPane.showMessageDialog(null, mensagem);
		
		// B >= A e A >= C -- B A C
		}else if (bNumero >= aNumero && aNumero >= cNumero){
			
			String mensagem = "Os numeros Digitados em ordem crescente são : " + bNumero + " , " + aNumero + " , " +
					cNumero + "O maior numero digitado é : " + bNumero + " e o Menor numero é : " + cNumero;
	
			JOptionPane.showMessageDialog(null, mensagem);
			
		//B >= C e C >= A -- B C A	
		}else if(bNumero >= cNumero && cNumero >= aNumero) {
			
			String mensagem = "Os numeros Digitados em ordem crescente são : " + bNumero + " , " + cNumero + " , " +
					aNumero + "O maior numero digitado é : " + bNumero + " e o Menor numero é : " + aNumero;
	
			JOptionPane.showMessageDialog(null, mensagem);
		
		// C >= A e A >= B -- C A B	
		}else if (cNumero >= aNumero && aNumero >= bNumero) {
			
			String mensagem = "Os numeros Digitados em ordem crescente são : " + cNumero + " , " + aNumero + " , " +
					bNumero + "O maior numero digitado é : " + cNumero + " e o Menor numero é : " + bNumero;
	
			JOptionPane.showMessageDialog(null, mensagem);
		
		//C >= B e B >= A -- C B A	
		}else if (cNumero >= bNumero && bNumero >= aNumero) {
			
			String mensagem = "Os numeros Digitados em ordem crescente são : " + cNumero + " , " + bNumero + " , " +
					aNumero + "O maior numero digitado é : " + cNumero + " e o Menor numero é : " + aNumero;
	
			JOptionPane.showMessageDialog(null, mensagem);
			
		}
		
		
	}

}
