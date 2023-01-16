package classes;

import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    // METODOS
    public void marcarLuta(Lutador l1, Lutador l2){
        if(Objects.equals(l1.getCategoria(), l2.getCategoria())
        && l1 != l2){
            setAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
        }else{
            setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar() {
        if (getAprovada()) {
            System.out.println("---Desafiante---");
            this.getDesafiante().apresentar();
            System.out.println("---Desafiado---");
            this.getDesafiado().apresentar();
            Random aleatorio = new Random();

            int vencedor = aleatorio.nextInt(3);//0,1,2

            switch (vencedor) {
                case 0://empatar
                    System.out.println("Empatou");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1://desafiante vence
                    System.out.println(this.desafiante.getNome() + " Venceu");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2://desafiante perde
                    System.out.println(this.desafiado.getNome() + " Venceu");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
            }
        }else{
            System.out.println("A Luta nao pode aacontecer");
        }
    }
    //getters and setters

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
