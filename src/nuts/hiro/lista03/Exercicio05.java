package nuts.hiro.lista03;

import java.util.Scanner;

public class Exercicio05 {

	/**
	 * 5- Elaborar um programa que possibilite calcular a área total de uma
	 * residência (sala, cozinha, banheiro, quartos, área de serviço, quintal,
	 * garagem, etc). O programa deve solicitar a entrada do nome, a largura e o
	 * comprimento de um determinado cômodo. Em seguida, deve apresentar a área
	 * do cômodo lido e também uma mensagem solicitando do usuário a confirmação
	 * de continuar calculando novos cômodos. Caso o usuário responda “NÃO”, o
	 * programa deve apresentar o valor total acumulado da área residencial.
	 * 
	 */
	
	public static void main(String[] args) {
		
		double areaTotal = 0;
		double areaComodo;
		String resposta = "s";
		
		Scanner scanner = new Scanner(System.in);
		
	
		while(resposta.equals("s") || resposta.equals("S") && resposta != "n" && resposta != "N" ){
			
		System.out.println("Digite o nome do comodo");
		String comodo = scanner.next();
		
		System.out.println("Digite o comprimento");
		double comprimento = scanner.nextDouble();
		
		System.out.println("Digite a largura");
		double largura = scanner.nextDouble();
		
		areaComodo = comprimento * largura;
		
		System.out.println("A area do " + comodo + " é de " + areaComodo + " metros.\n");
		
		areaTotal = areaTotal + areaComodo;
		
		
		System.out.println("Gostaria de calcular mais comodos? (Sim = S ou Não = N)\n");
		resposta = scanner.next();
		
		}
		
		System.out.println("O valor acumulado total dos comodos somados é de : " + areaTotal);
		
	}
	
}
