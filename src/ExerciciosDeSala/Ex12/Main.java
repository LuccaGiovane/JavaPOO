package ExerciciosDeSala.Ex12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String... args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o identificador " + "da bomba");
        int idBomba = sc.nextInt();

        Bomba bomba = new Bomba();
        ArrayList<Combustivel> combustiveis = new ArrayList<Combustivel>();

        bomba.setNumeroDeIdentificacao(idBomba);

        boolean continuar = true;

        while (continuar)
        {
            System.out.println("Digite o nome do combustivel");
            String nomeCombustivel = sc.next();
            System.out.println("Digite o preco do combustivel");
            double precoCombustivel = sc.nextDouble();

            Combustivel combustivel = new Combustivel();

            combustivel.setCombustivel(nomeCombustivel);
            combustivel.setPreco(precoCombustivel);
            combustiveis.add(combustivel);

            System.out.println( "Deseja continuar?\n" +
                                "[Sim]\n" +
                                "[Nao]\n");
            sc.nextLine();
            String desejaContinuar = sc.nextLine().toLowerCase();
            if (!desejaContinuar.equals("sim"))
            {
                continuar = false;
            }
        }

        bomba.setCombustiveis(combustiveis);

        continuar = true;

        while (continuar)
        {
            System.out.println("Digite 1 para abastecer por litros");
            System.out.println("Digite 2 para abastecer por dinheiro");
            int opcao = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite o codigo do combustivel.\nCodigo(s) da(s) Bomba(s):  ");
            for (int i = 0; i < bomba.getCombustiveis().size(); i++)
            {
                System.out.print(i+"-"+bomba.getCombustiveis().get(i).getCombustivel()+", ");
            }
            System.out.println("");
            int codigoCombust = sc.nextInt();

            if (opcao == 1)
            {
                System.out.println("Digite a quantidade de litros");
                int qtdeLitrosEscolhida = sc.nextInt();
                double dinheiro = bomba.getCombustiveis().get(codigoCombust).abastecerLitros(qtdeLitrosEscolhida);
                System.out.printf("O total da conta e de [R$ %.2f] \n", dinheiro);

            }
            else if (opcao == 2)
            {
                System.out.println("Digite a quantidade de dinheiro");
                double qtdeDinheiroEscolhida = sc.nextDouble();
                double litros = bomba.getCombustiveis().get(codigoCombust).abastecerDinheiro(qtdeDinheiroEscolhida);
                System.out.printf("Foram abastecidos [%.2f] litros \n", litros);
            }
            else
            {
                System.out.println("Opcao inexistente");
            }

            System.out.println( "Deseja continuar?\n" +
                    "[Sim]\n" +
                    "[Nao]\n");
            sc.nextLine();
            String desejaContinuar = sc.nextLine().toLowerCase();
            if (!desejaContinuar.equals("sim"))
            {
                continuar = false;

                System.out.println("───────────▀▄                ▄▌▐▀▀▀▀▀▀▀▀▀▀▀▀▌──────\n" +
                        "──█▄▄▄▄▄███▀▄─▄▄          ▄▄██▌█░░░░░░░░░░░░▐───\n" +
                        "▄▀──▀▄─▀▀█▀▀▄▀──▀▄     ▄▄▄▌▐██▌█░░░░o<-<░░░░▐\n" +
                        "▀▄▀▀█▀▀████─▀▄──▄▀     ███████▌█▄▄▄▄▄▄▄▄▄▄▄▄▌\n" +
                        "──▀▀──────────▀▀       ▀❍▀▀▀▀▀▀▀❍❍▀▀▀▀▀▀❍❍▀");

            }
        }
    }
}
