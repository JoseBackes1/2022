package main;

import classes.Aluno;
import classes.Bolsista;
import classes.Pessoa;
import classes.Visitante;

public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();

        v1.setNome("Juvenal");
        v1.setSexo("Masculino");
        v1.setIdade(23);

        System.out.println(v1.toString());
    }
}
