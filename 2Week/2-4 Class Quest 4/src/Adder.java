public class Adder {
    private int num1;
    private int num2;

    public Adder(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sum() {
        return num1 + num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void input(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}
