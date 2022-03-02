package me.Tamaninja;

import javax.swing.*;
import java.awt.*;

public class MainBackground extends JPanel {
    public MainBackground() {
        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.darkGray);
        g.fillRect(0,0,this.getParent().getWidth(),this.getParent().getHeight());
    }
    @Override
    public void setSize(int width, int height) {
        super.setSize(this.getParent().getWidth(),this.getParent().getHeight());
    }
    @Override
    public void setLocation(int x, int y) {
        super.setLocation(0,0);
    }
}
