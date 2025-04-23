import java.util.*;

class udstoind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the USD Amount  :  ");
        double USD = sc.nextDouble();

        System.out.print("Enter the exchange rate   :  ");
        double exg = sc.nextDouble();

      double  cal=exg*USD;

        System.out.println("BMI : " + cal);
    }
}
