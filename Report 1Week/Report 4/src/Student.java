class Student {
    private String name;
    private int classnumber;
    private int age;

    // Constructor to initialize the fields
    public Student(String name, int classnumber, int age) {
        this.name = name;
        this.classnumber = classnumber;
        this.age = age;
    }

    // Overriding the toString() method to print the values of the fields
    @Override
    public String toString() {
        return String.format("이름: %s, 학번: %d, 나이: %d", name, classnumber, age);
    }
}