
/**
 * BaiTap6_A5
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JFrame;
import java.awt.Color;

public class BaiTap6_A7 extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Canvas canvas = new BaiTap6_A7();
        canvas.setSize(600, 400);

        frame.getContentPane().add(canvas);

        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        Rectangle rec = new Rectangle(100, 100, 200, 200);
        mickey(g, rec);
    }

    public void boxOval(Graphics g, Rectangle bb) {
        g.fillOval(bb.x, bb.y, bb.width, bb.height);
    }

    public void mickey(Graphics g, Rectangle bb) {
        boxOval(g, bb);
        if (bb.width < 3) {
            return;
        }
        int dx = bb.width / 2;
        int dy = bb.height / 2;
        Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);
        half.translate(-dx / 2, -dy / 2);
        mickey(g, half);
        half.translate(dx * 2, 0);
        mickey(g, half);
    }
}