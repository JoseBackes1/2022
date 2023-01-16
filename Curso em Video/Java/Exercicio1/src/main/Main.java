package main;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = true;
        c1.modelo = "Slim";
        c1.carga= 95;

        c1.rabiscar();
        c2.cor = "Azul";
        c2.ponta = 0.5f;
        c2.tampada = false;
        c2.modelo = "Slim";
        c2.carga= 95;

        c2.rabiscar();


    }
}