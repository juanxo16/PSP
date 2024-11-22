/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos15;

/**
 *
 * @author juanj.hermon
 */
public class Principal {
    public static void main(String[] args) {
        int i;
        Contador contador = new Contador(0);

        Thread[] HilosInc = new Thread[10];    
        Thread[] HilosDec = new Thread[10];
        
        for(i=0; i<10;i++){
            Thread hilo = new HiloInc("HiloInc"+i, contador);
            HilosDec[i]=hilo;
        }
        
         for(i=0; i<10;i++){
            Thread hilo = new HiloDec("HiloDec"+i, contador);
            HilosInc[i]=hilo;
        }
        //LANZO 10 HILOS 
          for(i=0; i<10;i++){
              HilosDec[i].start();
          }
          
        //LANZO 10 HILOS 
         for(i=0; i<10;i++){
              HilosInc[i].start();
          }
        try {
             for(i=0; i<10;i++){
              HilosDec[i].join();
            }
         } catch(InterruptedException e) {
             System.out.println ("Hilo principal interrumpido");
         }
         try {
             for(i=0; i<10;i++){
              HilosInc[i].join();
            }
         } catch(InterruptedException e) {
             System.out.println ("Hilo principal interrumpido");
         }
         System.out.println("FIN PROGRAMA");
       
    }
}
