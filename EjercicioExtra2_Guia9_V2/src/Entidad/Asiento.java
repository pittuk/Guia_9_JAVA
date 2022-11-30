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

public class Asiento {
    private String numeracion;
    private boolean estado;

    public Asiento() {
    }

    public Asiento(String numeracion, boolean estado) {
        this.numeracion = numeracion;
        this.estado = estado;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
        this.numeracion=numeracion +"X";
    }

    @Override
    public String toString() {
        return "Asiento{" + "numeracion=" + numeracion + ", estado=" + estado + '}';
    }
    
   
    

}
