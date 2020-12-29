package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * multiple server
 */
public class ServerMultiple {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        int count = 0;
        try (ServerSocket welcomeSocket = new ServerSocket(50050)) {
            System.out.println("Server started");
            while (count < 3) {
                Socket connectionSocket = welcomeSocket.accept();
                count++;
                System.out.println("client accepted!");
                pool.execute(new ClientHandler(connectionSocket, count));
            }
            pool.shutdown();

        } catch (IOException ex) {
            System.err.println(ex);
        }
        System.out.println("done.");
    }

}
/**
 * this clas is for handle of clients and has 2 fields
 * one for connectedsocket that is Socket of accepted client
 * one for number of client that accepted
 */
class ClientHandler implements Runnable {

    private Socket connectedSocket;
    private int numOfClient;

    public ClientHandler(Socket connectionSocket, int numOfClient) {
        this.numOfClient =numOfClient;
        this.connectedSocket = connectionSocket;

    }

    @Override
    public void run() {
        try {
            OutputStream out = connectedSocket.getOutputStream();
            InputStream in = connectedSocket.getInputStream();
            byte[] buffer = new byte[2048];
            String messages = " ";
            String temp;
            while (true){
                int read = in.read(buffer);
                try{
                    temp = new String(buffer,0,read);
                }
                catch (Exception e){
                    break;
                }
                System.out.println("RECEIVE from "+ numOfClient +" : " + temp);

                //all Strings that is in clientNum's client
                messages += temp;
                out.write(messages.getBytes());
                System.out.println("SENT to "+ numOfClient +" : " + messages);
                Thread.sleep(1000);
            }
            System.out.print("All messages sent ");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                connectedSocket.close();
            } catch (IOException ex) {
                System.err.println(ex);
            }
        }
    }
}
