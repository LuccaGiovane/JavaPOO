package ExerciciosDeSala.Lista01.Ex01;

import java.math.BigDecimal;

public class Main
{
    public static void main(String []args)
    {
        Pessoa pessoa1 = new Pessoa("Mario","Lopes");
        Funcionario pessoa2 = new Funcionario();
        Professor pessoa3 = new Professor();

        pessoa2.setNome("Lucas");
        pessoa2.setSobrenome("Mendes");
        pessoa2.setSalario(BigDecimal.valueOf(2000));

        pessoa3.setNome("Rafael");
        pessoa3.setSobrenome("Lira");
        pessoa3.setSalario(BigDecimal.valueOf(500));

        System.out.println("========== PESSOAS ==========");
        System.out.println("Nome["+ pessoa1.getNomeCompleto()+"]");
        System.out.println("Nome["+ pessoa2.getNomeCompleto()+"]");
        System.out.println("Nome["+ pessoa3.getNomeCompleto()+"]");

        System.out.println("========== SALARIOS ==========");

        System.out.println("Nome["+ pessoa2.getNomeCompleto()+"]");
        System.out.println("Primeira parcela ["+ pessoa2.getSalarioPrimeiraParcela() +"]");
        System.out.println("Segunda parcela ["+ pessoa2.getSalarioSegundaParcela() +"]");

        System.out.println("");

        System.out.println("Nome["+ pessoa3.getNomeCompleto()+"]");
        System.out.println("Primeira parcela ["+ pessoa3.getSalarioPrimeiraParcela() +"]");
        System.out.println("Segunda parcela ["+ pessoa3.getSalarioSegundaParcela() +"]");

        System.out.println("==============================");

    }
}
