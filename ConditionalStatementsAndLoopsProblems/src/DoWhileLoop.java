import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printGreeks(n);
    }

    public static void printGreeks(int n) {
        int i = 0;
        do {
            System.out.println("Geeksforgeeks");
            i++;
        } while (i > n);
    }
}
