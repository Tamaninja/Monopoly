package me.Tamaninja.board;

import me.Tamaninja.Constants;
import me.Tamaninja.MainFrame;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    public Board() {
        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0  ,0,this.getParent().getHeight(),this.getParent().getHeight());//Draw the board
    }
    @Override
    public void setSize(int width, int height) {
        super.setSize(this.getParent().getHeight(),this.getParent().getHeight()); //Set board size
    }
    @Override
    public void setLocation(int x, int y) {
        super.setLocation((this.getParent().getWidth()/2) - (this.getWidth()/2),0); //Center the board
    }
}
