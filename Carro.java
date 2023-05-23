package questao04;

public class Carro extends Veiculo {
    private int qtdePortas;

    public Carro(String modelo, String cor, String placa, int qtdePortas) {
        super(modelo, cor, placa);
        this.qtdePortas = qtdePortas;
    }

    public void imprimirDados() {
        System.out.println("Carro " + modelo + ", cor " + cor + " e placa " + placa);
    }



}