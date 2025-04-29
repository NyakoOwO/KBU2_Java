public class House {
    private float used;
    final private int basic = 1200;

    public House(String no, String name) {
        super(no, name);
        this.used = used;
    }

    public House(float used) {
        this.used = used;
    }

    public float getUsed() {
        return used;
    }

    public void setUsed(float used) {
        this.used = used;
    }

    public int fee() {
        int fee = ((int) (used + 0.5f)* 40);
        return fee;
    }

    public int tax () {
        int tax = (int) ((basic + fee()) * (5 / 100.0f));
        return tax;
    }

    public int pay () {
        return basic + fee() + tax();
    }

    @Override
    public String toString() {
        return String.format("%s 가정용 %5.1f %,8d 원 %,6d 원 %,8d",
                super.toString(), used, fee(), pay(), tax());
    }
}
