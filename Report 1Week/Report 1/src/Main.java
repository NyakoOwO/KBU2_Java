public class Main {
    public static void main(String[] args) {
        Person man = new Person("홍길동", "남자", 27);

        man.setName("홍길동");
        man.setAge(man.getAge() + 1);
        System.out.println(man.getName() + "/" + man.getGender() + "/" + man.getAge());
        System.out.println(man);
    }
}