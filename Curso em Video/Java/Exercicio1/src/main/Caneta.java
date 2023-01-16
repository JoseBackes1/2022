package main;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Uma Caneta: " + this.cor);
        System.out.println("Esta tampada?" + this.tampada);
        System.out.println("Ponta:" + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Modelo:" + this.modelo);
    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO!! A caneta esta tampada");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
