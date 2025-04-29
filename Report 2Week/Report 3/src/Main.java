import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("자연수 2개 입력: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int gcd = findGCD(number1, number2);
        int lcm = (number1 * number2) / gcd;

        System.out.printf("%d, %d의 GCD(최대공약수)는 %d 입니다\n", number1, number2, gcd);
        System.out.printf("%d와 %d의 LCM(최소공배수)는 %d", number1, number2, lcm);
    }
    public static int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
}
