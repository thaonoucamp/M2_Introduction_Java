import java.util.Scanner;

public class Rectangle {
    static float height;
    static float weight;
    static float area;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap chieu cao :");
        height = sc.nextFloat();

        System.out.println("Nhap chieu rong :");
        weight = sc.nextFloat();

        area = height * weight;
        System.out.println("Area = " + area);
    }
}
