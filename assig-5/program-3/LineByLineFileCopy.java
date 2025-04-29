import java.io.*;
public class LineByLineFileCopy {
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
 }
}
