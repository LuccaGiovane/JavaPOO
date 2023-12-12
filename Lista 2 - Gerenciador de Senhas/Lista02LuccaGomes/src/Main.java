import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<GerenciadorDeSenhas> senhas = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        boolean flag = true;
        int     opcao, geraSenha, senhaParaRemover, resultadoRemocao,
                resultadoAtendimento, valorSenha, posicao ;
        String  criacao = "senha criada",
                desistencia = "desistencia",
                atendimento = "atendido",
                posicaoAtual = "posicao";

        System.out.println("=============== GERENCIADOR DE SENHAS ===============");
        while (flag)
        {
            System.out.println("[1] Emitir nova senha. ");
            System.out.println("[2] Desistir da fila. ");
            System.out.println("[3] Atender usuario. ");
            System.out.println("[4] Buscar posicao na fila. ");
            System.out.println("[5] Mostrar fila. ");
            System.out.println("[0] Sair. ");
            System.out.printf("Insira a opcao desejada: ");
            opcao = input.nextInt();

            switch (opcao)
            {
                case 0:

                    flag = false;
                    break;

                case 1:

                    System.out.println("\n===== EMITINDO NOVA SENHA =====");

                    geraSenha = new GerenciadorDeSenhas().gerarSenha();
                    senhas.add(new GerenciadorDeSenhas(geraSenha));
                    senhas.get(0).validarResultado(geraSenha, criacao);

                    break;

                case 2:
                    System.out.println("\n===== DESISTINDO DA FILA =====");

                    System.out.println("Insira sua senha para a desistencia:");
                    senhaParaRemover = input.nextInt();

                    if(new GerenciadorDeSenhas().verificarSeEsta(senhaParaRemover, senhas) == 1)
                    {
                        resultadoRemocao = senhas.get(0).apagarSenha(senhaParaRemover, senhas);
                        new GerenciadorDeSenhas().validarResultado(resultadoRemocao, desistencia);
                    }
                    else
                    {
                        System.out.println("ERRO 2.2, Senha nao contida na lista.\n\n");
                    }
                    break;

                case 3:
                    System.out.println("\n===== ATENDER USUARIO =====");

                    if(new GerenciadorDeSenhas().verificarTamanho(senhas) == 0)
                    {
                        System.out.println("ERRO 3.2, Fila vazia. Atendimento não efetuado.\n\n");
                        break;
                    }
                    else
                    {
                        resultadoAtendimento = senhas.get(0).atenderUsuario(senhas);
                        new GerenciadorDeSenhas().validarResultado(resultadoAtendimento, atendimento);
                    }


                    break;

                case 4:
                    System.out.println("\n===== BUSCAR POSICAO NA FILA =====");

                    System.out.println("Insira o valor de sua senha: ");
                    valorSenha = input.nextInt();

                    if(new GerenciadorDeSenhas().verificarSeEsta(valorSenha, senhas) == 1)
                    {
                        posicao = senhas.get(0).buscarPosicao(senhas, valorSenha);
                        new GerenciadorDeSenhas().validarResultado(valorSenha, posicao,posicaoAtual);
                    }
                    else
                    {
                        System.out.println("ERRO 4.2, Senha nao contida na lista.\n\n");
                    }

                    break;

                case 5:
                    System.out.println("\n===== MOSTRANDO FILA =====");

                    if(new GerenciadorDeSenhas().mostrarSenhas(senhas) == 0)
                    {
                        System.out.println("ERRO 5.1, Lista vazia.\n\n");
                    }

                    break;

                default:

                    System.out.println("ERRO 0.0, Opcao invalida.\n\n");

                    break;
            }
        }
    }
}