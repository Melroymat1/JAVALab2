import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("source.txt");
        FileOutputStream fos = new FileOutputStream("destination.txt");

        int byteData;
        while ((byteData = fis.read()) != -1) {
            fos.write(byteData);
        }

        fis.close();
        fos.close();

        System.out.println("File copied successfully!");
    }
}
