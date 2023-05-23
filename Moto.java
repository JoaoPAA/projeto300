package questao04;

    public class Moto extends Veiculo {
        private int qtdeCilindradas;

        public Moto(String modelo, String cor, String placa, int qtdeCilindradas) {
            super(modelo, cor, placa);
            this.qtdeCilindradas = qtdeCilindradas;
        }

        public void imprimirDados() {
            System.out.println("Moto " + modelo + ", cor " + cor + ", placa " + placa + " e " + qtdeCilindradas + " cilindradas");
        }
    }


