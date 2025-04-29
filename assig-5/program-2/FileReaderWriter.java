import java.io.*;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("source.txt");
        FileWriter fw = new FileWriter("destination.txt");

        int charData;
        while ((charData = fr.read()) != -1) {
            fw.write(charData);
        }

        fr.close();
        fw.close();

        System.out.println("File copied successfully using FileReader and FileWriter.");
    }
}
