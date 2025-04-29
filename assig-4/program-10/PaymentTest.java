class Payment {
    void processPayment() { System.out.println("Processing Payment"); }
}

class CreditCardPayment extends Payment {
    void processPayment() { System.out.println("Credit Card Payment"); }
}

class PayPalPayment extends Payment {
    void processPayment() { System.out.println("PayPal Payment"); }
}

public class PaymentTest {
    public static void main(String[] args) {
        Payment p = new CreditCardPayment();
        p.processPayment();
        p = new PayPalPayment();
        p.processPayment();
    }
}
