import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keboard = new Scanner(System.in);

        System.out.print("당신의 몸무게 입력: ");
        float weight = keboard.nextFloat();
        Moon moon = new Moon(weight);
        System.out.println(moon);
    }
}