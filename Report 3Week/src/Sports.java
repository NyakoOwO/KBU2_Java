import java.util.Scanner;

class Sports {
    int no;
    String name;
    char grade;
    int code;
    int period;

    public Sports(int no, String name, char grade) {
        this.no = no;
        this.name = name;
        this.grade = grade;
    }

    public void datainput() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s 운동 코드: ", name);
        this.code = scanner.nextInt();
        System.out.printf("%s 사용 시간: ", name);
        this.period = scanner.nextInt();
    }

    public int Rating() {
        if (grade == 'A') {
            return 4000;
        } else if (grade == 'B') {
            return 6000;
        } else if (grade == 'C') {
            return 9000;
        } else if (grade == 'D') {
            return 12000;
        }
        return 0;
    }

    public int Exercise() {
        if (code == 1) {
            return 4000; // 스쿼시 요금 (단위: 1분당 요금)
        } else if (code == 2) {
            return 6000; // 테니스 요금
        } else if (code == 3) {
            return 9000; // 골프 요금
        } else if (code == 4) {
            return 5000; // 탁구 요금
        } else if (code == 5) {
            return 8000; // 에어로빅 요금
        } else if (code == 6) {
            return 3000; // 헬스 요금
        } else {
            return 0; // 알 수 없는 운동 코드
        }
    }
