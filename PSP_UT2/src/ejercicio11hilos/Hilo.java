/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11hilos;

import java.util.ArrayList;

/**
 *
 * @author juanj.hermon
 */
public class Hilo implements Runnable {
    //1-ATRIBUTOS
    String  Nombre;
    int miParte;
    int miCuenta;
    private hilosincronizado.Contador cont;
    
    //2-CONSTRUCTOR
    public Hilo(String nombre, int miParte, hilosincronizado.Contador cont) {
        this.Nombre = nombre;
        this.miParte = miParte;
        this.miCuenta=0;
        this.cont = cont;
    }
    //3-GETTER MICUENTA
    public int getMiCuenta() {
        return miCuenta;
    }
      
    //4-RUN
    @Override
    public void run() {
        System.out.println("Hilo: "+this.Nombre+ " empieza");
        for (int i=0;i<miParte;i++){
            this.cont.incrementa();
            miCuenta++;
        }
        System.out.println("Hilo "+ this.Nombre + " terminado " +getMiCuenta());
    }
    public static void main(String[] ar) {
        final int CUENTATOTAL=1000;
        ArrayList<Thread> arrayHilos = new ArrayList<>();
        hilosincronizado.Contador c=new hilosincronizado.Contador();
        
        for (int i = 0; i <= CUENTATOTAL; i++) {
            arrayHilos.add(new Thread(new Hilo("H"+i, CUENTATOTAL,c)));
        }
         for (Thread h: arrayHilos) {
            h.start();
        }
          for (Thread h: arrayHilos) {
            try {
             h.join();
         } catch(InterruptedException e) {
             System.out.println ("Hilo principal interrumpido");
         }
        }
 

         
         System.out.println("Hilo principal terminado"); 
         System.out.println("Cuenta Total:"+c.getCuenta());
    }
    
}
