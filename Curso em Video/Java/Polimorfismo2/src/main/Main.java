package main;

import classes.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.reagir(2,9f);
        dog.reagir(true);
        dog.reagir("Olá");
        dog.reagir(11,45);
        dog.reagir(false);
    }
}
