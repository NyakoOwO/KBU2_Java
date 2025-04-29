class manager extends reguler {
    public manager(String name, String id, char grade) {
        super(name, id, grade);
    }

    private double getIncentiveRate() {
        int sal = computeBaseSalary();
        if (sal <= 1800000) return 0.06;
        else if (sal <= 2400000) return 0.05;
        else return 0.04;
    }

    @Override
    public int computeGrossPay() {
        return (int)(computeBaseSalary() * (1 + getIncentiveRate()));
    }

    public int getIncentive() {
        return computeGrossPay() - computeBaseSalary();
    }

    public String printSalaryDetail() {
        return String.format("%s  %s %s급   -       -     %,d     %,d     -,        %,d     %,d",
                id, name, grade,computeBaseSalary(), getIncentive(), computeGrossPay(), computeTax());
    }
}