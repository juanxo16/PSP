/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psp_ut1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanj.hermon
 */
public class Runtime_Ej5 {
    
    ProcessBuilder pb = new ProcessBuilder();
    
    public void execute(){
        try{
            
            //PROCESSBUILDER
            List<String> lista = new ArrayList<String>();
            lista.add("cmd.exe");
            lista.add("/C");
            lista.add("Start Chrome");
                    
            pb.command(lista);
            pb.start();
            
        }
        catch(IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        
        System.out.println("--------FIN--------");
    }
    
    public static void main(String[] args) {
        Runtime_Ej5 ej5 = new Runtime_Ej5();
        ej5.execute();
    }
    
    
}
