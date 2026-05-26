import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();
        calculator(a, b,operator);
    }

    public static void calculator(int a, int b, int operator) {
        switch (operator) {
            case 1:
                System.out.print(a + b);
                break;
            case 2:
                System.out.print(a - b);
                break;
            case 3:
                System.out.print(a * b);
                break;
            default:
                System.out.print("Invalid input");
        }
    }
}
