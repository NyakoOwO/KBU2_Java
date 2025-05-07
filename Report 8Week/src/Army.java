public class Army extends Customer {
    public Army(String no, String name, int code, double used) {
        super(no, name, code, used);
    }

    public int getUnitPrice() { return 20; }
    public double getTaxRate() { return 0.0; }
    public String getRemark() { return "일괄징수"; }
}
