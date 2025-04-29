public class MyName {
    private String name;
    private int age;

    public MyName(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.printf("안녕하세요! 저는 %s이고, 나이는 %d살입니다.\n", name, age);
    }
}
