package dominio;

import java.util.ArrayList;

public class Turma {
    private int codigo;
    private String disciplina;
    private String professor;
    private ArrayList<Aluno> alunos;

    public Turma(int codigo, String disciplina, String professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void listarAlunos() {
        System.out.print("Alunos: ");
        for (Aluno aluno : alunos) {
            System.out.print(aluno.getNome() + ", ");
        }
    }

    @Override
    public String toString() {
        return "\nCódigo: " + codigo + "\nDisciplina: " + disciplina + "\nProfessor: " + professor;
    }
}