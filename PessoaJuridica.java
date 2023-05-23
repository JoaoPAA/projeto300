package questao03;


class PessoaJuridica extends Contribuinte {
    private String cnpj; // Atributo CNPJ


    public PessoaJuridica(String nome, double rendaBruta, String cnpj) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double calcularIR() {
        return super.getRendaBruta() * 0.1;
    }

    public void imprimirIR() {
        System.out.printf("O valor do Imposto de Renda a ser pago pela empresa %s é R$ %.2f.\n", super.getNome(), calcularIR());
    }
}

