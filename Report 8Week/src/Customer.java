public abstract class Customer {
    protected String waterNo;
    protected String name;
    protected int partCode;
    protected double used;
    protected int baseFee = 1200;

    public Customer(String waterNo, String name, int partCode, double used) {
        this.waterNo = waterNo;
        this.name = name;
        this.partCode = partCode;
        this.used = Math.round(used);  // 사사오입
    }

    public abstract int getUnitPrice();
    public abstract double getTaxRate();
    public abstract String getRemark();

    public int getUsedFee() {
        return (int) (used * getUnitPrice());
    }

    public int getTax() {
        if (partCode == 5) return 0;
        double tax = (baseFee + getUsedFee()) * getTaxRate();
        return (int) (tax / 10) * 10;  // 1의 자리 절사
    }

    public int getTotalPay() {
        return baseFee + getUsedFee() + getTax();
    }

    public void print() {
        System.out.printf("%-6s %-6s %-5d %-6.1f %-8d %-6d %-6d %-8s\n",
                waterNo, name, partCode, used, getUsedFee(), getTax(), getTotalPay(), getRemark());
    }
}
