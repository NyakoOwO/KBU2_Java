import java.io.*;
import java.util.*;

public class WaterOffice {
    private List<Customer> customers = new ArrayList<>();

    public void load(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.split(",");
            String no = tokens[0];
            String name = tokens[1];
            int code = Integer.parseInt(tokens[2]);
            double used = Double.parseDouble(tokens[3]);

            switch (code) {
                case 1 -> customers.add(new House(no, name, code, used));
                case 2 -> customers.add(new Business(no, name, code, used));
                case 3 -> customers.add(new Company(no, name, code, used));
                case 4 -> customers.add(new Offices(no, name, code, used));
                case 5 -> customers.add(new Army(no, name, code, used));
            }
        }
        br.close();
    }

    public void printReport() {
        System.out.println("번호    이름    코드 사용량  사용요금   세금   납부금액 비고");
        for (Customer c : customers) {
            c.print();
        }
    }
}
