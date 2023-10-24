package ExerciciosDeSala.Ex12;

import java.util.ArrayList;


public class Bomba
{
    private ArrayList<Combustivel> combustiveis;
    private int numeroDeIdentificacao;

    public void setNumeroDeIdentificacao(int numeroDeIdentificacao)
    {
        this.numeroDeIdentificacao = numeroDeIdentificacao;
    }

    public int getNumeroDeIdentificacao()
    {
        return numeroDeIdentificacao;
    }

    public ArrayList<Combustivel> getCombustiveis()
    {
        return combustiveis;
    }

    public void setCombustiveis(ArrayList<Combustivel> combustiveis)
    {
        this.combustiveis = combustiveis;
    }

}
