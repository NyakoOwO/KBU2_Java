public class Person {

    private int age;
    private String name;
    private char gender;
    private boolean married;
    private int child;


    public Person(int age, String name, char gender, boolean married, int child) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.married = married;
        this.child = child;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public boolean isMarried() {
        return married;
    }

    public int getChild() {
        return child;
    }
}
