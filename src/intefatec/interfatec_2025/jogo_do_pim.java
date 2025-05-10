
package intefatec;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class jogo_do_pim {
 
    public static void main(String[] args) {
        
        
        int entrada;
        
        Scanner s = new Scanner(System.in);
        
        entrada = s.nextInt();
        
        for (int i = 1; i <= entrada; i++) {
            if (i % 4 == 0) {
                System.out.print("pim ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}


   
