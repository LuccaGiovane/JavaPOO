/*Construa uma calculadora de IMC (�ndice de Massa Corporal). A f�rmula do IMC �
apresentada abaixo: IMC = PESO/(ALTURA^2)*/

package exercicio_09;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		
		double H;
		double peso;
		double IMC;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe sua altura:");
		H = s.nextDouble();
		
		System.out.print("Informe seu peso:");
		peso = s.nextDouble();
		
		IMC = peso / (H * H);
		
		System.out.printf("Seu IMC � [%.2f]",IMC);
		
		s.close();
	}


}
