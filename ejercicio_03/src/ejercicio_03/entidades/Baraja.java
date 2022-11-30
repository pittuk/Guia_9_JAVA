/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_03.entidades;

//@author Facundo Cruz

import ejercicio_03.enumeradores.Palo;

public class Baraja{

    private int num;
    private Palo palo;

    public Baraja() {
    }

    public Baraja(int num, Palo palo) {
        this.num = num;
        this.palo = palo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return num + "-->" + palo ;
    }

    
    
    
}
