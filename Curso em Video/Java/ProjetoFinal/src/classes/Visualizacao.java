package classes;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Video video, Gafanhoto gafanhoto) {
        this.espectador = gafanhoto;
        this.filme = video;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
//METHODS
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
        int total = 0;
        if(porc<=20){
            total = 3;
        }else if(porc<=60){
            total = 4;
        }else{
            total = 5;
        }
        this.filme.setAvaliacao(total);
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}
