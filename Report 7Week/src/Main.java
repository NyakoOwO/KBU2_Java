public class Main {
    public static void main(String[] args) throws java.io.IOException {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String[][] basicInfo = { // R 정규 T 일용 S 영업 M 점장
                {"S", "오정민", "100001"},
                {"S", "최명길", "200001"},
                {"R", "코로나", "300001"},
                {"R", "홍길동", "400001"},
                {"R", "진접읍", "200002"},
                {"S", "한송이", "100002"},
                {"M", "한민국", "300002"},
                {"S", "정통파", "200003"},
                {"T", "경복대", "400002"},
                {"T", "이대한", "100003"},
                {"M", "한국인", "200004"}
        };

            employee[] list = new employee[basicInfo.length];

            for (int i = 0; i < basicInfo.length; i++) {
                String typeCode = basicInfo[i][0];
                String name = basicInfo[i][1];
                String id = basicInfo[i][2];

                String jobLabel = switch (typeCode) {
                    case "R" -> "정규직";
                    case "T" -> "일용직";
                    case "S" -> "영업직";
                    case "M" -> "점장직";
                    default -> "";
                };

                switch (typeCode) {
                    case "R" -> {
                        System.out.print("[ " + jobLabel + " ] " + name + "님의 급수 입력: ");
                        char grade = sc.next().charAt(0);
                        list[i] = new reguler(name, id, grade);
                    }
                    case "T" -> {
                        System.out.print("[ " + jobLabel + " ] " + name + "님의 일당 입력: ");
                        int pay = sc.nextInt();
                        System.out.print("[ " + jobLabel + " ] " + name + "님의 작업 일수 입력: ");
                        int day = sc.nextInt();
                        list[i] = new temporary(name, id, day, pay);
                    }
                    case "S" -> {
                        System.out.print("[ " + jobLabel + " ] " + name + "님의 급수 입력: ");
                        char grade = sc.next().charAt(0);
                        System.out.print("[ " + jobLabel + " ] " + name + "님의 판매 금액 입력: ");
                        int sales = sc.nextInt();
                        System.out.print("[ " + jobLabel + " ] " + name + "님의 커미션 비율 입력: ");
                        double rate = sc.nextDouble() / 100.0;
                        list[i] = new salesman(name, id, grade, sales, rate);
                    }
                    case "M" -> {
                        System.out.print("[ " + jobLabel + " ] " + name + "님의 급수 입력: ");
                        char grade = sc.next().charAt(0);
                        list[i] = new manager(name, id, grade);
                    }
                }
                System.out.println();
            }

        company company = new company(list);
        company.printAll();
        company.printSalesmanDetails();
    }
}


