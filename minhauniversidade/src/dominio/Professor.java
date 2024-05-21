package dominio;

public class Professor extends Pessoa {
    private String centro;

    public Professor(String nome, int idade, String cpf, String centro) {
        super(nome, idade, cpf);
        this.centro = centro;
    }

    public void darAula() {}
}