package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Calculator implements ActionListener, KeyListener {
    private JFrame    jFrame=new JFrame();
    Calculator(){
        addMenu();
        init();
        keyHandeling();

    }
    public void init(){

        jFrame.setSize(250,500);
        jFrame.setLocation(200,400);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        draw();
        addatextScreen();
        jFrame.setVisible(true);

    }
    public void draw(){
        drawKeyBoard();
       // drawWriteBoard();
    }


    JTextField text=new JTextField("0");
    public void addatextScreen(){
        text.setSize(150,40);
        text.setLocation(20,20);
        text.setEditable(false);
        jFrame.add(text);

    }




    double result=0;
    double num1=0;
Character character;
    public  void drawKeyBoard(){



        JPanel jPanel=new JPanel();
        jPanel.setSize(150,200);
        jPanel.setLocation(20,200);
        jPanel.setLayout(new GridLayout(5,3));
        for (int i=0;i<10;i++){
            JButton jButton=new JButton(""+i);
            jButton.addActionListener(this);
            jPanel.add(jButton);
        }
        result=Double.parseDouble(text.getText());

        JButton jButton=new JButton("+");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t=text.getText();
                double number=Double.parseDouble(t);
                result+=number;
                character='+';
                text.setText("");
            }
        });
        jButton=new JButton("-");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t=text.getText();
                double number=Double.parseDouble(t);
                result-=number;
                character='-';
                text.setText("");
            }
        });
        jButton=new JButton("*");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t=text.getText();
                double number=Double.parseDouble(t);
                result=number;
                character='*';
                text.setText("");
            }
        });
        jButton=new JButton("/");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t=text.getText();
                double number=Double.parseDouble(t);
                result=number;
                character='/';
                text.setText("");
            }
        });

        JButton jButton1=new JButton("=");
        jPanel.add(jButton1);
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                switch (character){
                    case '+':{
                        double x=Double.parseDouble(text.getText());
                        result+=x;
                    }break;
                    case '-':{
                        double x=Double.parseDouble(text.getText());
                        result-=x;
                    }break;
                    case '*':{
                        double x=Double.parseDouble(text.getText());
                        result*=x;
                    }break;
                    case '/':{
                        double x=Double.parseDouble(text.getText());
                        result/=x;
                    }break;
                }
               text.setText(""+result);
            }
        });

        jFrame.add(jPanel);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jB=(JButton) e.getSource();
        for (int i=0;i<10;i++){
            if (jB.getText().contains(""+i)){
                String temp=text.getText();
                temp+=(i);
                text.setText(temp);

            }
        }

    }

    public void addMenu(){
        JMenuBar menuBar = new JMenuBar();
        JMenu optionMenu = new JMenu("options");
        menuBar.add(optionMenu);
        JMenuItem copyText = new JMenuItem("Copy screen", 'C');
        copyText.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK));
        copyText.addActionListener(this);
        optionMenu.add(copyText);
        JMenuItem exitItem = new JMenuItem("Exit", 'E');
        exitItem.addActionListener(this);
        optionMenu.add(exitItem);
        jFrame.setJMenuBar(menuBar);
    }


    public void keyHandeling(){
        jFrame.addKeyListener(this);
        jFrame.setFocusable(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode()==KeyEvent.VK_ESCAPE){
            System.exit(00);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
