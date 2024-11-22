/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos15;

/**
 *
 * @author juanj.hermon
 */
class HiloInc extends Thread {
    //1-ATRIBUTOS 
    private Contador contador;
    //2-CONSTRUCTOR
    public HiloInc(String nombre, Contador contador){
        super(nombre);
        this.contador = contador;
    }
    //3-RUN
    @Override
    public void run(){
        System.out.println("HILO INC:"+this.getName()+ " empieza");
       
            synchronized(contador){
                contador.incrementar();
                contador.notify();
                
            }
        
        System.out.println("HILO INC:"+this.getName()+ " termina"+" CONTADOR ES:"+contador.getContador());
    }
}
