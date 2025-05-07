public class Company extends Customer {
    public Company(String no, String name, int code, double used) {
        super(no, name, code, used);
    }

    public int getUnitPrice() { return 78; }
    public double getTaxRate() { return 0.025; }
    public String getRemark() { return ""; }
}
