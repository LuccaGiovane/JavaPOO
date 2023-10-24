package ExerciciosDeSala.Lista01.Ex02;

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Equipamento equipamento = new Equipamento();
        EquipamentoSonoro equipamentoSonoro = new EquipamentoSonoro();

        Scanner input = new Scanner(System.in);

        boolean flag = true;
        int tipoEquip, opEquip;

        while(flag)
        {
            System.out.println("Escolha o tipo de equipamento");
            System.out.println("[1] Equipamento");
            System.out.println("[2] Equipamento Sonoro");
            tipoEquip = input.nextInt();

            if(tipoEquip == 1)
            {
                System.out.println("=== Equipamento ===");
                System.out.println("[1] Ligar equipamento");
                System.out.println("[2] Desligar equipamento");
                opEquip = input.nextInt();

                switch (opEquip)
                {
                    case 1:

                        equipamento.liga();
                        System.out.println("Equipamento Ligado.");

                        break;

                    case 2:

                        equipamento.desliga();
                        System.out.println("Equipamento Desligado.");

                        break;

                    default:

                        System.out.println("ERRO");

                        break;
                }
            }
            else if(tipoEquip == 2)
            {
                System.out.println("=== Equipamento Sonoro ===");
                System.out.println("[1] Ligar equipamento");
                System.out.println("[2] Desligar equipamento");
                System.out.println("[3] Mono");
                System.out.println("[4] Stereo");
                opEquip = input.nextInt();

                switch (opEquip)
                {
                    case 1:

                        equipamentoSonoro.liga();
                        System.out.println("Equipamento Ligado.");

                        break;

                    case 2:

                        equipamentoSonoro.desliga();
                        System.out.println("Equipamento Desligado.");

                        break;

                    case 3:

                        equipamentoSonoro.mono();
                        System.out.println("[MONO]");

                        break;

                    case 4:

                        equipamentoSonoro.stereo();
                        System.out.println("[STEREO]");
                        break;

                    default:

                        System.out.println("ERRO");

                        break;
                }
            }
        }
    }
}
