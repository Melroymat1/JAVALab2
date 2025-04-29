import java.io.*;
class User implements Serializable {
 String username;
 String password;

 User(String username, String password) {
 this.username = username;
 this.password = password;
 }
}
public class UserAuthentication {
 public static void main(String[] args) throws IOException, ClassNotFoundException {
 User user = new User("john", "password123");
 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"));
 oos.writeObject(user);
 oos.close();

 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"));
 User deserializedUser = (User) ois.readObject();
 System.out.println("Username: " + deserializedUser.username);
 System.out.println("Password: " + deserializedUser.password);
 ois.close();
 }
}
