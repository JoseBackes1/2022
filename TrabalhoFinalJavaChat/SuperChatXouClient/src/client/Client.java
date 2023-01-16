package client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.net.InetAddress;

public class Client implements Runnable {//implementa runnable pq preciso dele para rodar em paralelo o recebimento de mensagem
    private static final String SERVER_ADDRESS =getClientAddress();//pra poupar energia em procurar o localhost, puxei
                                                                    // o mesmo dado do cliente, ja que ele vai rodar na minha máquina
    private ClientSocket clientSocket;
    private Scanner scanner;
    private String nome;


    public Client(){
        scanner = new Scanner(System.in);
    }

    public void start() throws IOException {
        clientSocket = new ClientSocket(new Socket(SERVER_ADDRESS, 1208)) ;
        new Thread(this).start();
        cadastrarNomeCliente();
        messageLoop();
    }

    private void cadastrarNomeCliente() {
        System.out.println("Informe o seu NickName para o Chat:");
        nome=scanner.nextLine();
        String clientAdress=getClientAddress();
        nome=nome+"@"+clientAdress;
        clientSocket.sendMsg(nome);
        System.out.println(nome +" conectado!");
    }

    private void messageLoop() {//loop para escrever e enviar mensagem ao servidor
        String msg;
        do {
           //envio de mensagens
            msg = scanner.nextLine();
            msg=nome+": "+ msg;
            clientSocket.sendMsg(msg);
        }while(true);
    }

    @Override
    public void run() {//runnable para receber mensagem do servidor
        String msg;
        while((msg=clientSocket.getMessage())!= null){//pega a mensagem do cliente e guarda em msg(local) e vê se nao esta vazia
            System.out.printf("%s\n", msg);
        }
    }

    public static String getClientAddress() {//pega o numero do ip do cliente
        String clientAdress;
        try {
            clientAdress = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        return clientAdress;
    }
}//fim