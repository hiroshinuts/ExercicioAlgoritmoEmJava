package nuts.hiro.lista03;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * 2 - Apresentar os resultados de uma tabuada de um número qualquer
	 * digitado.
	 * 
	 */

	public static void main(String[] args) {

		int numeroInformado;
		
		System.out.println("Informe a tabuada que deseja");
		Scanner scan = new Scanner(System.in);
		
		numeroInformado = scan.nextInt();
		
		for(int i = 0; i <=10; i++){
			
			System.out.println("Tabuada " + numeroInformado + " x " + i + " = " + numeroInformado*i);
			
		}
	}
}
