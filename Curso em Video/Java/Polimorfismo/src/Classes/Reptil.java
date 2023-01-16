package Classes;

public class Reptil extends Animal{
    private String corEscamas;

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo mato");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }

    public String getCorEscamas() {
        return corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }
}
