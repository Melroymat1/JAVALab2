import java.util.*;

class simpleint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principle,amount and time : ");
        int p = sc.nextInt(),t= sc.nextInt(),r= sc.nextInt();

       double simple=p*t*r/100;
        System.out.print("Simple Intrest : "+simple);
        
    }
}
