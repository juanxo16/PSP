/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12entrega;

/**
 *
 * @author juanj.hermon
 */
public class Contador {
    
    private int Cuenta;

    public Contador(int Cuenta) {
        this.Cuenta = Cuenta;
    }
    
    

    public int getCuenta() {
        return Cuenta;
    }

    synchronized public void setCuenta(int Cuenta) {
        this.Cuenta = Cuenta;
    }
    synchronized public int incrementa(){
        this.Cuenta++;
        return Cuenta;
    }
    synchronized public int decrementa(){
        this.Cuenta--;
        return Cuenta;
    }
}
