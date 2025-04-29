public class Main {
    public static void main(String[] args) {
        Account account = new Account("123-456-789", "password", "홍길동", 1000.0, 0.02);

        account.deposit(500.0);
        account.withdraw(200.0, "password");
        account.checkBalance();
        account.adjustInterestRate(0.03, "password");
        System.out.println(account);
    }
}