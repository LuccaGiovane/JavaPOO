/*Fa�a um programa que percorra todos os n�meros de 1 at� 100. Para os n�meros
�mpares, deve ser impresso um �*�, e para os n�meros pares, devem ser impressos dois �**�.*/

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
