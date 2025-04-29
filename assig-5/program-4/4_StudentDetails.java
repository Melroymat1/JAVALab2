import java.io.*;
public class StudentDetails {
 public static void main(String[] args) throws IOException {
 DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.dat"));
 dos.writeUTF("John");
 dos.writeInt(20);
 dos.writeUTF("A");
 dos.close();

 DataInputStream dis = new DataInputStream(new FileInputStream("student.dat"));
 System.out.println("Name: " + dis.readUTF());
 System.out.println("Age: " + dis.readInt());
 System.out.println("Grade: " + dis.readUTF());
 dis.close();
 }
}
