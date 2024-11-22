/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos_estado;

import java.util.ArrayList;

/**
 *
 * @author juanj.hermon
 */
public class Raton implements Runnable{
	private String nombre;
	private int tiempoAlimentacion;
        private int contadorAlimentos;

    public Raton(String nombre, int tiempoAlimentacion) {
        super();
        this.nombre = nombre;
        this.tiempoAlimentacion = tiempoAlimentacion;
    }
    public void comer(){
        try {
            System.out.println("El ratón "+nombre+" ha comenzado a comer");
            Thread.sleep(tiempoAlimentacion*1000);
            contadorAlimentos++;
            System.out.println(contadorAlimentos);
            System.out.println("El ratón "+nombre+" ha terminado a comer");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 public static void main(String[] ar) {

     Raton rocky=new Raton("Rocky",6);

     ArrayList<Thread.State> estadosHilo = new ArrayList<>();
     Thread h = new Thread(rocky);
     estadosHilo.add(h.getState());
     h.start();
     while(h.getState()!=Thread.State.TERMINATED){
         if(!estadosHilo.contains(h.getState())){
             estadosHilo.add(h.getState());
         }
     }
     //Estado terminado
     if(!estadosHilo.contains(h.getState())){
             estadosHilo.add(h.getState());
         }
     for (Thread.State estado : estadosHilo) {
         System.out.println("Estado: "+estado);
     }
}

    @Override
    public void run() {
        this.comer();
    }
}        
