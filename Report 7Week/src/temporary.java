class temporary extends employee {
    private int day;
    private int dailyWage;

    public temporary(String name, String id, int day, int dailyWage) {
        super(name, id);
        this.day = day;
        this.dailyWage = dailyWage;
    }

    @Override
    public int computeBaseSalary() {
        return day * dailyWage;
    }

    @Override
    public int computeGrossPay() {
        return computeBaseSalary();
    }

    public String printSalaryDetail() {
        return String.format("%s  %s  급   %d   %,d  %,d       -,        -,        %,d     %,d",
                id, name, day, dailyWage, computeBaseSalary(), computeGrossPay(), computeTax());
    }
}