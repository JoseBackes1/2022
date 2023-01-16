package classes;

import interfaces.Controlador;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private int memoriaVolume;
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //metodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----MENU-----");
        System.out.println("Está Ligado: " + this.getLigado());
        System.out.println("Está Tocando: " + this.getTocando());
        System.out.print("Volumes: " + this.getVolume() + " ");
        for(int i=0; i<getVolume();i+=10){
            System.out.print("|");
        }
        System.out.println("");
        System.out.println("--------------");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() && getVolume()<100)    {
            this.setVolume(this.getVolume()+5);
            this.memoriaVolume = getVolume();
        }
    }


    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(getVolume()-5);
            this.memoriaVolume = getVolume();
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume()==0){
            this.setVolume(this.memoriaVolume);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && (this.getTocando())){
            setTocando(false);
        }
    }
}
