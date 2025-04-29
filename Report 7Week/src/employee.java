abstract class employee {
    protected String name;
    protected String id;

    public employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract int computeBaseSalary();
    public abstract int computeGrossPay();

    public int computeTax() {
        int gross = computeGrossPay();
        if (gross <= 1000000) return (int)(gross * 0.02);
        else if (gross <= 3000000) return (int)(gross * 0.03);
        else return (int)(gross * 0.04);
    }

    public int computeNetPay() {
        return computeGrossPay() - computeTax();
    }

    public String toString() {
        return String.format("%6s %4s %,10d %,10d %,10d",
                id, name, computeGrossPay(), computeTax(), computeNetPay());
    }
}