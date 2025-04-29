public class Main {
    public static void main(String[] args) {
        Person Person = new Person("김철수", 183, 64.3, 21);

        System.out.printf(
                "%s는 키가 %dCm이고, 몸무게는 %fKg이고, 나이는 %d살 입니다\n",
                Person.getName(), Person.getHeight(), Person.getWeight(), Person.getAge()
        );
    }
}