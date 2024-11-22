/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boxeo2;

/**
 *
 * @author juanj.hermon
 */
public class Ring {
    private int ringgolpes;

    public Ring() {
        ringgolpes = 0;
    }

    public int getRingGolpes() {
        return ringgolpes;
    }

    public synchronized void incrementar() {
        
        ringgolpes++;
        System.out.println("Ring golpes: "+ ringgolpes );
    }
}
