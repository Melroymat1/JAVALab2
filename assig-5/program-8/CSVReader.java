import java.io.*;
public class CSVReader {
 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new FileReader("data.csv"));
 String line;
 while ((line = br.readLine()) != null) {
 String[] data = line.split(",");
 System.out.println("Name: " + data[0] + ", Age: " + data[1]);
 }
 br.close();
 }
}
