package com.company;

import javax.swing.*;
import java.awt.*;

public class CalculatureGui {
    private JFrame jFrame;
    CalculatureGui(){

        init();
    }
    public void init(){
        jFrame=new JFrame();
        jFrame.setSize(300,500);
        jFrame.setLocation(200,400);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        draw();
        jFrame.setVisible(true);

    }
    public void draw(){
        drawKeyBoard();
        drawWriteBoard();
    }
    public  void drawKeyBoard(){

        JPanel jPanel=new JPanel();
        jPanel.setSize(150,200);
        jPanel.setLocation(20,200);
        jPanel.setLayout(new GridLayout(5,3));
        for (int i=0;i<10;i++){
            JButton jButton=new JButton(""+i);
            jPanel.add(jButton);
        }
        JButton jButton=new JButton("+");
        jPanel.add(jButton);
        jButton=new JButton("-");
        jPanel.add(jButton);
        jButton=new JButton("*");
        jPanel.add(jButton);
        jButton=new JButton("%");
        jPanel.add(jButton);
        jPanel.add(new JButton("="));
        jFrame.add(jPanel);
    }
    public void drawWriteBoard(){
        JTextArea textArea= new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial",13,13));
        JScrollPane jScrollPane=new JScrollPane(textArea);
        jScrollPane.setSize(150,100);
        jScrollPane.setLocation(20,40);
        textArea.append("kjj=98;lkjhgfdsdfghjkl;lkijuyhgtfrdeswdefrgthjkil;plokijuyhgtrfde76");
        jFrame.add(jScrollPane);


    }


}
