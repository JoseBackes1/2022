package main;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        c1.cor = "Azul";
       // c1.ponta = 0.5f;
        //c1.tampada = true;
        c1.modelo = "Bic Cristal";
        c1.carga= 95;
        c2.rabiscar();
    }
}