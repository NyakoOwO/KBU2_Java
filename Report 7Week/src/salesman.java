class salesman extends reguler {
    private int sales;
    private double commissionRate;

    public salesman(String name, String id, char grade, int sales, double commissionRate) {
        super(name, id, grade);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    public int getCommission() {
        return (int)(sales * commissionRate);
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public int getSales() {
        return sales;
    }

    @Override
    public int computeGrossPay() {
        return super.computeGrossPay() + getCommission();
    }

    public String printCommissionDetail() {
        return String.format("%s %s %,d %.2f %,d",
                id, name, sales, commissionRate * 100, getCommission());
    }

    public String printSalaryDetail() {
        return String.format("%s %4s %s급   -       -     %,d       -,      %,d     %,d     %,d",
                id, name, grade,  computeBaseSalary(), getCommission(), computeGrossPay(), computeTax());
    }
}