/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecta_hilos;

/**
 *
 * @author juanj.hermon
 */
public class Consumidor implements Runnable {

    private String nombre;
    private Hucha hucha;

    public Consumidor() {
    }

    public Consumidor(String nombre, Hucha hucha) {
        this.nombre = nombre;
        this.hucha = hucha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Hucha getHucha() {
        return hucha;
    }

    public void setHucha(Hucha hucha) {
        this.hucha = hucha;
    }

    @Override
    public void run() {
        try {
            while (true) {
                hucha.retirarDinero(20);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
