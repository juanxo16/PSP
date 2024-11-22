/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12entrega;


/**
 *
 * @author juanj.hermon
 */
public class Main {
    public static void main(String[] ar) {
        
        Contador c = new Contador(10);
        Thread h1=new Thread(new HiloInc("HiloInc", c));
        Thread h2=new Thread(new HiloDec("HiloDec", c));
        h1.start();
        h2.start();
         try {
             h1.join();
             h2.join();
         } catch(InterruptedException e) {
             System.out.println ("Hilo principal interrumpido");
         }
         System.out.println("Hilo principal terminado"); 
         System.out.println("Cuenta Total:"+c.getCuenta());
    }
}
