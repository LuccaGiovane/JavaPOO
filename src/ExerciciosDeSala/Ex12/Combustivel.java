package ExerciciosDeSala.Ex12;

public class Combustivel
{
        private String nome;

        private double preco;

        private String combustivel;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public double abastecerLitros(double qtdeLitros){
            double valorDinheiro = qtdeLitros*this.preco;
            return valorDinheiro;
        }

        public double abastecerDinheiro(double qtdeDinheiro){
            double qtdeLitros = qtdeDinheiro/this.preco;
            return qtdeLitros;
        }
}

