/*Fa�a um programa que imprima na tela o seu nome 100 vezes. O seu nome deve
ser passado como par�metro para o programa.*/

package exercicio_01;

public class Ex01 {
	public static void main(String[] args) {
		int cont = 0;
		
		while (cont < 100) {
	
			System.out.println(args[0]);
			
			cont ++;
	
		}
	}
}
