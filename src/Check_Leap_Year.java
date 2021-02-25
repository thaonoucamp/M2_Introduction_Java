import java.util.Scanner;

public class Check_Leap_Year {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yearCheck = 0;
        boolean isLeapYear = false;

        do {
            System.out.println("Enter a year you want to check:");
            yearCheck = Integer.parseInt(sc.nextLine());

        boolean isYearDiv4 = yearCheck % 4 == 0;
        if (isYearDiv4) {
            boolean isYearDiv100 = yearCheck % 100 == 0;
            if (isYearDiv100) {
                boolean isYearDiv400 = yearCheck % 400 == 0;
                if (isYearDiv400) {
                    isLeapYear = true;
                }
            }
        } else {
            isLeapYear = true;
        }
        if (isLeapYear) {
            System.out.printf("%d is a leap year", yearCheck);
            System.out.println("");
        } else {
            System.out.printf("%d is not leap year", yearCheck);
            System.out.println("");
        }
    } while(true);
}
}
