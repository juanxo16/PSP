/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psp_ut2;

/**
 *
 * @author juanj.hermon
 */
public class Ejercicio_1 {
    
public static void main(String[] args) {
        HiloMostrarNumero hilo1 = new HiloMostrarNumero(0);
        hilo1.start();
        HiloMostrarNumero hilo2 = new HiloMostrarNumero(1);
        hilo2.start();
    }
}

class HiloMostrarNumero extends Thread {

    private int numero;
    public HiloMostrarNumero(int num){
        this.numero = num;
    }
    @Override
    public void run() {
        for (int f = 1; f <= 1000; f++)
            System.out.print(numero+"-");
    }
}

//class HiloMostrarUno extends Thread {
//
//    @Override
//    public void run() {
//        for (int f = 1; f <= 1000; f++)
//            System.out.print("1-");
//    }
//}

