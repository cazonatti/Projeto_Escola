package com.mycompany.projetoescola;

import model.Aluno;
import model.Professor;

class main {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro", 5.0, 8.0);
        System.out.println(aluno1.media());

        Professor professor = new Professor("Pedrinho", aluno1);

        professor.mostrarAluno1();
    }
}
