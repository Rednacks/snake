
public class Fruit {
    private Point coor;


    public Fruit(Point f1) {

        this.coor = f1;
    }

    public boolean has(Point f) {
            if (this.coor.equals(f)) {
                return true;
            }

        return false;
    }


    }

