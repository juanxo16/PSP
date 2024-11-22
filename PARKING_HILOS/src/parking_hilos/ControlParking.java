/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parking_hilos;

/**
 *
 * @author juanj.hermon
 */
public class ControlParking {
    private final int capacidad;
    private int numCoches = 0;

    public ControlParking(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
    public synchronized void meterCoche() throws InterruptedException{
        if(numCoches >= capacidad){
            System.out.println("No hay plazas en el parking");
            wait();
        }
        Thread.sleep(300);
        numCoches++;
    }
    
    public synchronized void sacarCoche(){

        numCoches--;
        notifyAll();
    }
}
