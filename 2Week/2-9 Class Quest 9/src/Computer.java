import java.util.Random;

public class Computer {
    private int num;


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        Random random = new Random(System.currentTimeMillis());
        this.num = random.nextInt(3) + 1;
    }

}
