package client;

import java.io.*;
import java.net.Socket;


public class ClientSocket {
    private final Socket socket;
    private final BufferedReader reader;
    private final PrintWriter writer;

    public ClientSocket(Socket socket) throws IOException{
        this.socket=socket;

        this.reader  = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));//inicializacao do reader
        this.writer = new PrintWriter(socket.getOutputStream(), true);
    }

    public String getMessage(){ //lê a mensagem
        try{
            return reader.readLine();
        }catch(IOException e){
            return null;

        }
    }

    public boolean sendMsg(String msg){ //envia a mensagem a mensagem
        writer.println(msg);
        return !writer.checkError();
    }
}