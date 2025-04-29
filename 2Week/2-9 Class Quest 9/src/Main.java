public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Man man = new Man();
        GameManager manager = new GameManager(computer, man);
        computer.setNum();
        man.setNum(1);
        System.out.println(computer);
        System.out.println(man);
        System.out.println(manager.result());
    }
}