import java.io.*;
class EmptyFileException extends Exception {
 public EmptyFileException(String message) {
 super(message);
 }
}
public class FileReaderException {
 public static void main(String[] args) {
 try {
 FileReader fr = new FileReader("source.txt");
 int data = fr.read();
 if (data == -1) {
 throw new EmptyFileException("File is empty.");
 }
 fr.close();
 } catch (FileNotFoundException e) {
 System.out.println("File not found: " + e.getMessage());
 } catch (IOException e) {
 System.out.println("IOException occurred: " + e.getMessage());
 } catch (EmptyFileException e) {
 System.out.println(e.getMessage());
 }
 }
}
