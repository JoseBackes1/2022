package main;

import classes.Gafanhoto;
import classes.Video;
import classes.Visualizacao;

public class Main {
    public static void main(String[] args) {
        Video [] v = new Video[3];
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 12 PHP");
        v[2] = new Video("Mariazinha e os 40 dobroes");

        Gafanhoto []g = new Gafanhoto[2];

        g[0] = new Gafanhoto("Creusa", 22, "m", "show");
        g[1] = new Gafanhoto("Jose", 23, "F","juba");
//        System.out.println(g[0].toString());
//        System.out.println(v[0].toString());
        Visualizacao vis = new Visualizacao(v[0], g[1]);
        System.out.println(vis.toString());

    }
}
