/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author juanj.hermon
 */
   public class Hilo implements Runnable {
    //1-ATRIBUTOS
    Cuenta ctaOri, ctaDest;
    int cantidad;
    String nombreHilo;
    //2-CONSTRUCTOR
    public Hilo(Cuenta ctaOri, Cuenta ctaDest, int cantidad, String nombreHilo) {
        this.ctaOri = ctaOri;
        this.ctaDest = ctaDest;
        this.cantidad=cantidad;
        this.nombreHilo = nombreHilo;
    }
    //3-RUN
    @Override
    public void run(){
        System.out.println("Hilo "+ nombreHilo + " comienza");
        int numTransferencias=0;
        if (GestorTransferencias.transferir(ctaOri, ctaDest, cantidad)) numTransferencias++;
        
        System.out.println("Hilo "+ nombreHilo + " terminado ha realizado "+numTransferencias +" transferencias");
    }
}

