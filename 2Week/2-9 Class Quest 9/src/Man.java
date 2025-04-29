public class Man {
    private int num;

    public Man(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.format("%s\n",
                num == 1 ? "가위" : num == 2 ? "바위" : "보");
    }
}
