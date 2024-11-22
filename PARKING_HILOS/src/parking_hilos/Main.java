/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parking_hilos;

import java.util.ArrayList;

/**
 *
 * @author juanj.hermon
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        int i;

        ControlParking ctrlParking = new ControlParking(10);
        ArrayList<Thread> coches = new ArrayList<>();

        for (i = 0; i < 20; i++) {

            coches.add(new Thread(new Coche("coche " + i, i + "JBH", ctrlParking)));
        }

        for (Thread h : coches) {
            h.start();
            Thread.sleep(1000);
        }

        try {
            for (Thread h : coches) {
                h.join();
            }
        } catch (Exception e) {

        }
    }
}
