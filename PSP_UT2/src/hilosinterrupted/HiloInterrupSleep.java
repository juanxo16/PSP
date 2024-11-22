/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilosinterrupted;

/**
 *
 * @author juanj.hermon
 */
public class HiloInterrupSleep implements Runnable {
    String nombre;

    public HiloInterrupSleep(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public void run() {
        System.out.println("INICIO:" +this.getNombre());
        try{
            while(true){
                Thread.sleep(1000);
            } 
      } catch (InterruptedException ex){
              System.out.println("INTERRUMPIDO "+this.getNombre());  
              }
    }
    
}

