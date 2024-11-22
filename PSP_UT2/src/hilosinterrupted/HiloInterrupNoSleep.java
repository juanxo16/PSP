/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilosinterrupted;

/**
 *
 * @author juanj.hermon
 */
public class HiloInterrupNoSleep implements Runnable {
    String nombre;

    public HiloInterrupNoSleep(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public void run() {
       System.out.println("INICIO:" +this.getNombre());
       while(!Thread.currentThread().isInterrupted()){
           
           System.out.println("HILO NO INTERRUMPIDO:"+this.nombre);
       }
       System.out.println("***INTERRUMPIDO***"+this.getNombre());
    }
    
}

