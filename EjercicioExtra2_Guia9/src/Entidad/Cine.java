/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

import java.util.ArrayList;

/**
 *
 * @author pittu
 */

public class Cine {
    private Pelicula pelicula;
    private Asiento[][] sala;
    private Double precioEntrada;
    private ArrayList<Espectador> espectadores=new ArrayList();

    public Cine() {
        }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    public Double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Cine(Pelicula pelicula, Asiento[][] sala, Double precioEntrada) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", sala=" + sala + ", precioEntrada=" + precioEntrada + ", espectadores=" + espectadores + '}';
    }

   
}
