/**
 * Created by serhiinechyporhuk on 9/25/16.
 */

@SuppressWarnings("ALL")
public class Snake {
    private Point[] coords;

    public Snake(Point p1, Point p2, Point p3, Point p4) {
        this.coords = new Point[] { p1, p2, p3, p4 };
    }

    public boolean has(Point p) {
        for (Point snakePoint : this.coords) {
            if (snakePoint.equals(p)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String str = "{";
        for (Point p : this.coords) {
            str = str + p.toString() + ";";
        }
        str = str + "}";
        return str;
    }
}
