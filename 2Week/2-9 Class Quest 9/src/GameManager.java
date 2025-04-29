public class GameManager {
    private Computer computer;
    private Man man;


    public GameManager(Computer computer, Man man) {
        this.computer = computer;
        this.man = man;
    }

    public String result() {
        String result = "";

        int key = man.getNum() - computer.getNum();
        if (key == 0 ) {
            result = "무승부";
        } else if (key == -1 || key == -2) {
            result = "Computer 승";
        } else {
            result = "Man 승";
        }
        return result;
    }

}
