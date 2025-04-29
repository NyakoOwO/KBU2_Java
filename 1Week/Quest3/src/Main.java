public class Main {
    public static void main(String[] args) {
        Member[] members = new Member[] {
                new Member("홍길동"),
                new Member("이대한"),
                new Member("한민국"),
                new Member("경복대"),
                new Member("정돈진")
        };
        for (int i = 0; i < members.length; i++) {
            members[i].setAge(Math.random() * (25 - 20 + 1) + 21);
        }
    }
}