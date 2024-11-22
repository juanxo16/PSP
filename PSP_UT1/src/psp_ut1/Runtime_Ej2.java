/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psp_ut1;

/**
 *
 * @author juanj.hermon
 */
public class Runtime_Ej2 {

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Free Memory:" + rt.freeMemory());
        System.out.println("Total Memory:" + rt.totalMemory());
        System.out.println("Max Memory:" + rt.maxMemory());
        System.out.println("Available Processors:" + rt.availableProcessors());

        // run a thread before shutting down
        rt.addShutdownHook(new Thread(() -> {
            System.out.println("Good bye!");
        }));
        System.out.println("Jvm shutting down...");

        // Llamada al Garbage Collector
        rt.gc();
        System.out.println("Garbage Collector ejecutado.");

        // Memoria libre después del GC
        double memoriaLibre = rt.freeMemory();
        System.out.println("Memoria libre después del GC: " + memoriaLibre);

    }

}
