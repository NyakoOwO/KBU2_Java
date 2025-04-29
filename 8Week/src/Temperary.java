import java.io.IOException;
import java.util.Scanner;

public class Temperary extends Employee {
    private int day;
    private int daillyPay;

    public Temperary(String id, String name) {
        super(id, name);
        setGrade(' ');
    }

    @Override
    public int inputData(String type) throws IOException {
        Scanner Keyboard = new Scanner(System.in);
        while (true) {

        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int salary() {
        return super.salary();
    }

    @Override
    public int salaryBonus() {
        return super.salaryBonus();
    }
}
