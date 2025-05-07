public class House extends Customer {
    public House(String no, String name, int code, double used) {
        super(no, name, code, used);
    }

    public int getUnitPrice() { return 40; }
    public double getTaxRate() { return 0.05; }
    public String getRemark() { return ""; }
}
