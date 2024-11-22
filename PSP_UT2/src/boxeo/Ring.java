/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boxeo;

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

    public synchronized void pegar(Boxeador boxeador) {
        boxeador.pegar();
        ringgolpes++;
        System.out.println("Ring golpes: "+ ringgolpes + " Pegada de " + boxeador.getNombre() + " (" + boxeador.getGolpes() + ")");
    }
}
