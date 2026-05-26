import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x >= 0 && x <= 100) {
            numLine(x);
        } else {
            System.out.println("Invalid Input");
        }
    }

    public static void numLine(int x) {
        while (x >= 0) {
            System.out.print(x + " ");
            x--;
        }

    }
}
