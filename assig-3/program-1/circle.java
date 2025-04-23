import java.util.*;
class circle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        double radius=sc.nextDouble();
        double area=Math.PI*radius*radius;
        System.out.println("Area is : "+area);
        double cir=2*Math.PI*radius;
        System.out.println("cir is : "+cir);

    }
}