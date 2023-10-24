package ExerciciosDeSala.Lista01.Ex02;

public class EquipamentoSonoro extends Equipamento
{
    private short volume;
    private boolean stereo;


    public short getVolume()
    {
        return volume;
    }
    public void setVolume(short volume)
    {
        if(volume >= 0 && volume <= 10)
        {
            this.volume = volume;
        }
        else
        {
            System.out.println("Erro, volume precisa estar entre [0] e [10].");
        }

    }

    public void setStereo(boolean stereo)
    {
        this.stereo = stereo;
    }

    protected void mono()
    {
        setStereo(false);
    }
    protected void stereo()
    {
        setStereo(true);
    }

    @Override
    protected void liga()
    {
        setVolume((short) 5);
    }
}
