package questao03;

public class Contribuinte {
    private String nome;
    private double rendaBruta;

    public Contribuinte(String nome, double rendaBruta){
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
