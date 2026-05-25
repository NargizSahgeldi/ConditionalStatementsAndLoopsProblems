import java.util.Scanner;

public class TheElseIFStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        utility(number);

    }

    public static void utility(int number) {
        if (number > 100) {
            System.out.println("Big");
        } else if (number < 10) {
            System.out.println("Small");
        } else {
            System.out.println("Number");
        }
    }
}
