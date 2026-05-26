import java.util.Scanner;

public class EvenOddGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 1 && n <= 100) {
            evenOdd(n);
        } else {
            System.out.println("Invalid number");
        }
    }

    public static void evenOdd(int n) {
        if (n % 2 != 0) {
            System.out.println("You");
        } else {
            System.out.println("Friend");
        }
    }
}

