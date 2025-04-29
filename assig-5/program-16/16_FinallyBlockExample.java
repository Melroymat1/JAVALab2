import java.io.*;
public class FinallyBlockExample {
 public static void main(String[] args) {
 BufferedReader br = null;
 try {
 br = new BufferedReader(new FileReader("test.txt"));
 String line = br.readLine();
 System.out.println(line);
 } catch (IOException e) {
 System.out.println("IOException occurred");
 } finally {
 try {
 if (br != null) {
 br.close();
 }
 } catch (IOException e) {
 System.out.println("Error closing the file");
 }
 }
 }
}