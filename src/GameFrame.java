import com.sun.jdi.Value;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameFrame extends Frame {
    final static int target = 2048;
    Tile tile = new Tile();

    private Color gridColor = new Color(0xBBADA0);
    private Color emptyColor = new Color(0xCDC1B4);
    private Color startColor = new Color(0xFFEBCD);

    static final int GAME_WIDTH = 600, GAME_HEIGHT = 600;

    public GameFrame() {
        setSize(GAME_WIDTH, GAME_HEIGHT);
        setResizable(false);
        setTitle("Game 2048 Recovered");
        setVisible(true);

        addKeyListener(new MyKeyLisener());
    }


    public void paint(Graphics g) {
        tile.drawGird(g);

    }


    class MyKeyLisener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_UP:
                    break;
                case KeyEvent.VK_DOWN:
                    break;
                case KeyEvent.VK_LEFT:
                    break;
                case KeyEvent.VK_RIGHT:
                    break;
            }
        }

        @Override
        public void keyReleased(KeyEvent e){

        }


    }
}
