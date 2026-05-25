import java.util.Scanner;

public class TheElseStatement {
    public static void main(String[] args) {
        solve();

    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 100) {
            System.out.println("Big");
        } else {
            System.out.println("Small");
        }
    }
}
