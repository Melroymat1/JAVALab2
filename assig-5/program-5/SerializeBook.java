import java.io.*;
class Book implements Serializable {
 String title;
 String author;

 Book(String title, String author) {
 this.title = title;
 this.author = author;
 }
}
public class SerializeBook {
 public static void main(String[] args) throws IOException, ClassNotFoundException {
 Book book = new Book("Java Programming", "John Doe");
 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.ser"));
 oos.writeObject(book);
 oos.close();

 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.ser"));
 Book deserializedBook = (Book) ois.readObject();
 System.out.println("Title: " + deserializedBook.title);
 System.out.println("Author: " + deserializedBook.author);
 ois.close();
 }
}
