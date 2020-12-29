package com.company;

import javax.naming.ldap.SortKey;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String []args){
        try {
            //for conect to  server one acception
            //Socket client=new Socket("127.0.0.1",5000);

            //for conect to multiple acception server
            Socket client=new Socket("127.0.0.1",50050);

            System.out.println("connected to server");
            OutputStream out=client.getOutputStream();
            InputStream in=client.getInputStream();
            byte []buffer=new byte[2048];
            Scanner scanner=new Scanner(System.in);
            String inSt=scanner.nextLine();
            do {
                out.write(inSt.getBytes());
                System.out.println("sent : "+inSt);
                int read = in.read(buffer);
                System.out.println("RECEIVE: " + new String(buffer, 0, read));
                inSt=scanner.nextLine();


            }while (! inSt.equals("over"));
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
