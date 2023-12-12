import java.util.Scanner;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.security.SecureRandom;

public class Main
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();


        LinkedList<ContaCorrente> contaCorrente         = new LinkedList<>();
        LinkedList<ContaInvestimento> contaInvestimento = new LinkedList<>();
        LinkedList<ContaPoupanca> contaPoupanca         = new LinkedList<>();

        int flag = 777;
        int opcao ;
        String pesquisaNumeroConta;

        System.out.println("\t\t======= Prj 4 - BANCO COM INTERFACES =======\n");

        while(flag != 0 )
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
                    String numeroConta = String.format("%09d", random.nextInt(1_000_000_000));
                    System.out.println("Numero da conta:"+ numeroConta);
                    System.out.println("Saldo da conta:");
                    BigDecimal saldo = input.nextBigDecimal();
                    System.out.println("Informe o limite desejado:");
                    BigDecimal limite = input.nextBigDecimal();

                    contaCorrente.add(new ContaCorrente(cliente, numeroConta, saldo, limite));
                    System.out.println("Conta Criada com sucesso!");

                }
                else if(opcao == 2)
                {
                    System.out.println("======= CONTA POUPANÇA =======");
                    System.out.println("Nome do titular:");
                    String cliente = input.next();
                    String numeroConta = String.format("%09d", random.nextInt(1_000_000_000));
                    System.out.println("Numero da conta:"+ numeroConta);
                    System.out.println("Saldo da conta:");
                    BigDecimal saldo = input.nextBigDecimal();
                    System.out.println("Informe o rendimento:");
                    int rendimento = input.nextInt();

                    contaPoupanca.add(new ContaPoupanca(cliente, numeroConta, saldo, rendimento));
                    System.out.println("Conta criada com sucesso!");

                }
                else if(opcao == 3)
                {
                    System.out.println("======= CONTA INVESTIMENTO =======");
                    System.out.println("Nome do titular:");
                    String cliente = input.next();
                    String numeroConta = String.format("%09d", random.nextInt(1_000_000_000));
                    System.out.println("Numero da conta:"+ numeroConta);
                    System.out.println("Saldo da conta:");
                    BigDecimal saldo = input.nextBigDecimal();

                    contaInvestimento.add(new ContaInvestimento(cliente, numeroConta, saldo));
                    System.out.println("Conta criada com sucesso!");

                }


            }
            else if(flag == 2)
            {

                System.out.println("======= SAQUE =======");
                System.out.println("Informe o tipo da conta:");
                System.out.println("[1] Conta corrente");
                System.out.println("[2] Conta poupança");
                System.out.println("[3] Conta investimento");
                opcao = input.nextInt();

                if(opcao == 1)
                {
                    System.out.println("======= SAQUE: CONTA CORRENTE =======");
                    System.out.println("Informe o numero da conta");
                    pesquisaNumeroConta = input.next();


                    for(ContaCorrente conta : contaCorrente)
                    {
                        if(conta.getNumeroConta().equals(pesquisaNumeroConta))
                        {
                            System.out.println("Conta encontrada!");
                            verificaSeAchou = 1;

                            System.out.println("Informe o valor do saque:");
                            BigDecimal valor = input.nextBigDecimal();
                            conta.sacar(valor);
                        }

                    }
                    if(verificaSeAchou == 0)
                    {
                        System.out.println("Conta bancaria nao encontrada!");
                    }

                }
                else if(opcao == 2)
                {
                    System.out.println("======= SAQUE: CONTA POUPANÇA =======");
                    System.out.println("Informe o numero da conta");
                    pesquisaNumeroConta = input.next();


                    for(ContaPoupanca conta : contaPoupanca)
                    {
                        if(conta.getNumeroConta().equals(pesquisaNumeroConta))
                        {
                            System.out.println("Conta encontrada!");
                            verificaSeAchou = 1;

                            System.out.println("Informe o valor do saque:");
                            BigDecimal valor = input.nextBigDecimal();
                            conta.sacar(valor);
                        }
                    }
                    if(verificaSeAchou == 0)
                    {
                        System.out.println("Conta bancaria nao encontrada!");
                    }


                }
                else if(opcao == 3)
                {
                    System.out.println("======= SAQUE: CONTA INVESTIMENTO =======");
                    System.out.println("Informe o numero da conta");
                    pesquisaNumeroConta = input.next();


                    for(ContaInvestimento conta : contaInvestimento)
                    {
                        if(conta.getNumeroConta().equals(pesquisaNumeroConta))
                        {
                            System.out.println("Conta encontrada!");
                            verificaSeAchou = 1;

                            System.out.println("Informe o valor do saque:");
                            BigDecimal valor = input.nextBigDecimal();
                            conta.sacar(valor);
                        }
                    }
                    if(verificaSeAchou == 0)
                    {
                        System.out.println("Conta bancaria nao encontrada!");
                    }
                }

            }
            else if(flag == 3)
            {
                System.out.println("======= ATUALIZAR RENDIMENTO =======");

                System.out.println("Informe o numero da conta:");
                pesquisaNumeroConta = input.next();

                for(ContaPoupanca conta: contaPoupanca)
                {

                    if(conta.getNumeroConta().equals(pesquisaNumeroConta))
                    {
                        System.out.println("Conta encontrada!");
                        verificaSeAchou = 1;

                        System.out.println("Informe a taxa de rendimento:");
                        BigDecimal taxaRendimento = input.nextBigDecimal();

                        conta.atualizaRendimento(taxaRendimento);
                    }
                    if(verificaSeAchou == 0)
                    {
                        System.out.println("Conta bancaria nao encontrada!");
                    }
                }


            }
            else if(flag == 4)
            {
                System.out.println("======= DEPOSITO =======");
                System.out.println("Informe o tipo da conta:");
                System.out.println("[1] Conta corrente");
                System.out.println("[2] Conta poupança");
                System.out.println("[3] Conta investimento");
                opcao = input.nextInt();

                if(opcao == 1)
                {
                    System.out.println("======= DEPOSITO: CONTA CORRENTE =======");

                    System.out.println("Informe o numero da conta");
                    pesquisaNumeroConta = input.next();


                    for(ContaCorrente conta : contaCorrente)
                    {
                        if(conta.getNumeroConta().equals(pesquisaNumeroConta))
                        {
                            System.out.println("Conta encontrada!");
                            verificaSeAchou = 1;

                            System.out.println("Informe o valor do deposito:");
                            BigDecimal valor = input.nextBigDecimal();
                            conta.depositar(valor);
                        }
                        if(verificaSeAchou == 0)
                        {
                            System.out.println("Conta bancaria nao encontrada!");
                        }
                    }

                }
                else if(opcao == 2)
                {
                    System.out.println("======= DEPOSITO: CONTA POUPANÇA =======");
                    System.out.println("Informe o numero da conta");
                    pesquisaNumeroConta = input.next();


                    for(ContaPoupanca conta : contaPoupanca)
                    {
                        if(conta.getNumeroConta().equals(pesquisaNumeroConta))
                        {
                            System.out.println("Conta encontrada!");
                            verificaSeAchou = 1;

                            System.out.println("Informe o valor do deposito:");
                            BigDecimal valor = input.nextBigDecimal();
                            conta.depositar(valor);
                        }
                        if(verificaSeAchou == 0)
                        {
                            System.out.println("Conta bancaria nao encontrada!");
                        }
                    }

                }
                else if(opcao == 3)
                {
                    System.out.println("======= DEPOSITO: CONTA INVESTIMENTO =======");

                    System.out.println("Informe o numero da conta");
                    pesquisaNumeroConta = input.next();


                    for(ContaInvestimento conta : contaInvestimento)
                    {
                        if(conta.getNumeroConta().equals(pesquisaNumeroConta))
                        {
                            System.out.println("Conta encontrada!");
                            verificaSeAchou = 1;

                            System.out.println("Informe o valor do deposito:");
                            BigDecimal valor = input.nextBigDecimal();
                            conta.depositar(valor);
                        }
                    }
                    if(verificaSeAchou == 0)
                    {
                        System.out.println("Conta bancaria nao encontrada!");
                    }
                }


            }
            else if(flag == 5)
            {
                System.out.println("======= MOSTRAR SALDO =======");

                System.out.println("Informe o tipo da conta:");
                System.out.println("[1] Conta corrente");
                System.out.println("[2] Conta poupança");
                System.out.println("[3] Conta investimento");
                opcao = input.nextInt();

                if(opcao == 1)
                {
                    System.out.println("======= SALDO: CONTA CORRENTE =======");

                    System.out.println("Informe o numero da conta");
                    pesquisaNumeroConta = input.next();


                    for(ContaCorrente conta : contaCorrente)
                    {
                        if(conta.getNumeroConta().equals(pesquisaNumeroConta))
                        {
                            System.out.println("Conta encontrada!");
                            verificaSeAchou = 1;

                            BigDecimal saldo = conta.mostraSaldo();
                            System.out.println("Saldo ["+saldo+"]");

                        }
                    }
                    if(verificaSeAchou == 0)
                    {
                        System.out.println("Conta bancaria nao encontrada!");
                    }

                }
                else if(opcao == 2)
                {
                    System.out.println("======= SALDO: CONTA POUPANÇA =======");

                    System.out.println("Informe o numero da conta");
                    pesquisaNumeroConta = input.next();


                    for(ContaPoupanca conta : contaPoupanca)
                    {
                        if(conta.getNumeroConta().equals(pesquisaNumeroConta))
                        {
                            System.out.println("Conta encontrada!");
                            verificaSeAchou = 1;

                            BigDecimal saldo = conta.mostraSaldo();
                            System.out.println("Saldo["+saldo+"]");
                        }
                    }
                    if(verificaSeAchou == 0)
                    {
                        System.out.println("Conta bancaria nao encontrada!");
                    }

                }
                else if(opcao == 3)
                {
                    System.out.println("======= SALDO: CONTA INVESTIMENTO =======");

                    System.out.println("Informe o numero da conta");
                    pesquisaNumeroConta = input.next();


                    for(ContaInvestimento conta : contaInvestimento)
                    {
                        if(conta.getNumeroConta().equals(pesquisaNumeroConta))
                        {
                            System.out.println("Conta encontrada!");
                            verificaSeAchou = 1;

                            BigDecimal saldo = conta.mostraSaldo();
                            System.out.println("Saldo["+saldo+"]");
                        }
                    }
                    if(verificaSeAchou == 0)
                    {
                        System.out.println("Conta bancaria nao encontrada!");
                    }
                }


            }
            else if(flag == 6)
            {
                System.out.println("====== CALCULAR TRIBUTOS =======");

                System.out.println("Informe o numero da conta");
                pesquisaNumeroConta = input.next();

                for(ContaInvestimento conta : contaInvestimento)
                {
                    if(conta.getNumeroConta().equals(pesquisaNumeroConta))
                    {
                        System.out.println("Conta encontrada!");
                        verificaSeAchou = 1;

                        System.out.println("informe a % da taxa de rendimento sendo um inteiro menor que 100.(ex 50% = 50)");
                        BigDecimal  taxaTributo = input.nextBigDecimal();

                        conta.calcularTributo(taxaTributo);
                    }
                    if(verificaSeAchou == 0)
                    {
                        System.out.println("Conta bancaria nao encontrada!");
                    }
                }


            }
            else if(flag == 7)
            {
                System.out.println("======= TAXA DE ADMINISTRAÇÃO =======");

                System.out.println("Informe o numero da conta");
                pesquisaNumeroConta = input.next();

                for(ContaInvestimento conta : contaInvestimento)
                {
                    if(conta.getNumeroConta().equals(pesquisaNumeroConta))
                    {
                        System.out.println("Conta encontrada!");
                        verificaSeAchou = 1;

                        System.out.println("informe a % da taxa de rendimento sendo um inteiro menor que 100.(ex 50% = 50)");
                        BigDecimal  taxaRendimento = input.nextBigDecimal();

                        conta.calcularTaxaAdministracao(taxaRendimento);
                    }
                    if(verificaSeAchou == 0)
                    {
                        System.out.println("Conta bancaria nao encontrada!");
                    }
                }


            }
            else if(flag == 0)
            {
                System.out.println("Obrigado por usar nosso banco =D");
                System.out.println("======= FIM =======");

                input.close();
            }
        }
    }

}
