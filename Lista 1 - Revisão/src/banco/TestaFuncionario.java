package banco;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Lucca Giovane");
		funcionario.setCpf("111.555.799-84");
		funcionario.setSalario(3000.00);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCpf());
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getBonificacao());
	}
}
