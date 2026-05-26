import java.util.Scanner;

public class JavaLoopsSet1WithoutArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        sum(N);
    }

    public static void sum(int N){
        int []sum = new int[2];
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 1; i <= N; i++){
            if(i % 2 == 0){
                evenSum+=i;
            }else {
                oddSum+=i;
            }
        }
        System.out.println(evenSum + "," + oddSum);
    }
}
