public class ThrowAndThrows {
 public static void main(String[] args) {
 try {
 checkAge(-5);
 } catch (IllegalArgumentException e) {
 System.out.println(e.getMessage());
 }
 }
 public static void checkAge(int age) throws IllegalArgumentException {
 if (age < 0) {
 throw new IllegalArgumentException("Age cannot be negative");
 }
 }
}