package ExerciciosDeSala.Ex01;

public class Carro
{
    public String marca;
    public String modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void retornaMarcha(int velocidade)
    {
        int marcha;

        if(velocidade < 0)
        {
            velocidade *= -1;
        }
        if(velocidade == 0)
        {
            marcha = 0;
        }
        else if(velocidade < 20)
        {
            marcha = 1;
        }
        else if(velocidade >= 20 && velocidade < 40)
        {
            marcha = 2;
        }
        else if(velocidade >=40 && velocidade <60)
        {
            marcha = 3;
        }
        else if(velocidade >=60 && velocidade <80)
        {
            marcha = 4;
        }
        else
        {
            marcha = 5;
        }

        System.out.println("------ DADOS --------");
        System.out.println("Marca ["+ getMarca() +"]");
        System.out.println("Modelo ["+ getModelo()+"]");
        System.out.println("Velocidade ["+ velocidade+"]");
        System.out.println("Marcha ["+ marcha+"]");
        System.out.println("---------------------\t");
    }
}
