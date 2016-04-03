package nuts.hiro.lista03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio07 {

	/**
	 * 7 - Ler oito elementos inteiros, armazenar em um vetor A. Construir um
	 * vetor B, com os elementos do vetor A multiplicados por 3. O elemento B[0]
	 * deve ser igual a A[0] * 3, o elemento B[1] deve ser igual a A[1] * 3, e
	 * assim por diante. Exibir o vetor B.
	 * 
	 */
	
	public static void main(String[] args) {
		
		int contadorNumero = 0;
		int multiplicacao;
		
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		
		while (contadorNumero < 8){
		
		System.out.println("Digite um numero");
		a.add(scanner.nextInt());
		
		contadorNumero++;
		
	}
	
	for (int i = 0; i < a.size(); i ++){
		
		b.add(a.get(i) * 3);
	}
	
	System.out.println(b);
}
}
