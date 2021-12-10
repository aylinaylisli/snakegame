package com.company;
import javax.swing.JFrame;

/**
 * The type Game frame.
 */
public class GameFrame extends JFrame{

    /**
     * Instantiates a new Game frame.
     */
    GameFrame(){

        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}