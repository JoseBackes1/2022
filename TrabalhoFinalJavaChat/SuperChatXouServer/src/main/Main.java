/*
CÓDIGO DO SERVIDOR FORNECIDO PELO PRÓPRIO PROFESSOR DA MATERIA
DE PROGRAMAÇÃO ORIENTADA A OBJETOS DA UDESC/CCT - JOINVILLE, SC.
 */
package main;

import model.Server;
import model.ServerListener;

public class Main {
    static Server server;
    public static void main(String[] args) {
        server = new Server((message)-> {
            System.out.println(message);
        });
        server.start();
    }
}