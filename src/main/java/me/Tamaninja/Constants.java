package me.Tamaninja;

import java.awt.*;

public class Constants {
    public static final Dimension screenResolution = Toolkit.getDefaultToolkit().getScreenSize();
    public static final double monitorX = screenResolution.getWidth();
    public static final double monitorY = screenResolution.getHeight();
    public static final int tiles = 40;
    public static final int tilesPerSide = ((tiles/4) + 1);
}
