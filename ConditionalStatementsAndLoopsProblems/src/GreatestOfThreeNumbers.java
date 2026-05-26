import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        compare(a, b, c);
    }

    public static void compare(int a, int b, int c) {
        int max = Math.max(a, Math.max(b,c));
        System.out.println(max);

        /*if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }*/
    }
}
