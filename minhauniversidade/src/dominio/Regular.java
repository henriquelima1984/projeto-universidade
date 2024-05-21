package dominio;

public class Regular extends Aluno {
    public Regular(String nome, int idade, String cpf, String matricula) {
        super(nome, idade, cpf, matricula);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Aluno regular paga mensalidade.");
    }
}