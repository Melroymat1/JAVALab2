import java.util.*;

class palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
       String s=sc.next();
       String rev=new StringBuilder(s).reverse().toString();
        
        System.out.println(s.equals(rev)?"it is palindrome"+s:"it is not  palindrome "+s);
    }
}