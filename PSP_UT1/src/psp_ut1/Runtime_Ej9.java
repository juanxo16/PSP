/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psp_ut1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author juanj.hermon
 */
public class Runtime_Ej9 {

    Runtime r = Runtime.getRuntime();
    InputStream is;
    InputStreamReader isr;
    BufferedReader br;
    Process proceso;
    int exitCode = 0;
    String comando = "";
    String txtAbuscar = "";
    Scanner sc = new Scanner(System.in);

    public void execute() throws InterruptedException {

        r = Runtime.getRuntime();
        System.out.println("Introduce una palabra para ver cuantas veces esta en el texto");
        txtAbuscar = sc.nextLine().trim();

        try {

            comando = "cmd /C find /c \"" + txtAbuscar + "\" C:\\Users\\juanj.hermon\\DAM2.txt";
            proceso = r.exec(comando);
            exitCode = proceso.waitFor();

            if (exitCode == 0) {
                System.out.println("Se lanzo con éxito");
            } else {
                System.out.println("Error al lanzarlo");
            }
            is = proceso.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            String linea;

            do {
                linea = br.readLine();
                
                if(linea != null){
                    System.out.println(linea);
                }
                
            } while (linea != null);
            
            br.close();
            isr.close();
            is.close();

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Runtime_Ej9 ejc9 = new Runtime_Ej9();
        ejc9.execute();
        System.out.println("Fin");
    }
}
