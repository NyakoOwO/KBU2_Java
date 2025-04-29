import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("자연수를 입력: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.printf("%d는 소수(Prime Number) 입니다.", number);
        } else {
            System.out.printf("%d는 합성수(Composite Number) 입니다.", number);
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        } return true;
    }
}
