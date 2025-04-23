import java.util.*;

public class bookdetails {
    String title,author;
    double price;
    bookdetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the title : ");
         title=sc.next();
        System.out.println("Enter the Author : ");
        author=sc.next();
        System.out.println("Enter the Price : ");
         price=sc.nextDouble();
    }
    void display(){
        System.out.println("Title: " + title + ", Author: " + author + ", Price: ₹" + price);
    }
    public static void main(String[] args) {
        bookdetails book=new bookdetails();
        book.display();
    }
}
