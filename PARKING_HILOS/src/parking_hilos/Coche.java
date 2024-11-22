/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parking_hilos;

/**
 *
 * @author juanj.hermon
 */
public class Coche extends Thread {

    private String nombre;
    private String matricula;
    private ControlParking parking;

    public Coche(String nombre, String matricula, ControlParking parking) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.parking = parking;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ControlParking getParking() {
        return parking;
    }

    public void setParking(ControlParking parking) {
        this.parking = parking;
    }

    @Override
    public void run() {
        
        try{
            parking.meterCoche();
            
            System.out.println("El coche " +nombre+ " entra al parking");
            
            Thread.sleep(10000);
            
            parking.sacarCoche();
            
            System.out.println("El coche " +nombre+ " sale del parking");
        }catch(InterruptedException ex){
            
        }
    }
    
    

   
}
