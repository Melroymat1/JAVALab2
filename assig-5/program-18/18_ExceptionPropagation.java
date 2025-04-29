public class ExceptionPropagation {
 public static void main(String[] args) {
 try {
 methodA();
 } catch (Exception e) {
 System.out.println("Exception handled in main: " + e.getMessage());
 }
 }
 public static void methodA() throws Exception {
 methodB();
 }
 public static void methodB() throws Exception {
 throw new Exception("Exception occurred in methodB");
 }
}