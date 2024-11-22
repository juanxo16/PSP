/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilosnosincronizacion;

/**
 *
 * @author juanj.hermon
 */
public class Contador {
    private int Cuenta;

    public int getCuenta() {
        return Cuenta;
    }

public void setCuenta(int Cuenta) {
        this.Cuenta = Cuenta;
    }
    public int incrementa(){
        this.Cuenta++;
        return Cuenta;
    }
    
}

