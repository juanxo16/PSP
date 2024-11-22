/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psp_ut1;

import java.io.IOException;

/**
 *
 * @author juanj.hermon
 */
public class Runtime_Ej6 {
    
    Runtime r = Runtime.getRuntime();
    
    public void execute(){
        

        Process proceso;

        try 
        {
            System.out.println("Lanzando panel de control");
            proceso = r.exec("mspaint");
            System.out.println("El notepad está corriendo pero sigue");

            int resultado = proceso.waitFor();
            if(resultado == 0)
            {
                System.out.println("Excel ha finalizado correctamente");
            }
            else
            {
                System.out.println("Error al ejecutar Paint");
            }
        } 
        catch (IOException ex) 
        {
            System.out.println("Error: " + ex.getMessage());
        }
        catch(InterruptedException ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
     public static void main(String[] args) 
    {
        Runtime_Ej6 ejc6 = new Runtime_Ej6();
        ejc6.execute();
        System.out.println("Fin");
    }
}
