/*Crie um programa que receba como entrada um valor inteiro n e responda na sa�da
o valor da n-�sima posi��o da cadeia de Fibonacci.*/

package exercicio_08;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 0;
		int numDado;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe an-esima  posicao da sequencia Fibonacci desejada:");
		numDado = s.nextInt();
		
		for(int i = 0; i < (numDado - 2); i++) {
			
			num1 = num1 + num2;
			num2 = num1 - num2;
			
		}
		
		System.out.printf("Na posi��o [%d] da sequencia Fibonacci esta o numero [%d]", numDado, num1);
		
		s.close();
		
	}
}
