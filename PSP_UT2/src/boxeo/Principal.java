/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boxeo;

/**
 *
 * @author juanj.hermon
 */
public class Principal {

    public static void main(String args[]) {
        // 1 RING y 2 BOXEADORES
        Ring ring = new Ring();
        Boxeador boxeador1 = new Boxeador("Tyson", ring);
        Boxeador boxeador2 = new Boxeador("Rocky", ring);

        boxeador1.start();
        boxeador2.start();

        try {
            boxeador1.join();
            boxeador2.join();
        } catch (InterruptedException ie) {
        }

        System.out.println("Fin del combate");
        if (boxeador1.getGolpes() > boxeador2.getGolpes()) {
            System.out.println("Ha ganado " + boxeador1.getNombre());
        } else if (boxeador1.getGolpes() < boxeador2.getGolpes()) {
            System.out.println("Ha ganado " + boxeador2.getNombre());
        } else {
            System.out.println("Empate");
        }
    }
}
