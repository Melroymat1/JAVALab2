public class MultipleCatchExample {
 public static void main(String[] args) {
 try {
 String str = null;
 System.out.println(str.length());
 int num = Integer.parseInt("abc");
 } catch (NullPointerException e) {
 System.out.println("Error: Null pointer exception");
 } catch (NumberFormatException e) {
 System.out.println("Error: Invalid number format");
 }
 }
}