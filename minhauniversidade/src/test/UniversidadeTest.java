package test;

import dominio.*;

public class UniversidadeTest {
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina(1, "Cálculo I", 1);
        Disciplina disciplina2 = new Disciplina(2, "Física I", 1);
        Disciplina disciplina3 = new Disciplina(3, "Álgebra Linear", 1);

        Regular aluno1 = new Regular("Henrique Correia de Lima", 29, "06314773300", "2323845");
        Regular aluno2 = new Regular("Gabriela Farias Silva", 24, "06426624365", "2323846");
        Bolsista aluno3 = new Bolsista("João Victor Loyola", 25, "12345678901", "2323847");

        Professor professor = new Professor("Júlia Farias de Lima", 20, "06314773311", "Ciências");

        Visitante visitante1 = new Visitante("Carlos", 20, "00000000000");
        Visitante visitante2 = new Visitante("Camila", 20, "00000000011");

        Turma turma1 = new Turma(1, disciplina1.getNome(), professor.getNome());
        Turma turma2 = new Turma(2, disciplina2.getNome(), professor.getNome());
        Turma turma3 = new Turma(3, disciplina3.getNome(), professor.getNome());

        turma1.adicionarAluno(aluno1);
        turma2.adicionarAluno(aluno2);
        turma3.adicionarAluno(aluno3);

        System.out.println(turma1);
        turma1.listarAlunos();
        System.out.println(turma2);
        turma2.listarAlunos();
        System.out.println(turma3);
        turma3.listarAlunos();
    }
}