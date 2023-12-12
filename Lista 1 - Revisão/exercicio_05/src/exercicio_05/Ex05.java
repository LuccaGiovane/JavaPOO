/*Faça um programa que percorra todos os números de 1 até 100. Para os números
múltiplos de 4, imprima a palavra “PI”, e para os outros, imprima o próprio número.*/

package exercicio_05;

public class Ex05 {
	public static void main(String[] args) {
		int cont = 1;
		
		while(cont <= 100) {
			
			if(cont % 4 == 0) {
				System.out.println("PI");
			}else {
				System.out.println(cont);
			}
			
			cont++;
			
		}
	}

}
