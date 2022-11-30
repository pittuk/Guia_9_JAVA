/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Jugador;
import Entidad.RevolverDeAgua;
import Servicios.ServicioRevolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioJugador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Jugador crearJugador(int num) {
        Jugador j1 = new Jugador();

        j1.setId(num);
        j1.setNombre("Jugador " + (num+1));
        j1.setMojado(false);

        /*for (Jugador jugadore : jugadores) {
            System.out.println(jugadore);
        }*/
        return j1;
    }

    public Boolean disparo(RevolverDeAgua r1) {
        ServicioRevolver accion = new ServicioRevolver();

        if (accion.mojar(r1)) {
            System.out.println("Mojado");
            return true;
        } else {
            accion.siguienteChorro(r1);
        }
        return false;
    }

}
