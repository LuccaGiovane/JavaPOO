import java.util.Scanner;
import java.math.BigDecimal;
import java.util.LinkedList;


public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        LinkedList<ContaBancaria> contas = new LinkedList<>();

        int flag = 0;

        while(flag != 5)
        {
            System.out.println("==== Selecione a operação desejada ==== ");
            System.out.println("[1] Cadastrar nova conta");
            System.out.println("[2] Saque");
            System.out.println("[3] Nova taxa da poupança");
            System.out.println("[4] Deposito");
            System.out.println("[5] Finalizar operaçoes");

            flag = input.nextInt();
            input.nextLine();


            if(flag == 1)
            {
                System.out.println("====== Cadastro de Conta =====");
                System.out.println("*Insira as informaçoes pedidas");


                System.out.println("Nome do titular:");
                String nome = input.nextLine();
                System.out.println("Numero da conta:");
                String numero = input.nextLine();
                System.out.println("Saldo da conta:");
                BigDecimal saldo = input.nextBigDecimal();

                System.out.println("Tipo de conta a ser criada:");
                System.out.println("[1] Conta corrente");
                System.out.println("[2] Conta poupança");
                int tipo = input.nextInt();

                if(tipo == 1)
                {
                    System.out.println("Informe o limite desejado:");

                    BigDecimal limite = input.nextBigDecimal();
                    contas.add(new ContaCorrente(nome, numero, saldo, limite));

                }
                else if(tipo == 2)
                {
                    System.out.println("Informe a porcentagem de rendimento da conta:");

                    int taxa = input.nextInt();
                    contas.add(new ContaPoupanca(nome, numero, saldo, taxa));
                }

            }
            else if(flag == 2)
            {
                System.out.println("Informe o numero da conta:");
                String numero = input.nextLine();

                System.out.println("Informe o valor a ser sacado:");
                BigDecimal valor = input.nextBigDecimal();


                for(ContaBancaria conta : contas)
                {
                    if(conta.getNumeroCliente().equals(numero))
                    {
                        conta.sacar(valor);
                    }
                }
            }
            else if(flag == 3)
            {

                System.out.println("Informe o numero da conta:");
                String numero = input.nextLine();

                for(ContaBancaria conta : contas)
                {
                    if(conta.getNumeroCliente().equals(numero))
                    {
                        ((ContaPoupanca) conta).calcularNovoSaldo();
                    }
                }
            }
            else if(flag == 4)
            {
                System.out.println("Informe o numero da conta:");
                String numero = input.nextLine();

                System.out.println("Informe o valor do deposito:");
                BigDecimal valor = input.nextBigDecimal();

                for(ContaBancaria conta : contas)
                {
                    if(conta.getNumeroCliente().equals(numero))
                    {
                        conta.depositar(valor);
                    }
                }
            }
            else if(flag == 5)
            {
                System.out.println("===== FIM =====");
                flag = 5;
            }
            else
            {
                System.out.println("Operação invalida!");
            }
        }
        input.close();
    }
}