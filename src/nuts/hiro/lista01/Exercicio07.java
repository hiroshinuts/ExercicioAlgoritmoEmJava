package nuts.hiro.lista01;

import javax.swing.JOptionPane;

/***
 * 7-Elaborar um programa que calcule o valor do volume de uma esfera. Utilize a
 * fórmula: Volume=(4/3)*3.14159*(raio^3).
 * 
 * 
 * @author hiro
 *
 */

public class Exercicio07 {
	
	
	public static void main(String[] args) {

		double Pi = 3.14159;
		
		String raio = JOptionPane.showInputDialog("Digite o valor do Raio");
		
		Double valorRaio = Double.parseDouble(raio);
		
		Double volume = ((4/3)* Pi *( Math.pow(valorRaio, 3) ));
		
		String mensagem =  "O volume da esfera conforme o raio informado é : " + volume;
		
		JOptionPane.showMessageDialog(null, mensagem);
		
		
		
	}

}
