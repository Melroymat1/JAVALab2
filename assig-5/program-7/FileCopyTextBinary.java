import java.io.*;
public class FileCopy {
 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new FileReader("source.txt"));
 BufferedWriter bw = new BufferedWriter(new FileWriter("destination.txt"));
 String line;
 while ((line = br.readLine()) != null) {
 bw.write(line);
 bw.newLine();
 }
 br.close();
 bw.close();
 FileInputStream fis = new FileInputStream("source.bin");
 FileOutputStream fos = new FileOutputStream("destination.bin");
 int byteData;
 while ((byteData = fis.read()) != -1) {
 fos.write(byteData);
 }
 fis.close();
 fos.close();
 }
}
