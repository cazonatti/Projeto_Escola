package model;

public class Aluno extends Pessoa {

    double nota1;
    double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        super(nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        
    }

    public double media() {
        return (nota1 + nota2) / 2;
    }

    public void mostrar() {
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media());
    }
}
