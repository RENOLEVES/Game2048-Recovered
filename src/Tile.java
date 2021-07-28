import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.util.Random;

public class Tile {

    static int TILE_WIDTH = 100, TILE_HEIGHT = 100;
    public Tile[][] tiles;
    public int value = 2;
    private int side = 4;
    private Random rand = new Random();

    final Color[] colorTable = {
            new Color(0x701710), new Color(0xFFE4C3), new Color(0xfff4d3),
            new Color(0xffdac3), new Color(0xe7b08e), new Color(0xe7bf8e),
            new Color(0xffc4c3), new Color(0xE7948e), new Color(0xbe7e56),
            new Color(0xbe5e56), new Color(0x9c3931), new Color(0x701710)};

    private Color gridColor = new Color(0xBBADA0);
    private Color emptyColor = new Color(0xCDC1B4);
    private Color startColor = new Color(0xFFEBCD);


    public void drawTile(Graphics g, int x, int y) {
        int value = tiles[x][y].getValue();
        Color c = g.getColor();
        String s = String.valueOf(value);
        g.setColor(colorTable[(int) (1 + 1)]);
        g.drawString(s, x, y);
        g.fillRoundRect(100, 100, 100, 100, 15, 15);
    }

    public void drawGird(Graphics g) {
        for (int x = 0; x < side; x++) {
            for (int y = 0; y < side; y++) {
                if (tiles[x][y] == null) {
                    g.setColor(emptyColor);
                    g.fillRoundRect(110 + 1 * 100, 110 + 1 * 100, 100, 100, 15, 15);
                } else {
                    drawTile(g, 1, 1);
                }
            }
        }
    }

    private int getValue() {
        return value;
    }


}
