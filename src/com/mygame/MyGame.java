package com.mygame;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
@SuppressWarnings("InfiniteLoopStatement")
public class MyGame extends JFrame {
    JLabel heading,clockLabel;
    Font font = new Font("",Font.BOLD,40);
    JPanel mainPanel;

    JButton []btns = new JButton[9];

    MyGame(){
        System.out.println("Creating Instance of Game");
        setTitle("My Tic Tac Toe Game...");
        setSize(650,650);
        ImageIcon icon = new ImageIcon("src/img/icon.png");
        setIconImage(icon.getImage());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createGUI();
        setVisible(true);
    }

    private void createGUI(){

        this.getContentPane().setBackground(Color.decode("#536160"));
        this.setLayout(new BorderLayout());


        // north heading.. //

        heading = new JLabel("Tic Tac Toe");
        heading.setIcon(new ImageIcon("src/img/icon.png"));
        heading.setFont(font);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setForeground(Color.white);
        heading.setHorizontalTextPosition(SwingConstants.CENTER);
        heading.setVerticalTextPosition(SwingConstants.BOTTOM);


        this.add(heading, BorderLayout.NORTH);

        // creating object of JLable for clock //

        clockLabel = new JLabel("Clock");
        clockLabel.setForeground(Color.white);
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

        //   Panel Section //

        mainPanel=new JPanel();

        mainPanel.setLayout(new GridLayout(3,3));

        for(int i = 1; i<= 9; i++){
            JButton btn = new JButton();
            btn.setIcon(new ImageIcon("F:/Projects/Java Projects/TicTacToeTraining/src/img/1.png"));
            btn.setBackground(Color.decode("#07b8ab"));

            btn.setFont(font);
            mainPanel.add(btn);
            btns[i-1] = btn;
        }

        this.add(mainPanel,BorderLayout.CENTER);

    }
}
