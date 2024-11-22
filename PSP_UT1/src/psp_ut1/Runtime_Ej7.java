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

/**
 *
 * @author juanj.hermon
 */
public class Runtime_Ej7 {

    ProcessBuilder pb = new ProcessBuilder();
    InputStream is;
    InputStreamReader isr;
    BufferedReader br;
    Process proceso;
    int exitCode = 0;

    public void execute() throws InterruptedException {
        try {

            //PROCESSBUILDER
            List<String> lista = new ArrayList<String>();
            lista.add("cmd.exe");
            lista.add("/C");
            lista.add("ping");
            lista.add("www.educa.jcyl.es");

            pb.command(lista);
            proceso = pb.start();
            exitCode = proceso.waitFor();

            if (exitCode == 0) {
                System.out.println("PING ser lanzo con éxito");
            } else {
                System.out.println("Error al lanzar PING");
            }
            is = proceso.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            String linea;

            do {
                linea = br.readLine();
                System.out.println(linea);
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
        Runtime_Ej7 ej7 = new Runtime_Ej7();
        ej7.execute();
    }

}
