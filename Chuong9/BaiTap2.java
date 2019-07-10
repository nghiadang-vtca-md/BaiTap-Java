
/**
 * BaiTap2
 */
import java.awt.Point;
import java.awt.Rectangle;

public class BaiTap2 {

    public static double distance(Point p1, Point p2) {
        int dx = p1.x - p2.x;
        int dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }

    public static void main(String[] args) {
        Point blank = new Point(5, 8);
        Rectangle rect = new Rectangle(0, 2, 4, 4);
        Point center = findCenter(rect);
        double dist = distance(center, blank);
        System.out.println(dist);
    }
}