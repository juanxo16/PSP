/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12entrega;

/**
 *
 * @author juanj.hermon
 */
public class HiloDec extends Thread {

    //1-ATRIBUTOS
    String Nombre;
    private Contador contador;

    //2-CONSTRUCTOR
    public HiloDec(String Nombre, Contador contador) {
        this.Nombre = Nombre;
        this.contador = contador;
    }

    //3-RUN
    @Override
    public void run() {
        System.out.println("Hilo: " + this.Nombre + " empieza");
        for (int i = 0; i < 5; i++) {
            this.contador.decrementa();
            System.out.println("ContadorDec : " + contador.getCuenta());

        }
        System.out.println("Hilo " + this.Nombre + " terminado ");
    }
}
