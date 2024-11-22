/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author juanj.hermon
 */
public class Hilo extends Thread{
    
    private int comienzo;
    private int fin;
    private String nombreCadena;

    public Hilo(int comienzo, int fin, String nombreCadena) {
        this.comienzo = comienzo;
        this.fin = fin;
        this.nombreCadena = nombreCadena;
    }
    
   public void run(){
       System.out.println(this.nombreCadena);
       for (int i = this.comienzo; i <= this.fin && i >= this.comienzo; i++) {
           System.out.println(i+" de la cadena: "+this.nombreCadena);
       }
       System.out.println("Ha terminado el hilo");
   } 
   
    public static void main(String[] args) {
        Hilo h1 = new Hilo(1, 10, "HiloPrimero");
        Hilo h2 = new Hilo(20, 30, "HiloSegundo");
        System.out.println("Vamos a iniciar los dos hilos");
        System.out.println("Los hilos se han inicializado");
        h1.start();
        h2.start();
        System.out.println("El programa principal ha terminado");
        
        
    }
    
}
