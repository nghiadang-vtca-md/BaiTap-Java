import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;

public class BaiTap6_A1 extends Canvas {
    public static void main(String[] args) {
        // tạo một khung (frame)
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // thêm một nền vẽ (canvas)
        Canvas canvas = new BaiTap6_A1();
        canvas.setSize(600, 400);
        //canvas.setBackground(Color.red);
        frame.getContentPane().add(canvas);
        // hiển thị khung
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        // vẽ hình tròn
        g.setColor(Color.BLUE);
        g.fillOval(100, 100, 200, 200);
        g.setColor(Color.RED);
        g.drawLine(100, 100, 400, 100);
        g.setColor(Color.GREEN);
        g.drawLine(100, 100, 100, 400);
        g.setColor(Color.YELLOW);
        g.drawLine(100, 400, 400, 100);

    }
}