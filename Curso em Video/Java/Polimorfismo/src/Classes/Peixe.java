package Classes;

import java.nio.channels.Pipe;

public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    public void soltarBolhas(){
        System.out.println("Soltando bolhas");
    }
// getters and setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
