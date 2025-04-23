import java.util.*;

class ectbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit consumed :  ");
        double unitcon = sc.nextDouble();

        int ratein=5;
      double  cal=unitcon*ratein;

        System.out.println("BMI : " + cal);
    }
}
