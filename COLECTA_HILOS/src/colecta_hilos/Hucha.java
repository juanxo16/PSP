/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecta_hilos;

/**
 *
 * @author juanj.hermon
 */
public class Hucha {
    private int dinero = 0;  

    public synchronized void agregarDinero(int cantidad) throws InterruptedException {
        while (dinero + cantidad > 2000) {
            System.out.println("Hucha llena");
            wait();
        }
        dinero += cantidad;
        System.out.println("Productor añadió " + cantidad + "€ " + dinero);
        notifyAll();  
    }
    
    public synchronized void retirarDinero(int cantidad) throws InterruptedException {
        while (dinero < cantidad) {
            System.out.println("No hay suficiente dinero en la hucha");
            wait();
        }
        dinero -= cantidad;
        System.out.println("Consumidor retiró " + cantidad + "€ " + dinero);
        notifyAll();  
    }

    public synchronized int getDinero() {
        return dinero;
    }
}

