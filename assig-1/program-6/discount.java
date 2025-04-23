import java.util.*;

class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item Amount : ");
        int amount = sc.nextInt();

        System.out.print("Enter item discount percentage : ");
        double discount = sc.nextInt();
        double cal=(amount*discount/100);
        double finalam=amount-cal;
        System.out.print("After discount the price is : "+finalam);
        
    }
}
