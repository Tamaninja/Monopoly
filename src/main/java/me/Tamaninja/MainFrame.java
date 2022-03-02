package me.Tamaninja;

import me.Tamaninja.board.Board;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class MainFrame extends JFrame {
    private Board board = new Board();
    public MainFrame() {
        this.setSize((int) (Constants.monitorX / 1.5),(int) (Constants.monitorY / 1.5)); // 2/3s of the monitor size
        this.setLocationRelativeTo(null); //Centers the frame
        this.setVisible(true);
    }
}
