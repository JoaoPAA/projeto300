package questao04;

public class Veiculo {

    protected String modelo;
    protected String cor;
    protected String placa;

    public Veiculo(String modelo, String cor, String placa) {
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;

    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public class Main {
        public static void main(String[] args) {
            Carro carro = new Carro("Fusca", "Preto", "ABC1234", 2);
            Moto moto = new Moto("CG 125", "Vermelho", "DEF5678", 125);

            carro.imprimirDados();
            moto.imprimirDados();
        }
    }
}