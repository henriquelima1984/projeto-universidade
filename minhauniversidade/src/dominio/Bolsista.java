package dominio;

public class Bolsista extends Aluno {
    public Bolsista(String nome, int idade, String cpf, String matricula) {
        super(nome, idade, cpf, matricula);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Bolsista paga 50%, Bolsista 100% é isento.");
    }
}