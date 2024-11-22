/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilosincronizado;

/**
 *
 * @author juanj.hermon
 */
public class Hilo implements Runnable {
    //1-ATRIBUTOS
    String  Nombre;
    int miParte;
    int miCuenta;
    private Contador cont;
    
    //2-CONSTRUCTOR
    public Hilo(String nombre, int miParte, Contador cont) {
        this.Nombre = nombre;
        this.miParte = miParte;
        this.miCuenta=0;
        this.cont = cont;
    }
    //3-GETTER MICUENTA
    public int getMiCuenta() {
        return miCuenta;
    }
      
    //4-RUN
    @Override
    public void run() {
        System.out.println("Hilo: "+this.Nombre+ " empieza");
        for (int i=0;i<miParte;i++){
            this.cont.incrementa();
            miCuenta++;
        }
        System.out.println("Hilo "+ this.Nombre + " terminado " +getMiCuenta());
    }
    public static void main(String[] ar) {
        final int CUENTATOTAL=900000;
        Contador c=new Contador();
        Thread h1=new Thread(new Hilo("H1", CUENTATOTAL/3,c));
        Thread h2=new Thread(new Hilo("H2", CUENTATOTAL/3,c));
        Thread h3=new Thread(new Hilo("H3", CUENTATOTAL/3,c));
        h1.start();
        h2.start();
        h3.start();
         try {
             h1.join();
             h2.join();
             h3.join();
         } catch(InterruptedException e) {
             System.out.println ("Hilo principal interrumpido");
         }
         System.out.println("Hilo principal terminado"); 
         System.out.println("Cuenta Total:"+c.getCuenta());
    }
    
}

