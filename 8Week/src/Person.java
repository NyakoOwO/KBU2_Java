public class Person {
    private String id;
    private String name;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%7s %3s", name, id);
    }
}


