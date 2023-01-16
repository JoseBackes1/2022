package main;

import Classes.Ave;
import Classes.Mamifero;
import Classes.Peixe;
import Classes.Reptil;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Reptil r = new Reptil();

        m.setPeso(35.9f);
        m.setCorPelo("marrom");
        m.setIdade(16);
        m.setMembros(4);


    }
}
