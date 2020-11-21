package com.company;

import javax.swing.*;
import java.awt.*;

public class TabbedPane {
    JFrame jFrame;
    JPanel jPanel1=new JPanel();
    JPanel jPanel=new JPanel();

    /**
     * constructor
     */
    public TabbedPane(){
        jFrame=new JFrame();

        JTabbedPane jTabbedPane=new JTabbedPane();
        //CalculatureGui calculatureGui=new CalculatureGui();
        jTabbedPane.setBounds(50,50,200,200);




        jPanel.setSize(400,200);
        jPanel.setLocation(20,200);drawWriteBoard(jPanel);
        drawKeyBoard(jPanel);

         jTabbedPane.add("Typical",jPanel);


        jPanel1.setSize(500,700);
        jPanel1.setLocation(20,200);
        jPanel1.setLayout(null); drawWriteBoard(jPanel1);
        drawKeyBoard(jPanel1); drawKew2(jPanel1);

        jTabbedPane.add("mohandesi",jPanel1);









        jFrame.add(jTabbedPane);
        jFrame.setVisible(true);
        jFrame.setLocation(20,200);
        jFrame.setSize(400,600);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * sakhte jaye neveshtan
     * @param panel
     */
    public void drawWriteBoard(JPanel panel){
        JTextArea textArea= new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial",13,13));
        JScrollPane jScrollPane=new JScrollPane(textArea);
        jScrollPane.setSize(100,100);
        jScrollPane.setLocation(20,10);
        textArea.append("kjj=98;lkjhgfdsdfghjkl;lkijuyhgtfrdeswdefrgthjkil;plokijuyhgtrfde76");
        panel.add(jScrollPane);


    }

    /**
     * sakhte keyboarde saade
     * @param jPanel
     */
    public  void drawKeyBoard(JPanel jPanel){


        jPanel.setSize(100,200);
        jPanel.setLocation(20,100);
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

    }

    /**
     * dokme haye ezafie mashinhesab mohandesi
     * @param jPanel1
     */
    public void drawKew2(JPanel jPanel1){

        jPanel1.setSize(150,200);
        jPanel1.setLayout(new GridLayout(6,3));
        JButton jButton=new JButton("Sin/Cos");
        jPanel1.add(jButton);
        jButton=new JButton("tan/cot");
        jPanel1.add(jButton);
        jButton=new JButton("shift");
        jPanel1.add(jButton);


    }
}
