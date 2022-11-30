/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

/**
 *
 * @author pittu
 */

public class Espectador {
private String nombre;
private Integer edad;
private Double dineroTiene;
private Asiento asientoAsignado;

    public Espectador() {
    }

    public Espectador(String nombre, Integer edad, Double dineroTiene, Asiento asientoAsignado) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroTiene = dineroTiene;
        this.asientoAsignado = asientoAsignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getDineroTiene() {
        return dineroTiene;
    }

    public void setDineroTiene(Double dineroTiene) {
        this.dineroTiene = dineroTiene;
    }

    public Asiento getAsientoAsignado() {
        return asientoAsignado;
    }

    public void setAsientoAsignado(Asiento asientoAsignado) {
        this.asientoAsignado = asientoAsignado;
    }

    
    
    
    
    
    
    @Override
    public String toString() {
        return nombre + ", " + edad + " años - ARS " + dineroTiene + " - Asiento: "+ asientoAsignado;
    }


}
