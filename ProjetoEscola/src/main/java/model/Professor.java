package model;

public class Professor extends Pessoa {

    Aluno aluno1;

    public Professor(String nome, Aluno aluno1) {
        super(nome);
        this.aluno1 = aluno1;
    }

    public void mostrarAluno1() {
        System.out.println("Professor: " + nome);
        System.out.println("Aluno:");

        aluno1.mostrar();
    }
}
