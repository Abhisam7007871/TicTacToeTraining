package com.mygame;

import javax.swing.*;
import java.awt.*;

public class MyGame extends JFrame {
    JLabel heading;
    Font font = new Font("",Font.PLAIN,40);
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

        this.add(heading, BorderLayout.NORTH);


    }
}
