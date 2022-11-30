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
    private Asiento[][] sala;
    private Pelicula pelicula;
    private ArrayList<Espectador> espectadores;
    private Integer precioEntrada=120;

    public Cine() {
        this.espectadores=new ArrayList();
    }

    public Cine(Asiento[][] sala, Pelicula pelicula, ArrayList<Espectador> espectadores, Integer precioEntrada) {
        this.sala = sala;
        this.pelicula = pelicula;
        this.espectadores = espectadores;
        this.precioEntrada = precioEntrada;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(Espectador e) {
        this.espectadores.add(e);
    }

    public Integer getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Integer precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "sala=" + sala + ", pelicula=" + pelicula + ", espectadores=" + espectadores + ", precioEntrada=" + precioEntrada + '}';
    }

    
    
         
    

}
