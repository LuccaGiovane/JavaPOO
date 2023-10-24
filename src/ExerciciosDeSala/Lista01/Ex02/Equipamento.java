package ExerciciosDeSala.Lista01.Ex02;

public class Equipamento
{
    private boolean ligado;

    public void setLigado(boolean ligado)
    {
        this.ligado = ligado;
    }

    protected void liga()
    {
        setLigado(true);
    }

    protected void desliga()
    {
        setLigado(false);
    }

}
