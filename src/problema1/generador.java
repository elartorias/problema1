
package problema1;

import java.io.*;
import java.util.Random;


class generador {
    
    public void gen(int numero){
        
        try
        {
            Random azar = new Random();
            BufferedWriter salida = new BufferedWriter(new FileWriter("generador.in"));
                for (int i = 0; i < numero; i++) {
                    salida.write(azar.nextInt(1999)+1+" ");                
                }
            salida.close();
            
        }catch(IOException e){
            System.out.println("No");
        }
    }
    
}
