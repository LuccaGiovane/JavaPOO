/*Crie um programa que imprima na tela v�rios tri�ngulos de �*�. O n�mero de n�veis
do tri�ngulo e a quantidade de tri�ngulos dever�o ser lidos do teclado. Veja um
exemplo abaixo com dois tri�ngulos de tr�s n�veis cada:
*
**
***
*
**
****/

package exercicio_07;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {

		int n;
		int i;
		int j;
		int quant;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o numero de camadas:");
		n = s.nextInt();
		System.out.print("Informe a quantidade de triangulos:");
		quant = s.nextInt();
		
		for(int triangulos = 1; quant >= triangulos; triangulos++) {
			
			for( i=1; i<=n; i++) {
				
				for(j=1; j<= i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	s.close();	
	}
}
