package intefatec.interfatec_2025;

import java.util.*;

/**
 *
 * @author ByteSquad
 */
public class fonte {
   
   
    public static void main(String[] args) {
        
         Scanner s = new Scanner(System.in);
    
    int T = s.nextInt();
    int V = s.nextInt();
    int C = s.nextInt();
    int M = s.nextInt();
   
    
    int tempo_vale = (C * 2 * T) + (M * 4 * T);
    int tempo_colina = (V * 2 * T) + (M * 2 * T);
    int tempo_topo = (V * 4 * T) + (C * 2 * T);
    
    int menorTempo = Math.min(tempo_vale, Math.min(tempo_colina, tempo_topo));
    
       System.out.println(menorTempo);
    }
}
