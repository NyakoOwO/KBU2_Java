import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("시작값 입력: ");
        int num1 = keyboard.nextInt();
        System.out.print("끝값 입력: ");
        int num2 = keyboard.nextInt();

        Adder adder = new Adder(num1, num2);
        System.out.printf("%d + %d + ...... + %d = %d\n", num1, num1+1, num2, adder.sum());

    }
}