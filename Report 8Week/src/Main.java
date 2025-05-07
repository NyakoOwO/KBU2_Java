public class Main {
    public static void main(String[] args) {
        WaterOffice office = new WaterOffice();
        try {
            office.load("input.txt");  // input.txt에 데이터 준비되어 있어야 함
            office.printReport();
        } catch (Exception e) {
            System.out.println("파일 오류: " + e.getMessage());
        }
    }
}
