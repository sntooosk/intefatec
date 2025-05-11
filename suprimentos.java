import java.util.*;

public class suprimentos {
    
    
     public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    
    int saldo = 0;
    int mSaldo = 0;
    
         for (int i = 0; i < n; i++) {
             int evento = s.nextInt();
             saldo += evento;
             
             if (saldo < mSaldo){
                 mSaldo = saldo;
             }
         }
         System.out.println(-mSaldo);
    }
    
}
