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
public class Runtime_Ej3 
{
    Runtime r = Runtime.getRuntime();

    public static void main(String[] args) 
    {
        Runtime_Ej3 ejc3 = new Runtime_Ej3();
        ejc3.execute();
        System.out.println("Fin");
    }

    public void execute() 
    {
        String comando1 = "notepad";
        String comando2 = "C:\\Users\\juanj.hermon\\Downloads\\AnyDesk.exe";

        Process proceso;

        try 
        {
            System.out.println("Lanzando notepad");
            proceso = r.exec(comando1);
            System.out.println("El notepad está corriendo pero sigue");

            System.out.println("Lanzando excel");
            proceso = r.exec(comando2);
            System.out.println("Esperando a que termine la ejecucion de excel");

            int resultado = proceso.waitFor();
            if(resultado == 0)
            {
                System.out.println("Excel ha finalizado correctamente");
            }
            else
            {
                System.out.println("Error al ejecutar excel");
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
}
