/*Fa�a um programa que percorra todos os n�meros de 1 at� 100. Para os n�meros
m�ltiplos de 4, imprima a palavra �PI�, e para os outros, imprima o pr�prio n�mero.*/

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
