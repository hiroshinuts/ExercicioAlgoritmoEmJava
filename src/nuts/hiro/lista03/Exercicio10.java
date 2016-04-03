package nuts.hiro.lista03;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {

	/**
	 * 10 - Ler um vetor A com 20 elementos inteiros. Construir um vetor B de
	 * mesmo tipo do vetor A, sendo cada elemento do vetor B o somatório de 1
	 * até o valor do elemento correspondente armazenado no vetor A. Se o valor
	 * do elemento do vetor A[0] for 5, o elemento correspondente do vetor B[0]
	 * deve ser 15, pois o somatório do elemento do vetor A é 1+2+3+4+5. Exibir
	 * os elementos do vetor B.
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] a = new int[20];
		int[] b = new int[20];

		for (int contador = 0; contador <= 19; contador++) {
			
			System.out.println("Digite um numero");
			a[contador] = scanner.nextInt();

		}

		for (int contador = 0; contador <= 19; contador++) {
			
			int soma = ((1 + a[contador])*a[contador])/2; // teorema de Gauss
			
			b[contador] = soma;

		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}

}
