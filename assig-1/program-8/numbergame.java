import java.util.*;
import java.util.Random;
class numbergame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();

        int number=rand.nextInt(10)+1;
        System.out.println("Enter the number : ");
        int guess=sc.nextInt();
        System.out.println(number==guess?"your guess is correct":"not correct the correct number is "+number);
    }
}