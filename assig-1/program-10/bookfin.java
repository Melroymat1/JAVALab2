import java.util.*;

class bookfin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of late days : ");
       int days=sc.nextInt();
       int fineam=10;
        System.out.println("the fine amount is : "+days*10);
    }
}