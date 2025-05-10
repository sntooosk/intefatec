package intefatec.interfatec_2025;


import java.util.Scanner;

/**
 *
 * @author byteSquad
 */
public class agricultor {
    
   
    public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
     
     int N = sc.nextInt();
     
        for (int i = 0; i < N; i++) {
            double temperatura = sc.nextDouble();
            double umidade = sc.nextDouble();
            int previsaoChuva = sc.nextInt();
            
           
            if (previsaoChuva == 1) {
                System.out.println("NAO REGAR");
              
            } else if (temperatura > 30 && umidade < 50) {
                System.out.println("REGAR");
            } else {
                System.out.println("NAO REGAR");

            }
        }
    }
}
