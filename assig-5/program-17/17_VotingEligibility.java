class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
 super(message);
 }
}
public class VotingEligibility {
 public static void main(String[] args) {
 try {
 checkEligibility(15);
 } catch (InvalidAgeException e) {
 System.out.println(e.getMessage());
 }
 }
 public static void checkEligibility(int age) throws InvalidAgeException {
 if (age < 18) {
 throw new InvalidAgeException("You must be at least 18 years old to vote.");
 } else {
 System.out.println("You are eligible to vote.");
 }
 }
}