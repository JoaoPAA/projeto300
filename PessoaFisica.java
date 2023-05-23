package questao03;

public class PessoaFisica  extends Contribuinte{

    private String cpf;

    public PessoaFisica(String nome, double rendaBruta, String cpf){
        super(nome, rendaBruta);

    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public double calcularIR(){
        double ir;
        double renda = super.getRendaBruta();

        if (renda <= 1903.98) {
            ir = 0;
        } else if (renda <= 2826.65) {
            ir = (renda - 1903.98) * 0.075;
        } else if (renda <= 3751.05) {
            ir = (renda - 2826.65) * 0.15 + 142.80;
        } else if (renda <= 4664.68) {
            ir = (renda - 3751.05) * 0.225 + 354.80;
        } else {
            ir = (renda - 4664.68) * 0.275 + 636.13;
        }

        return ir;

    }

    public void imprimirIR(){
        System.out.printf("O valor do Imposto de Renda a ser pago por %s é R$ %. 2f. \n", super.getNome(), calcularIR());

    }
}
