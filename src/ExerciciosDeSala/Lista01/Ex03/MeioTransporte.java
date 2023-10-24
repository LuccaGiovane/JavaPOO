package ExerciciosDeSala.Lista01.Ex03;

public class MeioTransporte
{
    private boolean ligado;
    private int velocidade;


    public void setLigado(boolean ligado)
    {
        this.ligado = ligado;
    }

    public int setVelocidade(int velocidade)
    {
        if(velocidade >= 0)
        {
            this.velocidade = velocidade;
        }

        return getVelocidade();
    }

    public int getVelocidade()
    {
        return velocidade;
    }

    protected boolean ligar()
    {
        setLigado(true);

        return true;
    }
    protected boolean desligar()
    {
        setLigado(false);
        setVelocidade(0);

        return true;
    }
}
