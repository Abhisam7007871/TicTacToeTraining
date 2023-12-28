package com.mygame;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
@SuppressWarnings("InfiniteLoopStatement")
public class MyGame extends JFrame {
    JLabel heading,clockLabel;
    Font font = new Font("",Font.BOLD,40);

    MyGame(){
        System.out.println("Creating Instance of Game");
        setTitle("My Tic Tac Toe Game...");
        setSize(650,650);
        ImageIcon icon = new ImageIcon("src/img/pngegg.ong");
        setIconImage(icon.getImage());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createGUI();
        setVisible(true);
    }

    private void createGUI(){
        this.setLayout(new BorderLayout());


        // north heading.. //

        heading = new JLabel("Tic Tac Toe");
        heading.setFont(font);
        heading.setHorizontalAlignment(SwingConstants.CENTER);

        this.add(heading, BorderLayout.NORTH);

        // creating object of JLable for clock //

        clockLabel = new JLabel("Clock");
        clockLabel.setFont(font);
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(clockLabel, BorderLayout.SOUTH);

        Thread t = new Thead(){
            public void run(){
                try{
                    while(true){
                        String datetime = new Date().toLocaleString();

                        clockLabel.setText(datetime);

                        Thread.sleep(1000);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        t.start();


    }
}
