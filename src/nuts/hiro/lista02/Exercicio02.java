package nuts.hiro.lista02;

import javax.swing.JOptionPane;
import javax.swing.text.html.parser.ParserDelegator;

/**
 * 2- Ler os valores de quatro notas escolares de um aluno. Calcular a média
 * aritmética e apresentar a mensagem “Aprovado” se a média obtida for maior ou
 * igual a 5; caso contrário, apresentar a mensagem “Reprovado”. Informar junto
 * com cada mensagem o valor da média obtida.
 * 
 * 
 * @author hiro
 *
 */

public class Exercicio02 {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite o Nome do Aluno");

		String nota1 = JOptionPane.showInputDialog("Digite a primeira nota");
		Double n1 = Double.parseDouble(nota1);

		String nota2 = JOptionPane.showInputDialog("Digite a segunda nota");
		Double n2 = Double.parseDouble(nota2);

		String nota3 = JOptionPane.showInputDialog("Digite a terceira nota");
		Double n3 = Double.parseDouble(nota3);

		String nota4 = JOptionPane.showInputDialog("Digite a quarta nota");
		Double n4 = Double.parseDouble(nota4);

		double media = (n1 + n2 + n3 + n4) / 4;

		if (media >= 5) {

			String mensagem = "O Aluno " + nome + " obteve média " + media + " e foi: APROVADO ";

			JOptionPane.showMessageDialog(null, mensagem);

		} else {

			String mensagem = "O Aluno " + nome + " obteve média " + media + " e foi: REPROVADO ";

			JOptionPane.showMessageDialog(null, mensagem);

		}

	}

}
