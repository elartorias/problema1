
package problema1;

import java.io.*;



public class Problema1 {
   


    public static void main(String[] args) 
    {
        
        int pf = 0;
        int fp = 0;
        int x=0, y=0, v=0, z=0;
        generador arc = new generador();
        arc.gen(5);
        String nombre = "generador.in";
        String linea = null;
        String str = "",str1 = "", str2 = "",n1="",n2="";
        FileInputStream fis = null;
        
        try
        {
            FileReader lector = new FileReader(nombre);
            BufferedReader bufo = new BufferedReader(lector);
            
            while((linea = bufo.readLine()) != null){
                System.out.println(linea);
            }
            bufo.close();
            
        }catch(FileNotFoundException ex) 
        {    
            System.out.println("No se pudo abrir el archivo '" + nombre + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error al leer el archivo '" + nombre + "'");
        }
        
        try {
            fis = new FileInputStream(nombre);
            int contenido;
            while ((contenido = fis.read()) != -1) {
                
                str += (char) contenido;
            }

            
            System.out.println(str=str.replaceAll(" ", ""));

        } catch (IOException e) {
            e.printStackTrace();
        
        

        }
        
        for(int i=0; i<str.length(); i++){
           
            char num = str.charAt(i);
            str1 += num;
            x=Integer.parseInt(str1);
            if(x>2000){
                n1+=v;
                str1=""+num;
                pf++;
            }else{
                v = x;
            }
        }
        

        System.out.println(""+pf+" "+fp);
        
        
        
        
    }
}


