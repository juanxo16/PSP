/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilosinterrupted;

/**
 *
 * @author juanj.hermon
 */
public class Principal {
    public static void main(String[] args) throws InterruptedException  {
        try{
            Thread h1=new Thread(new HiloInterrupSleep("H1"));
            Thread h2=new Thread(new HiloInterrupNoSleep("H2"));
            h1.start();
            h2.start();
            Thread.sleep(10);
            System.out.println("Voy a interrumpir los hilos");
            h1.interrupt();
            h2.interrupt();
        }catch(InterruptedException ex){
             System.out.println("Hilo principal interrumpido");    
        }
    }
}

