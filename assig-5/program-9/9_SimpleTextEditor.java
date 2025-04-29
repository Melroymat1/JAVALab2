import java.io.*;
import java.util.Scanner;
public class SimpleTextEditor {
 public static void main(String[] args) throws IOException {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter text to write into file: ");
 String text = sc.nextLine();
 FileWriter fw = new FileWriter("editor.txt");
 fw.write(text);
 fw.close();

 BufferedReader br = new BufferedReader(new FileReader("editor.txt"));
 String fileContent = br.readLine();
 System.out.println("File Content: " + fileContent);
 br.close();
 }
}
