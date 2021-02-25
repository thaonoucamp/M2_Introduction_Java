import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        System.out.println("Given a equation as 'a * x + b = 0");

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so cho a:");
        double a = sc.nextDouble();

        System.out.println("Nhap so cho b:");
        double b = sc.nextDouble();

        System.out.println("Nhap so cho c:");
        double c = sc.nextDouble();

        if (a != 0) {
            double result = -b / a;
            System.out.println("Result X = " + result);
        } else {
            if (b == 0) {
                System.out.println("Result is all X !");
            } else {
                System.out.println("No result X !");
            }
        }


    }
}
