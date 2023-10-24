package ListasParaEntrega.Lista02;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
public class GerenciadorDeSenhas
{
    protected int senha;
    GerenciadorDeSenhas()
    {

    }
    GerenciadorDeSenhas(int senha)
    {
        this.senha = senha;
    }

    /* ================================== GET/SET ================================== */

    private int getSenha()
    {
        return senha;
    }


    /* ============================ METODOS PRINCIPAIS ============================ */
    protected int gerarSenha()
    {

        SecureRandom random = new SecureRandom();

        int senha = random.nextInt(0, 9999);

        return senha;
    }

    protected int apagarSenha(int senha, ArrayList<GerenciadorDeSenhas> senhas)
    {
        for (int i = 0; i < senhas.size(); i++)
        {
            GerenciadorDeSenhas gerenciador = senhas.get(i);
            if (gerenciador.senha == senha)
            {
                senhas.remove(i);
                return 1;
            }
        }
        return 0;
    }

    protected int atenderUsuario(ArrayList<GerenciadorDeSenhas> senhas)
    {
        if(senhas.size() == 0)
        {
            return 0; // atender lista vazia
        }
        else
        {
            senhas.remove(0);
        }

        return 1;
    }

    protected int buscarPosicao(ArrayList<GerenciadorDeSenhas> senhas, int valorSenha)
    {
        Iterator<GerenciadorDeSenhas> iterator = senhas.iterator();

        int posicao = 1;

        while (iterator.hasNext())
        {
            GerenciadorDeSenhas senha = iterator.next();

            if (senha.getSenha() == valorSenha)
            {
                return posicao;
            }

            posicao++;
        }

        return -1;
    }

    protected int mostrarSenhas( ArrayList<GerenciadorDeSenhas> senhas)
    {
        if(senhas.size() == 0)
        {
            return 0;
        }

        for (GerenciadorDeSenhas senha : senhas)
        {
            System.out.printf("[%d] ",senha.senha);
        }
        System.out.printf("\n\n");

        return 1;
    }

    /* ======================= METODOS COMPLEMENTARES ======================= */

    protected void validarResultado(int valor, String tipo)
    {
        //Metodo feito para validar pontos especificos de criação, remoção etc.

        if(tipo == "senha criada")
        {
            System.out.printf("SENHA [%d]\n\n",valor);
        }
        else if(tipo == "desistencia")
        {
            if(valor == 1)
            {
                System.out.println("Desistencia efetuada!\n\n");
            }
            else
            {
                System.out.println("ERRO 2.1, Senha não encontrada. A senha não foi removida.\n\n");
            }
        } else if (tipo == "atendido")
        {
            if(valor == 1)
            {
                System.out.println("Atendimento realizado!\n\n");
            }
            else
            {
                System.out.println("ERRO 3.1, Atendimento não realizado.\n\n");
            }
        }
    }

    protected void validarResultado(int senha, int posicao, String tipo)
    {
        if(tipo == "posicao")
        {
            System.out.printf("SENHA [%d] POSICAO [%d]\n\n",senha,posicao);
        }
        else
        {
            System.out.println("ERRO 4.1, Erro na verificação.\n\n");
        }
    }

    protected int verificarTamanho(ArrayList<GerenciadorDeSenhas> senhas)
    {
        if(senhas.size() == 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    protected int verificarSeEsta(int valor, ArrayList<GerenciadorDeSenhas> senhas)
    {
        for (GerenciadorDeSenhas senha : senhas)
        {
            if (senha.senha == valor)
            {
                return 1;
            }
        }
        return 0;
    }
}

