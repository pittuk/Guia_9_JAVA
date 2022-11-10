

package ejercicio2_guia9;

//@author pittu

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.RevolverDeAgua;
import Servicios.ServicioJuego;
import Servicios.ServicioJugador;
import Servicios.ServicioRevolver;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        //scanner
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        //acciones
        ServicioRevolver accion2=new ServicioRevolver();
        ServicioJugador accion=new ServicioJugador();
        ServicioJuego accion1=new ServicioJuego();
        
       
        //instanciación
        ArrayList<Jugador> jugadores = new ArrayList();
        RevolverDeAgua r1=accion2.llenarRevolver();
        
        
        int numJu = 0;
        do {
            System.out.println("Indique la cantidad de jugadores, entre 1 y 6");
            numJu = leer.nextInt();

        } while (numJu < 1 || numJu > 6);
        
        for (int i = 0; i< numJu; i++) {
            Jugador j1=accion.crearJugador(i);
            jugadores.add(j1);
        }
        
        //instanciación
        Juego juego1=accion1.llenarJuego(jugadores, r1);
        
        for (Jugador aux : jugadores) {
         System.out.println(aux);   
        }
        System.out.println("-----------------------------");
        System.out.println(r1);
        System.out.println("-----------------------------");
        
        accion1.ronda(juego1);
        
        
        
        
        
        
        
        
    }

}
