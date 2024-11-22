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
public class Runtime_Ej1 {
    public static void main(String[] args) {
        String comando; 
        comando = "Notepad.exe C:\\Users\\juanj.hermon\\Desktop\\coche.txt";
        //comando = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";
        try{
            Runtime p1 = Runtime.getRuntime();            
            p1.exec(comando);
        }
        catch(IOException e){
            System.out.println("Error en: " + comando);
            e.printStackTrace();
        }
    }
}
