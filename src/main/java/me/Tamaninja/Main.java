package me.Tamaninja;

import com.formdev.flatlaf.FlatDarkLaf;
import me.Tamaninja.board.Board;
import me.Tamaninja.board.Tile;
import me.Tamaninja.board.TileTypes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FlatDarkLaf.setup(); //Initialize
        JFrame.setDefaultLookAndFeelDecorated(true);

        MainFrame mainFrame = new MainFrame(); //Create the mainFrame
        mainFrame.getRootPane().putClientProperty("JRootPane.titleBarBackground", new Color(23,180,252)); //Set title bar color
        mainFrame.getRootPane().putClientProperty("JRootPane.titleBarForeground", Color.white);

        MainBackground mainBackground = new MainBackground();
        mainFrame.add(mainBackground); //Add components

        Board board = new Board();
        mainBackground.add(board);

        List<Tile> tiles = new ArrayList<>();
        for (int i = 1; i <= 10 ; i++) {
            Tile tile = new Tile(i);
            board.add(tile);
        }
    }
}
