package nuts.hiro.lista03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio08 {

	/**
	 * 8 - Ler 15 elementos inteiros em um vetor A. Construir um vetor B, de
	 * mesmo tipo, observando a seguinte lei de formação: “todo elemento do
	 * vetor B deve ser o quadrado do elemento do vetor A correspondente”.
	 * Exibir os elementos dos vetores A e B.
	 * 
	 */
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Double> a = new ArrayList<>();
		ArrayList<Double> b = new ArrayList<>();
		
		for(int i = 0 ; i < 15; i++){
			
			System.out.println("Escreva um numero");
			a.add(i, scanner.nextDouble());
			
			b.add(i, a.get(i) * Math.pow(a.get(i), 2));
			
		}
		System.out.println("Array A : ");
		System.out.println(a);
		System.out.println("Array B : ");
		System.out.println(b);
		
	}
}
