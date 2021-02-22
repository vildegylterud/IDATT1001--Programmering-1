/**
 * tar inn et tall fra bruker og sjekker om det er primtall
 */

import static javax.swing.JOptionPane.*;

public class Primtall {
        public static void main(String[] args) {

            int tall = Integer.parseInt(showInputDialog("Skriv tall")); //endrer fra string til tall

            for(int i = tall; i > 1; i--) {
                if (tall%i == 2) {
                    System.out.println("Dette er et primtall");
                }
                else {
                    System.out.println("Dette er ikke et primtall");
                }
            }
        }
    }
