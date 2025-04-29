class Loan {
    double getInterestRate() { return 0; }
}

class HomeLoan extends Loan {
    double getInterestRate() { return 6.5; }
}

class CarLoan extends Loan {
    double getInterestRate() { return 8.0; }
}

public class LoanTest {
    public static void main(String[] args) {
        Loan l = new HomeLoan();
        System.out.println("Home Loan Interest: " + l.getInterestRate());
        l = new CarLoan();
        System.out.println("Car Loan Interest: " + l.getInterestRate());
    }
}
