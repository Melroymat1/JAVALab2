public class ArrayIndexOutOfBoundsExample {
 public static void main(String[] args) {
 int[] arr = {1, 2, 3};
 try {
 System.out.println(arr[5]);
 } catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("Error: Invalid array index");
 }
 }
}