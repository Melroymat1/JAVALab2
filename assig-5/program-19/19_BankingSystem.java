class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
 super(message);
 }
}
public class BankingSystem {
 public static void main(String[] args) {
 try {
 withdraw(5000, 3000);
 } catch (InsufficientFundsException e) {
 System.out.println(e.getMessage());
 }
 }
 public static void withdraw(int balance, int amount) throws InsufficientFundsException {
 if (amount > balance) {
 throw new InsufficientFundsException("Insufficient funds for the withdrawal");
 } else {
 System.out.println("Withdrawal successful");
 }
 }
}