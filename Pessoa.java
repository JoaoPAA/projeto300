
package questao02;

public class Pessoa {

    private String nome;
    private String sobrenome;

    public  Pessoa (String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void ImprimirNomeCompleto(){
        System.out.println(nome + " " + sobrenome);
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Leonardo", "Messias");
                pessoa.ImprimirNomeCompleto();


    }
}
