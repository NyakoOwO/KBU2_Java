import java.io.IOException;
import java.util.Scanner;

abstract class Employee extends Person implements Method{
    private char grade;

    public Employee(String id, String name) {
        super(name, id);
        grade = ' ';
    }

    @Override
    public String toString() {
        return String.format("%s %1c", super.toString(), grade);
    }


    @Override
    public void inputData(String type) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.printf("[%s] %s님의 급수 입력: ",type, getName());
            grade = keyboard.next().charAt(0);
            if (grade > '1' && grade < '5') break;
            else {
                System.err.println("ERRPR: 직급 오류");
                System.in.read();
            }
        }
    }

    @Override
    public int salary() {
        return 0;
    }

    @Override
    public int salaryBonus() {
        return 0;
    }
}