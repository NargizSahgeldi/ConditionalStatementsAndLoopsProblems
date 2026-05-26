import java.util.Scanner;

public class JavaLoopsSet1WithArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] res = sum(N);
        System.out.println(res[0] + "," + res[1]);
    }

    public static int[] sum(int N) {
        int[] sum = new int[2];

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sum[0] += i;
            } else {
                sum[1] += i;
            }
        }
        return sum;
    }
}
