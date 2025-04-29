import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("자연수를 입력하세요: ");
        int number = scanner.nextInt();

        System.out.printf("%d의 약수는: ",number);
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.printf("%d ", i);
                sum += i;
            }
        }
        System.out.print("입니다\n");
        System.out.printf("약수의 합은: %d 입니다", sum);
    }
}
