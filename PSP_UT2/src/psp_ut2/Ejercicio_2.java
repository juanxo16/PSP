/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psp_ut2;

/**
 *
 * @author juanj.hermon
 */
public class Ejercicio_2 {
     public static void main(String[] args) {
        HiloMostrarNumero hilo1 = new HiloMostrarNumero(0);

        HiloMostrarNumero hilo2 = new HiloMostrarNumero(1);

    }
}

class HiloMostrarNumero implements Runnable {

    private Thread t;
    private int numero;
    
    public HiloMostrarNumero(int num){
        numero = num;
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        for (int f = 1; f <= 1000; f++)
            System.out.print(numero+"-");
    }
}

