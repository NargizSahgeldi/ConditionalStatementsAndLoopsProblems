import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        leapYear(year);
    }

    public static void leapYear(int year) {
        if (year % 400 == 0) {
            System.out.println("True");
        } else if (year % 100 == 0) {
            System.out.println("False");
        } else if (year % 4 == 0) {
            System.out.println("True");
        } else {
            System.out.println();
        }
    }
}

