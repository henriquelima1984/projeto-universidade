package dominio;

public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nome, int idade, String cpf, String matricula) {
        super(nome, idade, cpf);
        this.matricula = matricula;
    }

    public void pagarMensalidade() {}
}