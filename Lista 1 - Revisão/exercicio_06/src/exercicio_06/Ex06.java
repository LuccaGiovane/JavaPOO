/*Crie um programa que imprima na tela um tri�ngulo de �*�. O n�mero de n�veis do
tri�ngulo dever� ser lido do teclado. Veja um exemplo de tri�ngulo com 5 n�veis
abaixo:
*
**
***
****
******/

package exercicio_06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		int n;
		int i;
		int j;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o numero de camadas:");
		n = s.nextInt();
		
		for( i=1; i<=n; i++) {
			
			for(j=1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
