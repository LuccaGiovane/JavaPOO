package banco;

//Gerente herda da class Funcionario 
public class Gerente extends Funcionario {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autenticaSenha(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();// super � tipo um
							  //'this' mas indica q o 
							 // atributo esta na class 'Funcionario(class 
							// mae)'
	}
	
}
