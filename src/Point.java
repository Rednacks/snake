/**
 * Created by serhiinechyporhuk on 9/25/16.
 */
public class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public String toString() {
        return "[" + this.x + "," + this.y + "]";
    }

    public boolean equals(Point other) {
        if (this.x == other.x && this.y == other.y) {
            return true;
        } else {
            return false;
        }
    }
}