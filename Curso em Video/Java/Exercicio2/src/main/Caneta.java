package main;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status(){
        System.out.println("Uma Caneta: " + this.cor);
        System.out.println("Esta tampada?" + this.tampada);
        System.out.println("Ponta:" + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Modelo:" + this.modelo);
    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO!! A caneta esta tampada");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
