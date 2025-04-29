public class Main {
    public static void main(String[] args) {
        Sports[] man = new Sports[]{
                new Sports(1234, "홍길동", 'C'), // 스쿼시
                new Sports(3456, "박대리", 'B'), // 테니스
                new Sports(2567, "이대한", 'B'), // 골프
                new Sports(4578, "이미녀", 'B'), // 탁구
                new Sports(6734, "정다운", 'D'), // 에어로빅
                new Sports(3414, "김정음", 'C'), // 헬스
                new Sports(5678, "한민국", 'A'),
                new Sports(1626, "박오전", 'A'),
                new Sports(6789, "허삼수", 'B'),
                new Sports(3231, "고득점", 'B')};
        for (int i = 0; i < man.length; i++)
            man[i].datainput();
        SportsCenter sportsCenter = new SportsCenter(man);
        sportsCenter.display();
    }
}