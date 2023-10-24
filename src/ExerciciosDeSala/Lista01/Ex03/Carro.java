package ExerciciosDeSala.Lista01.Ex03;

public class Carro extends MeioTransporte
{
    private int quilometragem;

    public int getQuilometragem()
    {
        return quilometragem;
    }

    public int setQuilometragem(int quilometragem)
    {
        if(quilometragem <= 999999 && quilometragem >= 0)
        {
            this.quilometragem = quilometragem;
        }

        return getQuilometragem();
    }

    @Override
    public int setVelocidade(int velocidade)
    {
        if( velocidade >= 0 && velocidade <=200)
        {
            super.setVelocidade(velocidade);
        }

        return getVelocidade();
    }
}
