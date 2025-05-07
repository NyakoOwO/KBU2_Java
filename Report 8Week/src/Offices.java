public class Offices extends Customer {
    public Offices(String no, String name, int code, double used) {
        super(no, name, code, used);
    }

    public int getUnitPrice() { return 35; }
    public double getTaxRate() { return 0.015; }
    public String getRemark() { return ""; }
}
