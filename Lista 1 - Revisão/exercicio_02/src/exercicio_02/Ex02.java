package exercicio_02;

public class Ex02 {
	public static void main(String[] args) {
		// nos arg passa primeiro o nome dps o numero -> args["Nome"][numero]
			String valor = args[1];
			int valorConvertido = Integer.parseInt(valor);
					
			for(int i=0; i<valorConvertido; i++) {
				System.out.println(args[0]);
			}
			
		}
}
