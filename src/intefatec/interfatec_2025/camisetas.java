package intefatec.interfatec_2025;

import java.util.Scanner;

/**
 *
 * @author ByteSquad
 */

public class camisetas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tecido = sc.nextInt();
        int[] quantidade_tecido = new int[3];
        int[] lucro_gerado = new int[3];

        for (int i = 0; i < 3; i++) {
            quantidade_tecido[i] = sc.nextInt();
        }

        
        for (int i = 0; i < 3; i++) {
            lucro_gerado[i] = sc.nextInt();
        }

        int[] dp = new int[tecido + 1];

        for (int i = 0; i < 3; i++) {
            for (int j = quantidade_tecido[i]; j <= tecido; j++) {
                dp[j] = Math.max(dp[j], dp[j - quantidade_tecido[i]] + lucro_gerado[i]);
            }
        }

        System.out.println(dp[tecido]);
        sc.close();
    }
}

       
