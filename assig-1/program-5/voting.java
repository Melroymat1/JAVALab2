import java.util.*;

class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Age  ");
        double age = sc.nextDouble();

        System.out.printf(age>=18?"your are eligable":"your are not eligable");
    }
}
