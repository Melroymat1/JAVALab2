import java.util.*;
class addingmax{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in); 
       int[] arr={1,2,3,4,5,6,7,8};
      
       System.out.println("Enter the target value :");
       int target=sc.nextInt();
       boolean found=false;
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
                System.out.println("("+arr[i]+","+arr[j]+")");
               found=true;
            }
        }
       }
       if(!found){
        System.out.println("the target canot be achived :");
       }
      
    }
}
    
