package ExerciciosDeSala.Ex10;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        ArrayList<Integer> senhas = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        SecureRandom s = new SecureRandom();

        boolean flag = true;

        int opcao,buscaSenha,guiche, senha = 0;
        String decisao;

        System.out.println("===============================");
        while(flag)
        {

            System.out.println("Escolha a opcao desejada: ");
            System.out.println("(1) Emitir nova senha. ");
            System.out.println("(2) Desistir da fila. ");
            System.out.println("(3) Atender usuario. ");
            System.out.println("(4) Buscar posicao na fila. ");
            System.out.println("(5) Mostrar fila. ");
            System.out.println("(0) Sair. ");

            opcao = input.nextInt();

            switch (opcao)
            {
                case 0:
                    flag = false;
                    break;

                case 1:
                    senha = s.nextInt();
                    senhas.add(senha);

                    System.out.printf("Sua senha é %d\n",senha);
                    break;

                case 2:
                    System.out.println("Insira sua senha:");
                    buscaSenha = input.nextInt();

                    if(senhas.contains(buscaSenha))
                    {
                        System.out.printf("Desistir? [SIM/NAO]\n");
                        decisao = input.next();

                        if(decisao == "SIM" || decisao == "sim")
                        {
                            senhas.remove(buscaSenha);
                            System.out.println("Desistencia Efetuada");
                        }
                    }

                    break;

                case 3:
                    buscaSenha = senhas.get(0);
                    guiche = s.nextInt(1, 5);

                    System.out.printf("Senha [%d] por favor dirigir-se ao guiche [%d]",buscaSenha,guiche);

                    senhas.remove(buscaSenha);//remove o valor especificado

                    break;

            }
        }



    }
}
