import java.util.*;
class rightleft{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in); 
        int[] arr={1,2,3,4,5,6,7,8,9};
       
        System.out.println("Enter the position :  ");
       int k=sc.nextInt();
       System.out.println("Enter the Direction(L/R) :  ");
       String dir=sc.next();
       k%=arr.length;

       if(dir.equalsIgnoreCase("r")){
        k=arr.length-k;
       }

       reve(arr,0,k-1);
       reve(arr,k,arr.length-1);
       reve(arr,0,arr.length-1);

     System.out.println("arra elements : "+Arrays.toString(arr));
}
static void reve(int[] a,int l,int r){
    while (l<r) {
        int t=a[l];
        a[l++]=a[r];
        a[r--]=t;
        
    }
}
}
    
