import java.util.*;
class tax{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in); 
       System.out.println("Enter the income : ");

       int income=sc.nextInt();
       double tax=0.0;
       if(income<= 250000){
        tax=0.0;
       }else if(income<=500000){
        tax=(income-250000)*0.05;
       }
       else if(income<=1000000){
        tax=(250000*0.05)+(income-500000)*0.02;
       }else{
        tax=(250000*0.05)+(500000*0.02)+(income-1000000)*0.03;
       }
     System.out.println("tax u need to pay is "+tax);
      
    }
}
    
