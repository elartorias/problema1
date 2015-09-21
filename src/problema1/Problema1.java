
package problema1;

import java.io.*;
import java.util.Random;


public class Problema1 {


    public static void main(String[] args) 
    {
        
        
        generador arc = new generador();
        arc.gen(10);
        String nombre = "generador.in";
        String linea = null;
        
        try
        {
            FileReader lector = new FileReader(nombre);
            BufferedReader bufo = new BufferedReader(lector);
            
            while((linea = bufo.readLine()) != null){
                System.out.println(linea);
                
            
            
            }bufo.close();
            
        }catch(FileNotFoundException ex) 
        {
            
            System.out.println("No se pudo abrir el archivo '" + nombre + "'");                
        }
        catch(IOException ex) {
            
        }
            System.out.println("Error al leer el archivo '" + nombre + "'");
            
        }
        
    }

