package ExerciciosDeSala.Lista01.Ex03;

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Carro carro = new Carro();
        MeioTransporte meioTransporte = new MeioTransporte();
        Scanner input = new Scanner(System.in);

        int tipo, opcao, iResult, velocidade, quilometragem;
        boolean flag = true,
                result;


        while(flag) {


            System.out.println("Escolha o tipo do veiculo:");
            System.out.println("[1] Carro");
            System.out.println("[2] Meio de Transporte");
            tipo = input.nextInt();

            System.out.println();// /n

            if (tipo == 1)
            {
                System.out.println();
                System.out.println("Escolha a opcao:");
                System.out.println("[1] Ligar");
                System.out.println("[2] Desligar");
                System.out.println("[3] Definir Quilometragem");
                System.out.println("[4] Definir Velocidade");

                opcao = input.nextInt();

                System.out.println();

                switch (opcao)
                {
                    case 1:

                        result = carro.ligar();

                        if (result == true)
                        {
                            System.out.println("Carro ligado");
                        }
                        else
                        {
                            System.out.println("ERRO, Carro desligado");
                        }

                        break;

                    case 2:

                        result = carro.desligar();

                        if (result == true)
                        {
                            System.out.println("Carro desligado");
                        }
                        else
                        {
                            System.out.println("ERRO, Carro ligado");
                        }

                        break;

                    case 3:

                        System.out.println("Informe o valor da Quilometragem");
                        quilometragem = input.nextInt();

                        iResult = carro.setQuilometragem(quilometragem);
                        System.out.printf("Seu Carro possui [%d]KM\n",iResult);

                        break;

                    case 4:

                        System.out.println("Informe a velocidade: ");
                        velocidade = input.nextInt();

                        iResult = carro.setVelocidade(velocidade);
                        System.out.printf("Seu Carro esta a [%d]Km/h\n",iResult);

                        break;

                    default:

                        System.out.printf("ERRO, Opcao invalida");

                        break;
                }
            }
            else if(tipo == 2)
            {
                System.out.println();
                System.out.println("Escolha a opcao:");
                System.out.println("[1] Ligar");
                System.out.println("[2] Desligar");
                System.out.println("[3] Definir Velocidade");
                opcao = input.nextInt();

                System.out.println();

                switch (opcao)
                {
                    case 1:

                        result = meioTransporte.ligar();

                        if (result == true)
                        {
                            System.out.println("Meio de Transporte ligado");
                        }
                        else
                        {
                            System.out.println("ERRO, Meio de Transporte desligado");
                        }

                        break;

                    case 2:

                        result = meioTransporte.desligar();

                        if (result == true)
                        {
                            System.out.println("Meio de Transporte desligado");
                        }
                        else
                        {
                            System.out.println("ERRO, Meio de Transporte ligado");
                        }

                        break;

                    case 3:

                        System.out.println("Informe a velocidade: ");
                        velocidade = input.nextInt();

                        iResult = carro.setVelocidade(velocidade);
                        System.out.printf("Seu Meio de Transporte esta a [%d]Km/h\n",iResult);

                        break;

                    default:

                        System.out.printf("ERRO, Opcao invalida");

                        break;
                }
            }
        }
    }
}
