/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boxeo2;

import java.util.Random;

/**
 *
 * @author juanj.hermon
 */
public class Boxeador extends Thread {
        //ATRIBUTOS
    private String nombre;
    private Ring ring;
    private int golpes;

    public Boxeador(String nombre, Ring ring){
        this.nombre = nombre;
        this.ring = ring;
                this.golpes = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGolpes() {
        return golpes;
    }

    public void pegar() {
        golpes++;
    }

    @Override
    public void run() {
                //LA PARTIDA SE TERMINA CON 200 GOLPES
        while (ring.getRingGolpes() < 100) {
            this.pegar();
            ring.incrementar();
            System.out.println(this.getNombre()+" ha golpeado "+this.golpes+" veces");
            try {
                                //ALEATORIO DE 0 a 499 MILISEGUNDOS
                Thread.sleep(new Random().nextInt(500));
            } catch (InterruptedException ie) {}
        }
    }
}
