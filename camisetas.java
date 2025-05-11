import java.util.*;

public class camisetas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] Q = new int[3];
        int[] L = new int[3];

        for (int i = 0; i < 3; i++) {
            Q[i] = sc.nextInt();
            L[i] = sc.nextInt();
        }

        int[] dp = new int[T + 1];

        for (int i = 0; i < 3; i++) {
            for (int j = Q[i]; j <= T; j++) {
                dp[j] = Math.max(dp[j], dp[j - Q[i]] + L[i]);
            }
        }

        System.out.println(dp[T]);
    }
}