abstract class BankAccount {
    abstract void accountType();
}

class SavingsAccount extends BankAccount {
    void accountType() { System.out.println("Savings Account"); }
}

class CurrentAccount extends BankAccount {
    void accountType() { System.out.println("Current Account"); }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount();
        BankAccount a2 = new CurrentAccount();
        a1.accountType();
        a2.accountType();
    }
}
