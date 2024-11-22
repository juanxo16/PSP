/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos15;

/**
 *
 * @author juanj.hermon
 */
class HiloDec extends Thread {
    private Contador contador;
    
   public HiloDec(String name, Contador contador){
        super(name);
        this.contador = contador;
    }

    @Override
    public void run(){
        System.out.println("HILO DEC: "+this.getName()+" empieza");
       
            synchronized(contador){
                while (contador.getContador()<=0)
                {
                    try{
                            System.out.println("----------------HAY QUE ESPERAR   PORQUE CONTADOR ES:"+contador.getContador());
                            contador.wait();
                    }catch (InterruptedException ex){
                    }
                }
                contador.decrementar();
                
                
            }
        System.out.println("HILO DEC: Termina:"+this.getName()+ " CONTADOR ES:"+contador.getContador());
    }
}

