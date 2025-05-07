public class Business extends Customer {
    public Business(String no, String name, int code, double used) {
        super(no, name, code, used);
    }

    public int getUnitPrice() { return 55; }
    public double getTaxRate() { return 0.035; }
    public String getRemark() { return ""; }
}
