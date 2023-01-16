package main;
import classes.ContaBanco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(11111);
        p1.abrirConta("cc");
        p1.setDono("Jose Carlos");
        p1.setStatus(false);


        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(11123);
        p2.abrirConta("cp");
        p2.setDono("Ondina");
        p2.setStatus(true);


        p1.estadoDaConta();
        p2.estadoDaConta();

        p1.depositar(150f);
        p2.depositar(635.6f);

        p1.estadoDaConta();
        p2.estadoDaConta();

        p2.saque(100f);
        p2.pagarMensal();
        p2.estadoDaConta();

        p1.setStatus(true);
        p1.pagarMensal();

        p1.estadoDaConta();

    }
}