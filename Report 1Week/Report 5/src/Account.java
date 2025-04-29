class Account {
    private String accountNumber;  // 계좌번호
    private String password;       // 비밀번호
    private String name;           // 이름
    private double balance;        // 잔액
    private double interestRate;   // 이율

    public Account(String accountNumber, String password, String name, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("%.0f 입금되었습니다\n새로운 잔액: %.0f\n\n",amount, balance);
        } else {
            System.out.println("잘못된 입금 금액입니다");
        }
    }

    public void withdraw(double amount, String password) {
        if (this.password.equals(password)) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.printf("%.0f 출금되었습니다\n새로운 잔액: %.0f\n\n",amount, balance);
            } else {
                System.out.println("잘못된 출금 금액입니다");
            }
        } else {
            System.out.println("비밀번호가 올바르지 않습니다");
        }
    }

    public void checkBalance() {
        System.out.printf("현재 잔액: %.0f\n\n", balance);
    }

    public void adjustInterestRate(double newInterestRate, String password) {
        if (this.password.equals(password)) {
            this.interestRate = newInterestRate;
            System.out.printf("새로운 이율: %.2f\n\n", interestRate);
        } else {
            System.out.println("비밀번호가 올바르지 않습니다");
        }
    }

    @Override
    public String toString() {
        return String.format("계좌번호: %s, 이름: %s, 잔액: %.0f, 이율: %.2f", accountNumber, name, balance, interestRate);
    }
}