class reguler extends employee {
    char grade;

    public reguler(String name, String id, char grade) {
        super(name, id);
        this.grade = grade;
    }

    @Override
    public int computeBaseSalary() {
        return switch (grade) {
            case '1' -> 1600000;
            case '2' -> 1800000;
            case '3' -> 2100000;
            case '4' -> 2400000;
            case '5' -> 2800000;
            default -> 0;
        };
    }

    @Override
    public int computeGrossPay() {
        return computeBaseSalary();
    }
}
