/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author juanj.hermon
 */
public class GestorTransferencias {

    public static boolean transferir(Cuenta c1, Cuenta c2, int cantidad) {
        boolean resultado = false;
        Cuenta cuentaMenor;
        Cuenta cuentaMayor;
        if (c1.getNumCuenta().compareTo(c2.getNumCuenta()) < 0) {
            cuentaMenor = c1;
            cuentaMayor = c2;
        } else {
            cuentaMenor = c2;
            cuentaMayor = c1;
        }
        synchronized (cuentaMenor) {
            synchronized (cuentaMayor) {
                if (c1.getSaldo() >= cantidad) {
                    c1.sacar(cantidad);
                    c2.ingresar(cantidad);
                    resultado = true;
                }
            }
        }
        return resultado;
    }
}
