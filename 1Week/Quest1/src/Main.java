public class Main {
    public static void main(String[] args) {
        // Circle[] circles = new Circle[5]; // Object 배열 선언
        /*
        Circle[] circles;
        circles = new Circle[5];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i);
        }
        */

        Circle1[] circles = new Circle1[] {
                new Circle1(0),
                new Circle1(1),
                new Circle1(2),
                new Circle1(3),
                new Circle1(4)
        };

        for (int i = 0; i < circles.length; i++)
            System.out.println(circles[i]);
    }
}