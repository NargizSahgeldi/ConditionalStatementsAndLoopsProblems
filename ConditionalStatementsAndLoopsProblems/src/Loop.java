import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x >= 0 && x <= 100) {
            numLine(x);
        } else {
            System.out.println("Invalid input");
        }
    }

    public static void numLine(int x) {
        for (int i = x; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
