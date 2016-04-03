package nuts.hiro.lista01;

import java.util.Scanner;

/**
 * 2- Efetuar o cálculo e a apresentação do valor de uma prestação em atraso,
 * utilizando a fórmula: Prestação = valor + (valor * (taxa / 100) * tempo). O
 * programa deverá solicitar que o usuário digite os valores necessários para
 * efetuar o cálculo.
 * 
 * @author hiro
 */

public class Exercicio02 {

	public static void main(String[] args) {

		double prestacao;
		double valor;
		double taxa;
		double tempo;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor");
		valor = scanner.nextDouble();

		System.out.println("Digite a taxa");
		taxa = scanner.nextDouble();

		System.out.println("Digite o tempo");
		tempo = scanner.nextDouble();

		prestacao = valor + (valor * (taxa / 100) * tempo);

		System.out.println("O valor da prestacao é : " + prestacao);

	}

}
