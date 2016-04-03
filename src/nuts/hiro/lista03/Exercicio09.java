package nuts.hiro.lista03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio09 {

	/**
	 * 9 - Ler 20 elementos do tipo real em um vetor A e construir um vetor B,
	 * com os mesmos elementos do vetor A, porém de forma invertida. Ou seja, o
	 * primeiro elemento do vetor A passa a ser o último do vetor B, o segundo
	 * elemento do vetor A passa a ser o penúltimo do vetor B e assim por
	 * diante. Exibir os elementos dos vetores
	 * 
	 */

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		double[] a = new double[20];
		double[] b = new double[20];
		
		System.out.println("Digite um numero");
		
		for(int contador = 0; contador <=19;  contador ++){
			a[contador] = scanner.nextDouble();
			
		}
		for(int contador = 0; contador <=19; contador++){
			b[contador] = a[19 - contador];
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}
}