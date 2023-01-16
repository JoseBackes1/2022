package main;

import classes.Aluno;
import classes.Funcionario;
import classes.Pessoa;
import classes.Professor;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p1.setIdade(13);
        p1.setSexo("masculino");
        p2.setNome("Maria");
        p2.setIdade(69);
        p2.setSexo("Feminino");
        p3.setNome("Pedro");
        p3.setIdade(24);
        p3.setSexo("nao binario");
        p4.setNome("Josiane");
        p4.setIdade(33);
        p4.setSexo("Feminino");

        p2.setCurso("TADS");
        p3.setSalario(2596.60);
        p4.setSetor("Caixa");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());


    }
}
