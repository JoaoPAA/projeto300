package questao01;

import java.util.Scanner;

public class CauculoMensalidade {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double mensalidade;
        int numeroIrmaos;
        double desconto = 0;

        System.out.println("Digite o valor da mensalidade:");
        mensalidade = ler.nextDouble();

        System.out.println("Digite o número de irmãos");
        numeroIrmaos = ler.nextInt();

        if (numeroIrmaos == 1){
            desconto = 0.05;
        }else if (numeroIrmaos == 2){
            desconto = 0.10;
        }else if (numeroIrmaos > 2){
            desconto = 0.15;
        }

        double valorAPagar = mensalidade - (mensalidade * desconto);

        System.out.println("O valor a ser pago é " + valorAPagar);

    }
}
