package me.Tamaninja;

import javax.swing.*;

public class MainFrame extends JFrame {
    private double YResolution;
    private double XResolution;
    public MainFrame() {
        this.YResolution = (Constants.monitorY / 1.5);
        this.XResolution = (Constants.monitorY / 1.5);
        this.setVisible(true);
    }
}
