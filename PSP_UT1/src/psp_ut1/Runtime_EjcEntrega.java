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
 */
public class Runtime_EjcEntrega {
    static Runtime r = Runtime.getRuntime();
    static Process proceso;
    static InputStream is;
    static InputStreamReader isr;
    static BufferedReader br;
    
    public static void main(String[] args) 
    {
        // URL de la página que vamos a resolver.
        String url = "educacyl.jcyl.es";

        // Ejecutamos el comando nslookup usando la clase Runtime.
        try 
        {
            // Crear el proceso para ejecutar el comando nslookup.
            proceso = r.exec("nslookup " + url);
            
            // Esperar a que el proceso termine.
            int exitCode = proceso.waitFor();
            if (exitCode == 0) 
            {
                System.out.println("nslookup ser lanzo con éxito");
            } 
            else 
            {
                System.out.println("Error al lanzar nslookup");
            }

            // Capturamos la salida del proceso.
            is = proceso.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Leer y mostrar la salida del proceso.
            String linea;
            System.out.println("Resultado del nslookup para " + url + ":");
            
             do {
                linea = br.readLine();
                if (linea != null) {
                    System.out.println(linea);
                }

            } while (linea != null);

            br.close();
            isr.close();
            is.close();
            
            
        } 
        catch (IOException | InterruptedException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

