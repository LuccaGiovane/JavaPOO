package banco;

public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setNome("José Maria");
		gerente.setCpf("123.456.789-00");
		gerente.setSalario(2000);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		boolean autenticou = gerente.autenticaSenha(147532);
		System.out.println(autenticou);//false
		
		gerente.setSenha(147532);
		autenticou = gerente.autenticaSenha(147532);
		System.out.println(autenticou);
		
		System.out.println(gerente.getBonificacao());

	}
}
