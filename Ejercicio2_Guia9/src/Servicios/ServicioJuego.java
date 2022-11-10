/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.RevolverDeAgua;
import java.util.ArrayList;

/**
 *
 * @author pittu
 */
public class ServicioJuego {

    public Juego llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r1) {
        Juego juego1=new Juego();
        juego1.setJugadores(jugadores);
        juego1.setRevolver(r1);
        //System.out.println("--------------------------------------");
        return juego1;
        
    }

    public void ronda(Juego juego1) {
        ServicioJugador accion = new ServicioJugador();
        ServicioRevolver accion1 = new ServicioRevolver();
        ArrayList<Jugador> jugadores=juego1.getJugadores();
        int cont=0,cont1=0;
        do {
            for (Jugador aux : jugadores) {
                if (juego1.getRevolver().getPosicionActual()==juego1.getRevolver().getPosicionAgua()) {
                    aux.setMojado(true);
                    cont++;
                    
                    System.out.println(juego1.getRevolver());
                    System.out.println("-----------------------");
                    System.out.println("El jugador " +(aux.getId()+1)+" ha sido mojado en la ronda N° "+ (cont1+1));
                    break;
                    
                }else{
                accion1.siguienteChorro(juego1.getRevolver());
                cont1++;
                    System.out.println((cont1));
                }
                
            }
            
            
        } while (cont<1);
        
        System.out.println("GAME OVER");
        
        
        

    }

}
