/*Faça um programa que percorra todos os números de 1 até 100. Para os números
ímpares, deve ser impresso um “*”, e para os números pares, devem ser impressos dois “**”.*/

package exercicio_04;

public class Ex04 {
		public static void main(String[] args) {
			int cont = 1;
			
			while(cont <= 100) {
				
				if(cont % 2 == 0) {
					System.out.println("**");
				}else {
					System.out.println("*");
				}
				
				cont++;
			
			}
		}
}
