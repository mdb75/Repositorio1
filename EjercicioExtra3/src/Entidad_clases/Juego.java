/*
 Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos 
jugadores jugar un juego de adivinanza de números. El primer jugador elige un
número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un 
número limitado de intentos y recibe una pista de "más alto" o "más bajo" después 
de cada intento. El juego termina cuando el segundo jugador adivina el número o
se queda sin intentos. Registra el número de intentos necesarios para adivinar
el número y el número de veces que cada jugador ha ganado.

 */
package Entidad_clases;

import java.util.Scanner;

public class Juego {

    private int num1;
    private int ad;

    public Juego() {
    }

    public Juego(int num1) {
        this.num1 = num1;
    }

    public void IniciarJuego() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero a adivinar, tiene 5 intentos");
        ad = sc.nextInt();
        System.out.println("Adivine el numero");
        for (int i = 0; i < 5; i++) {
            num1 = sc.nextInt();
            
            if (ad > num1) {
                System.out.println("El numero debe ser mayor ");
            } else if (num1 < ad) {
                System.out.println("El numero debe ser menor");
            } else if (ad == num1) {
                System.out.println("Adivino el numero");
                i = 5;

            } else {
                System.out.println("Terminaron los intentos");
            }

        }

    }

}
//import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Juego {

    private int n;
    private int ad;

    public Juego() {
    }

    public Juego(int n) {
        this.n = n;
    }

    public void iniciarJuego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero a adivinar");
        ad = leer.nextInt();
        System.out.println("adivine el numero");
        for (int i = 0; i < 3; i++) {
            n = leer.nextInt();
            if (n < ad) {
                System.out.println("el numero es mayor");
            }else if(i==2) {
                System.out.println("perdiste los intentos");
            }else if (n > ad) {
                System.out.println("el numero es menor");
                
             } else if (n == ad) {
                 System.out.println("adivinaste");
                 i=3;
            }

            

        }
    }

//public class Ejercicio4_guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Juego j1 = new Juego();
      j1.iniciarJuego();
    }
    
}