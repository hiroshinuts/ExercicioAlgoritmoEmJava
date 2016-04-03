package nuts.hiro.lista03;

import java.util.Scanner;

public class Exercicio04 {

	/**
	 * 4 - Elaborar um programa que efetue e a leitura sucessiva de valores
	 * numéricos e apresente no final o somatório, a média e o total de valores
	 * lidos. O programa deve fazer as leituras dos valores enquanto o usuário
	 * estiver fornecendo valores positivos. Ou seja, o programa deve parar
	 * quando o usuário fornecer um valor negativo (menor que zero).
	 * 
	 */

	public static void main(String[] args) {

		double soma = 0;
		double numero = 0;
		int contador = 0;

		while (numero >= 0) {

			System.out.println("Digite um numero para ser somado");
			Scanner scanner = new Scanner(System.in);
			numero = scanner.nextDouble();

			if (numero >= 0) {
				contador++;
				soma = soma + numero;
			}

		}

		System.out.println("O somatorio dos numeros é : " + soma);
		System.out.println("A média dos valores somados é de : " + soma / contador);
		System.out.println("A quantidade de numeros somados é de : " + contador);

	}

}
