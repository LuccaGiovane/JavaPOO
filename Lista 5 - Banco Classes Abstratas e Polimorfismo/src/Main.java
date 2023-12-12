import java.util.Scanner;
import java.math.BigDecimal;
import java.util.LinkedList;


public class Main
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        LinkedList<Object> contasBancarias = new LinkedList<>();

        int flag = 777;
        int opcao;
        String pesquisaNumeroConta;

        System.out.println("\t\t======= Prj 4 - BANCO COM CLASSES ABSTRATAS =======\n");

        while(flag != 0)
        {
            int verificaSeAchou = 0;

            System.out.println("========== INFORME A OPERAÇÃO DESEJADA ==========");

            System.out.println("[1] Cadastrar uma conta");
            System.out.println("[2] Sacar um valor da conta");
            System.out.println("[3] Atualizar uma conta poupança com o seu rendimento");
            System.out.println("[4] Depositar um determinado valor na conta");
            System.out.println("[5] Mostrar o saldo de uma conta");
            System.out.println("[6] Calcular os tributos de uma conta");
            System.out.println("[7] Calcular a taxa de administração de uma conta investimento");
            System.out.println("[0] Sair");
            System.out.println("Informe a opçao desejada: ");
            flag = input.nextInt();


            if(flag == 1)
            {

                System.out.println("======= CADASTRO DE NOVA CONTA =======");
                System.out.println("Informe o tipo da conta:");
                System.out.println("[1] Conta corrente");
                System.out.println("[2] Conta poupança");
                System.out.println("[3] Conta investimento");
                opcao = input.nextInt();


                if(opcao == 1)
                {
                    System.out.println("======= CONTA CORRENTE =======");

                    System.out.println("Nome do titular:");
                    String cliente = input.next();
                    System.out.println("Numero da conta:");
                    String numeroConta = input.next();

                    /* Design Patterns: Gambiarrator*/
                    boolean contaExistente = false;
                    for (Object conta : contasBancarias)
                    {
                        if (((ContaBancaria) conta).getNumeroConta().equals(numeroConta))
                        {
                            System.out.println("Criação de conta não efetuada! \n" +
                                    "Uma conta com o número [" + numeroConta + "] ja existe.\n" +
                                    "Tente novamente com um outro número.\n");
                            contaExistente = true;
                            break;
                        }
                    }
                    if (!contaExistente)
                    {
                        System.out.println("Saldo da conta:");
                        BigDecimal saldo = input.nextBigDecimal();
                        System.out.println("Informe o limite desejado:");
                        BigDecimal limite = input.nextBigDecimal();

                        contasBancarias.add(new ContaCorrente(cliente, numeroConta, saldo, limite));
                        System.out.println("Conta Criada com sucesso!");
                    }

                }
                else if(opcao == 2)
                {
                    System.out.println("======= CONTA POUPANÇA =======");
                    System.out.println("Nome do titular:");
                    String cliente = input.next();
                    System.out.println("Numero da conta:");
                    String numeroConta = input.next();

                    /* Design Patterns: Gambiarrator*/
                    boolean contaExistente = false;
                    for (Object conta : contasBancarias)
                    {
                        if (((ContaBancaria) conta).getNumeroConta().equals(numeroConta))
                        {
                            System.out.println("Criação de conta não efetuada! \n" +
                                    "Uma conta com o número [" + numeroConta + "] ja existe.\n" +
                                    "Tente novamente com um outro número.\n");
                            contaExistente = true;
                            break;
                        }
                    }
                    if (!contaExistente)
                    {

                        System.out.println("Saldo da conta:");
                        BigDecimal saldo = input.nextBigDecimal();
                        System.out.println("Informe o rendimento:");
                        int rendimento = input.nextInt();

                        contasBancarias.add(new ContaPoupanca(cliente, numeroConta, saldo, rendimento));
                        System.out.println("Conta criada com sucesso!");
                    }

                }
                else if(opcao == 3)
                {
                    System.out.println("======= CONTA INVESTIMENTO =======");
                    System.out.println("Nome do titular:");
                    String cliente = input.next();
                    System.out.println("Numero da conta:");
                    String numeroConta = input.next();

                    /* Design Patterns: Gambiarrator*/
                    boolean contaExistente = false;
                    for (Object conta : contasBancarias)
                    {
                        if (((ContaBancaria) conta).getNumeroConta().equals(numeroConta))
                        {
                            System.out.println("Criação de conta não efetuada! \n" +
                                    "Uma conta com o número [" + numeroConta + "] ja existe.\n" +
                                    "Tente novamente com um outro número.\n");
                            contaExistente = true;
                            break;
                        }
                    }
                    if (!contaExistente)
                    {

                        System.out.println("Saldo da conta:");
                        BigDecimal saldo = input.nextBigDecimal();

                        contasBancarias.add(new ContaInvestimento(cliente, numeroConta, saldo));
                        System.out.println("Conta criada com sucesso!");
                    }
                }
            }


            else if(flag == 2)
            {

                System.out.println("======= SAQUE =======");

                System.out.println("Informe o numero da conta");
                pesquisaNumeroConta = input.next();


                for(Object conta : contasBancarias)
                {
                    if(((ContaBancaria)conta).getNumeroConta().equals(pesquisaNumeroConta))
                    {
                        System.out.println("Conta encontrada!");
                        verificaSeAchou = 1;

                        System.out.println("Informe o valor do saque:");
                        BigDecimal valor = input.nextBigDecimal();
                        ((ContaBancaria)conta).sacar(valor);

                    }
                    if(verificaSeAchou == 0)
                    {
                        System.out.println("Conta bancaria nao encontrada!\n");
                    }
                }
                if(verificaSeAchou == 0)
                {
                    System.out.println("Conta bancaria nao encontrada!\n");
                }
            }


            else if(flag == 3)
            {
                System.out.println("======= ATUALIZAR RENDIMENTO =======");

                System.out.println("Informe o numero da conta:");
                pesquisaNumeroConta = input.next();

                for (Object conta : contasBancarias)
                {
                    if (conta instanceof ContaPoupanca &&
                            ((ContaPoupanca) conta).getNumeroConta().equals(pesquisaNumeroConta))
                    {
                        System.out.println("Conta encontrada!");
                        verificaSeAchou = 1;

                        System.out.println("Informe a taxa de rendimento:");
                        BigDecimal taxaRendimento = input.nextBigDecimal();

                        ((ContaPoupanca) conta).atualizarRendimento(taxaRendimento);
                    }
                }
                if (verificaSeAchou == 0)
                {
                    System.out.println("Conta poupança não encontrada ou conta não é poupança!\n");
                }
            }


            else if(flag == 4)
            {
                System.out.println("======= DEPOSITO =======");


                System.out.println("Informe o numero da conta");
                pesquisaNumeroConta = input.next();


                for(Object conta : contasBancarias)
                {
                    if(((ContaBancaria) conta).getNumeroConta().equals(pesquisaNumeroConta))
                    {
                        System.out.println("Conta encontrada!");
                        verificaSeAchou = 1;

                        System.out.println("Informe o valor do deposito:");
                        BigDecimal valor = input.nextBigDecimal();
                        ((ContaBancaria) conta).depositar(valor);
                    }
                }
                if(verificaSeAchou == 0)
                {
                    System.out.println("Conta bancaria nao encontrada!\n");
                }
            }


            else if(flag == 5)
            {
                System.out.println("======= MOSTRAR SALDO =======");

                System.out.println("Informe o numero da conta");
                pesquisaNumeroConta = input.next();


                for(Object conta : contasBancarias)
                {
                    if(((ContaBancaria) conta).getNumeroConta().equals(pesquisaNumeroConta))
                    {
                        System.out.println("Conta encontrada!");
                        verificaSeAchou = 1;

                        System.out.println("Saldo: R$" + ((ContaBancaria) conta).getSaldo());
                    }
                }
                if(verificaSeAchou == 0)
                {
                    System.out.println("Conta bancaria nao encontrada!\n");
                }
            }


            else if(flag == 6)
            {

                System.out.println("====== CALCULAR TRIBUTOS =======");

                System.out.println("Informe o numero da conta");
                pesquisaNumeroConta = input.next();

                for (Object conta : contasBancarias)
                {
                    if (conta instanceof ContaInvestimento &&
                            ((ContaInvestimento) conta).getNumeroConta().equals(pesquisaNumeroConta))
                    {
                        System.out.println("Conta encontrada!");
                        verificaSeAchou = 1;

                        System.out.println("Informe a % da taxa de rendimento sendo um " +
                                "inteiro menor ou igual a 100. (ex 50% = 50)");
                        BigDecimal taxaTributo = input.nextBigDecimal();

                        ((ContaInvestimento) conta).calcularTributo(taxaTributo);
                    }
                }
                if (verificaSeAchou == 0)
                {
                    System.out.println("Conta investimento não encontrada ou conta não é investimento!\n");
                }
            }


            else if(flag == 7)
            {

                System.out.println("======= TAXA DE ADMINISTRAÇÃO =======");

                System.out.println("Informe o numero da conta");
                pesquisaNumeroConta = input.next();

                for (Object conta : contasBancarias)
                {
                    if (conta instanceof ContaInvestimento &&
                            ((ContaInvestimento) conta).getNumeroConta().equals(pesquisaNumeroConta))
                    {
                        System.out.println("Conta encontrada!");
                        verificaSeAchou = 1;

                        System.out.println("Informe a % da taxa de rendimento sendo um " +
                                "inteiro menor ou igual a 100. (ex 50% = 50)");
                        BigDecimal taxaRendimento = input.nextBigDecimal();

                        ((ContaInvestimento) conta).calcularTaxaAdministracao(taxaRendimento);
                    }
                }
                if (verificaSeAchou == 0)
                {
                    System.out.println("Conta investimento não encontrada ou conta não é investimento!\n");
                }


            }


            else if(flag == 0)
            {
                System.out.println("\t\t======= FIM =======");

                input.close();
            }
            else
            {
                System.out.println("Opção inválida!\n");
            }
        }
    }
}
