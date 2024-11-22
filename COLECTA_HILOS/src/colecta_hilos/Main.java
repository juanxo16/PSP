/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecta_hilos;

/**
 *
 * @author juanj.hermon
 */
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        Hucha hucha = new Hucha();  
        List<Thread> hilos = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            Thread productor = new Thread(new Productores("Productor " + i, hucha));
            hilos.add(productor);
            productor.start();
        }

        for (int i = 0; i < 200; i++) {
            Thread consumidor = new Thread(new Consumidor("Consumidor " + i, hucha));
            hilos.add(consumidor);
            consumidor.start();
        }

    
        }
    }
