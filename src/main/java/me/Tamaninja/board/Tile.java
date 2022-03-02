package me.Tamaninja.board;

import me.Tamaninja.Constants;

import javax.swing.*;
import java.awt.*;

public class Tile extends JPanel {
    private TileTypes tileType;
    private int tileNumber;
    public Tile(int tile) {
        this.tileNumber = tile;
        if ((tileNumber % (Constants.tilesPerSide-1))==1) {
            tileType = TileTypes.SQUARE;
        } else {
            tileType = TileTypes.RECT;
        }
        this.setVisible(true);
    }


    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.green);
        if (tileType==TileTypes.SQUARE) {
            g.setColor(Color.yellow);
        }
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        float x = this.getWidth() / 2.0f;
        float y = this.getHeight() / 2.0f;
//        int angle = ((this.tileNumber/(Constants.tilesPerSide-1))*90);
//        if (angle != 0) {
//            g2d.rotate(360 / angle * Math.PI, x, y);
//        }
        switch (this.tileType) {
            case SQUARE -> g.fillRect(0  ,0,(int) ((this.getParent().getHeight()/ Constants.tilesPerSide+1)*1.5),(int) ((this.getParent().getHeight()/ Constants.tilesPerSide+1)*1.5));
            case RECT -> g.fillRect(0  ,0,((this.getParent().getWidth()/Constants.tilesPerSide+1)),(int) ((this.getParent().getHeight()/ Constants.tilesPerSide+1)*1.5));
        }


    }
    @Override
    public void setSize(int width, int height) {
        switch (this.tileType) {
            case SQUARE -> super.setSize((int) ((this.getParent().getHeight()/ Constants.tilesPerSide+1)*1.5),(int) ((this.getParent().getHeight()/ Constants.tilesPerSide+1)*1.5));
            case RECT -> super.setSize(((this.getParent().getWidth()/Constants.tilesPerSide+1)),(int) ((this.getParent().getHeight()/ Constants.tilesPerSide+1)*1.5));
        }
    }
    @Override
    public void setLocation(int x, int y) {
        double pos = (tileNumber % (Constants.tilesPerSide-1));
        if (pos == 0) {
            pos = Constants.tilesPerSide - 0.5;
        } else if (pos != 1){
            pos = pos + 0.5;
        }
        int width = 0,height = 0;
        switch ((tileNumber-1)/10) {
            case 0 -> {
                width = (int) (this.getParent().getWidth()-(this.getWidth()*pos));
                height = this.getParent().getHeight()-this.getHeight();
                System.out.println(width + "\t" + height + "\t" + 0 + "\t" + pos);
            }
            case 1 -> {
                height = (int) (this.getParent().getHeight()-(this.getHeight()*pos));
                System.out.println(width + "\t" + height + "\t" + 1+ "\t" + pos);
            }
            case 2 -> {
                width = (int) (this.getParent().getWidth()-(this.getWidth()*pos));
                System.out.println(width + "\t" + height + "\t" + 2+ "\t" + pos);
            }
            case 3 -> {
                width = this.getParent().getWidth()-this.getWidth();
                height = (int) (this.getParent().getHeight()-(this.getHeight()*pos));
                System.out.println(width + "\t" + height + "\t" + 3+ "\t" + pos);
            }
        }
        super.setLocation(width,height);
    }
}
