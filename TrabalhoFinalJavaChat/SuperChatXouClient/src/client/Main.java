package client;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Client client = new Client();
            client.start();
        } catch (IOException e) {
            //throw new RuntimeException(e);
            System.out.println("Erro ao iniciar client" + e.getMessage());
        }
    }
}
