public class Main {
    public static void main(String[] args) {
        Circle num1 = new Circle(8);
        Circle num2 = new Circle(5);

        System.out.printf("num1의 반지름: %d Cm\n", num1.getRadius());
        System.out.printf("num2의 반지름: %d Cm\n", num2.getRadius());

        System.out.println("num1과 num2는 같은 원인가? " + num1.equals(num2));
    }
}