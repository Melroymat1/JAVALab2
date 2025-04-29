public class NestedTryCatch {
 public static void main(String[] args) {
 try {
 try {
 int result = 10 / 0;
 } catch (ArithmeticException e) {
 System.out.println("Inner catch: Division by zero");
 }
 } catch (Exception e) {
 System.out.println("Outer catch: Exception occurred");
 }
 }
}