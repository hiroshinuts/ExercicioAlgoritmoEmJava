package nuts.hiro.lista03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio06 {

	/**
	 * 
	 * 6 - Efetuar a leitura de dez nomes de pessoas, armazená-los em um vetor e
	 * exibi-los em seguida.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int contadorNomes = 0;
		ArrayList<String> nomes = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		while (contadorNomes < 10) {

			System.out.println("Digite um nome : ");
			nomes.add(scanner.nextLine());

			contadorNomes++;

		}

		System.out.println(nomes);
	}

}
