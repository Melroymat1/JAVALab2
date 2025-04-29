import java.io.*;
public class IOExceptionExample {
 public static void main(String[] args) {
 try {
 FileReader fr = new FileReader("nonexistent.txt");
 fr.read();
 } catch (IOException e) {
 System.out.println("IOException occurred: " + e.getMessage());
 }
 }
}