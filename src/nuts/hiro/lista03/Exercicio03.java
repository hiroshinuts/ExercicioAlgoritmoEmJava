package nuts.hiro.lista03;

public class Exercicio03 {

	/**
	 * 3 - Apresentar todos os números divisíveis por 4 que sejam menores que
	 * 200. Para verificar se o número é divisível por 4, efetuar dentro da
	 * malha a verificação lógica desta condição com a instrução se, perguntando
	 * se o número é divisível; sendo, mostre-o, não sendo, passe para o próximo
	 * passo. A variável que controlará o contador deve ser iniciada com valor
	 * 1.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 200; i++){
			
			if(i%4 ==0){
				
				System.out.println(i);
				
			}
			
		}
		
	}
	
}
