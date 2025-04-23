import java.util.*;
class missing{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in); 
    

        System.out.println("Enter the range from 1 to N :");
        int n=sc.nextInt();

        int[] arr = new int[n - 1];

 System.out.println("Enter the "+(n-1)+" values from 1 to "+n);
 for(int i=0;i<n-1;i++){
     arr[i]=sc.nextInt();
 }

 int espectedsum=n*(n+1)/2;
 int actualsum=0;
 for(int num:arr)actualsum+=num;
 int missing=espectedsum-actualsum;

 System.out.println("the missing value is : "+missing);
       
    
    
      
    }
}
    
