/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raton_nohilos;

/**
 *
 * @author juanj.hermon
 */
public class Raton {
	private String nombre;
	private int tiempoAlimentacion;

    public Raton(String nombre, int tiempoAlimentacion) {
        super();
        this.nombre = nombre;
        this.tiempoAlimentacion = tiempoAlimentacion;
    }
    public void comer(){
        try {
            System.out.println("El ratón "+nombre+" ha comenzado a comer");
            Thread.sleep(tiempoAlimentacion*1000);
            System.out.println("El ratón "+nombre+" ha terminado a comer");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 public static void main(String[] ar) {

     Raton rocky=new Raton("Rocky",4);
     Raton jerry=new Raton("Jerry",3);
     Raton pinky=new Raton("Pinky",5);
     Raton mickey=new Raton("Mickey",6);
     rocky.comer();
     jerry.comer();
     pinky.comer();
     mickey.comer();
}
}        
