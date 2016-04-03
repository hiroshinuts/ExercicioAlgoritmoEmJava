package nuts.hiro.lista01;

import java.util.Scanner;

/**
 * 1 - Solicite que o usuário digite uma temperatura em graus Celsius, leia a
 * temperatura digitada e exiba a temperatura convertida em graus Fahrenheit. A
 * fórmula de conversão é: F=(9*C+160)/5, sendo F a temperatura em Fahrenheit e
 * C a temperatura em Celsius.
 * 
 * @author hiro
 *
 */

public class Exercicio01 {

	public static void main(String[] args) {

		double f;
		double c;

		System.out.println("Digite o numero em Graus Celcius");

		Scanner scan = new Scanner(System.in);
		c = scan.nextDouble();

		f = (9 * c + 160) / 5;

		System.out.println("O valor em Fahrenheit é " + f);

	}

}
