/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author juanj.hermon
 */

public class Cuenta {
    String numCuenta;
    int saldo;
   
    public Cuenta(String numCuenta,int saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;      
    }

    public String getNumCuenta() {
        return numCuenta;
    }
    
    public synchronized int getSaldo() {
        return saldo;
    }
    public synchronized void ingresar(int cantidad) {
        this.saldo+=cantidad;
    }
    public synchronized void sacar(int cantidad) {
        this.saldo-=cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", saldo=" + saldo + '}';
    }
}

