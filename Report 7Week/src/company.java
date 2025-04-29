class company {
    private employee[] employees;
    private int index;

    public company(employee[] employees) {
        this.employees = employees;
        this.index = employees.length;
    }

    public void add(employee e) {
        employees[index++] = e;
    }

    public void printAll() {
        for (int i = 0; i < index - 1; i++) {
            for (int j = i + 1; j < index; j++) {
                if (employees[i].computeNetPay() < employees[j].computeNetPay()) {
                    employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }

        System.out.println("                               경복주식회사 급여 대장");
        System.out.println("**************************************************************************************");
        System.out.println("  ID   이름    급   day     일당     기본급       인센티브  커미션급여       급여액         세금");
        System.out.println("**************************************************************************************");
        for (int i = 0; i < index; i++) {
            if (employees[i] instanceof salesman s) {
                System.out.println(s.printSalaryDetail());
            } else if (employees[i] instanceof manager m) {
                System.out.println(m.printSalaryDetail());
            } else if (employees[i] instanceof temporary t) {
                System.out.println(t.printSalaryDetail());
            } else {
                System.out.printf("%s  %s  급   -       -    %,10d       -,        -,       %,10d %,10d\n",
                        employees[i].id, employees[i].name, employees[i].computeBaseSalary(),
                        employees[i].computeGrossPay(), employees[i].computeTax());
            }
        }
        System.out.println("**************************************************************************************");
        System.out.println("                       지급액 합계:           " + this.totalNetPay() + "원");
        System.out.println("**************************************************************************************");
    }

    public void printSalesmanDetails() {
        System.out.println("\n                           영업직 사원 커미션 산출 내역");
        System.out.println("**************************************************************************************");
        System.out.println("  사번     이름  급    판매실적     요율    커미션금액");
        System.out.println("**************************************************************************************");
        for (int i = 0; i < index; i++) {
            if (employees[i] instanceof salesman s) {
                System.out.printf(" %6s %4s %s급 %,10d   %5.2f %,10d\n",
                        s.id, s.name, s.grade, s.getSales(), s.getCommissionRate() * 100, s.getCommission());
            }
        }
        System.out.println("**************************************************************************************");
    }

    public int totalNetPay() {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += employees[i].computeNetPay();
        }
        return sum;
    }
}
