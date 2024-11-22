/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilo16;

import java.util.List;

/**
 *
 * @author juanj.hermon
 */
public class Consumidor implements Runnable {

    private String nombre;
    private List<String> productos;

    public Consumidor(String nombre, List<String> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public void run() {
        System.out.println("HILO CONSUMIDOR: Empieza:" + this.nombre);
        try {
            synchronized (productos) {
                if (productos.size() == 0) {
                    System.out.println("No hay productos para consumir");
                    productos.wait();
                }
                productos.remove(0);

            }
            System.out.println("HILO " + this.nombre + " CONSUMO UN PRODUCTO");
        } catch (Exception ex) {
        }
        System.out.println("HILO CONSUMIDOR: Finaliza:" + this.nombre);
    }

}
