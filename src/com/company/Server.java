package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
	// write your code here
        try {
            //create socket
            ServerSocket welvomingSocket = new ServerSocket(5000);
            System.out.println("Server Started and Wait for client");
            //wait for client
            Socket socket=welvomingSocket.accept();
            System.out.println("client accepted");
            OutputStream out=socket.getOutputStream();
            InputStream in=socket.getInputStream();
            byte [] buffer = new byte[2048];


            String temp;
            String messages=" ";

            while (true) {
                int read = in.read(buffer);
                try {
                    temp = new String(buffer, 0, read);
                } catch (Exception e) {
                    break;
                }
                System.out.println("RECEIVE from client : " + temp);
                messages += temp;
                out.write(messages.getBytes());
                System.out.println("SENT to client : " + messages);
            }System.out.print("All messages sent.\nClosing client ... ");
            welvomingSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
