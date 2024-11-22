/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psp_ut1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author juanj.hermon
 * Como lanzar un comando interno de MSDOS
 */

public class Runtime_Ej4 {
    
    Runtime r = Runtime.getRuntime();
    Process proceso;
    InputStream is;
    InputStreamReader isr;
    BufferedReader br;
    
    public void execute(){
        
        String comando = "cmd /c tasklist";
        try{
            System.out.println("Lanzando el DIR");
            proceso = r.exec(comando);
            System.out.println("Esperando a que termine la ejecución del DIR");
            int resultado = proceso.waitFor();
            
            if(resultado==0){
                System.out.println("DIR se lanzó con éxito");
                is = proceso.getInputStream();
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);
            }
            else{
                System.out.println("Error en la ejecución de DIR");
                is = proceso.getInputStream();
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);
            }
            
            String linea  = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            isr.close();
            is.close();
            
        }
        catch(IOException | InterruptedException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Runtime_Ej4 ej4 = new Runtime_Ej4();
        ej4.execute();
    }

    
}
