/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psp_ut1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author juanj.hermon
 */
public class Runtime_Ej11 {

    ProcessBuilder pb1 = new ProcessBuilder();
    ProcessBuilder pb2 = new ProcessBuilder();
    InputStream is;
    InputStreamReader isr;
    BufferedReader br;
    Process proceso1, proceso2;
    int exitCode = 0;

    public void execute() throws InterruptedException {
        try {

            //PROCESSBUILDER
            String cad1 = "C:\\Program Files\\Microsoft\\jdk-11.0.22.7-hotspot\\bin\\javac.exe";
            String cad2 = "C:\\Users\\juanj.hermon\\hola.java";

            pb1.command(cad1, cad2);
            proceso1 = pb1.start();
            exitCode = proceso1.waitFor();

            if (exitCode == 0) {
                System.out.println("El programa compiló con éxito");
            } else {
                System.out.println("Error al compilar el programa");
            }

            cad1 = "C:\\Program Files\\Microsoft\\jdk-11.0.22.7-hotspot\\bin\\java.exe";
            cad2 = "hola";

            pb2.command(cad1, cad2);
            pb2.directory(new File("C:\\Users\\juanj.hermon"));
            proceso2 = pb2.start();
            exitCode = proceso2.waitFor();

            if (exitCode == 0) { 
                System.out.println("El programa se lanzo con éxito");
            } else {
                System.out.println("Error al lanzar el programa");
            }

            is = proceso2.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            String linea;

            do {
                linea = br.readLine();
                if (linea != null) {
                    System.out.println(linea);
                }

            } while (linea != null);

            br.close();
            isr.close();
            is.close();

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        System.out.println("--------FIN--------");
    }

    public static void main(String[] args) throws InterruptedException {
        Runtime_Ej11 ej11 = new Runtime_Ej11();
        ej11.execute();
    }
}
