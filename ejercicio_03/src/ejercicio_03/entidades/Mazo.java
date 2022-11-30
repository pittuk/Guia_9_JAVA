/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_03.entidades;

import java.util.LinkedList;


//@author Facundo Cruz

public class Mazo {
    LinkedList<Baraja> cartas;

    public Mazo() {
    }

    public Mazo(LinkedList<Baraja> cartas) {
        this.cartas = cartas;
    }

    public LinkedList<Baraja> getCartas() {
        return cartas;
    }

    public void setCartas(LinkedList<Baraja> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Mazo{" + "cartas=" + cartas + '}';
    }
    
}
