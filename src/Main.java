public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Snake snake = new Snake(
                new Point(10, 3),
                new Point(1, 3),
                new Point(2, 131),
                new Point(3, 3)
        );
        System.out.println(snake);

        int height = 7;
        int width = 7;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (snake.has(new Point(i, j)))
                    System.out.print("X ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
