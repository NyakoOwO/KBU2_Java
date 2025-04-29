import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);
        System.out.print("연도를 입력하세요: ");
        int year = keyborad.nextInt();

        Year yearCK = new Year(year);

        if (yearCK.isLeapYear()) {
            System.out.println(yearCK.getYear() + "년은 윤년입니다.");
        } else {
            System.out.println(yearCK.getYear() + "년은 평년입니다.");
        }

    }
}