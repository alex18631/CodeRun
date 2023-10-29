import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;


class Main {
    static int a[] = new int[101];
    static int dp[] = new int[101];

    public static void main(String[] args) {
      /*  Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        int[] fib = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fib[0] = 1;
                continue;
            }
            if (i == 1) {
                fib[1] = 1;
                continue;
            }
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println(Arrays.toString(fib));*/
       /* for (int i = 1; i <= n; i++)
            a[i] = con.nextInt();
        Arrays.sort(a, 1, n + 1);
        dp[2] = a[2] - a[1];
        dp[3] = a[3] - a[1];
        for (int i = 4; i <= n; i++)
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + a[i] - a[i - 1];
        System.out.println(dp[n]);
        con.close();*/
        /*System.out.println(LocalDateTime.now().with(LocalTime.of(2,2,1)));*/
        int i = 0;
        boolean b = Boolean.parseBoolean("0");
        System.out.format("%b",b);
        System.out.format("%b",i);
    }




}