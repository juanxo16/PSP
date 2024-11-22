/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author juanj.hermon
 */
public class Principal {
    //4-MAIN
    //En la clase principal crea los hilos, los lanza y espera a que terminen
    //Un hilo realiza transferencia de C1 a C2
    //El otro hilo realiza transferencia de C2 a C1
     public static void main(String[] ar) {
        System.out.println("Transferencia de 500 de C1 a C2");
        System.out.println("Transferencia de 900 de C2 a C1");
        Cuenta c1=new Cuenta("ES1112343456420456323532",12500);
        Cuenta c2=new Cuenta("ES6111343456420456323532",23400);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        Thread h1=new Thread(new Hilo(c1,c2,500,"H1"));
        Thread h2=new Thread(new Hilo(c2,c1,900,"H2"));
        h1.start();
        h2.start();
        try {
             h1.join();
             h2.join();
         } catch(InterruptedException e) {
             System.out.println ("Hilo principal interrumpido");
         }
  
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}

