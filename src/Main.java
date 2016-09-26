public class Main {
    public static void main(String[] args) {
        Fruit fruit = new Fruit(
                new Point(7, 5)
        );

        Snake snake = new Snake(
                new Point(0, 3),
                new Point(1, 3),
                new Point(2, 3),
                new Point(3, 3)

        );
        System.out.println(snake);

        int height = 10;
        int width = 10;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (snake.has(new Point(i, j)))
                    System.out.print("X ");
                else if (fruit.has(new Point(i, j)))
                    System.out.print("F ");
                else
                    System.out.print("0 ");
            }
          System.out.println();
        }
    }
}
