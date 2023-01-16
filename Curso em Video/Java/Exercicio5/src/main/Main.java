package main;

import classes.ControleRemoto;

public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.play();
        c.ligarMudo();
        c.abrirMenu();
        c.desligarMudo();
        c.abrirMenu();
    }
}
