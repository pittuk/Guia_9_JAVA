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
    private Boolean estado;

    public Asiento() {
    }

    public Asiento(String numeracion, Boolean estado) {
        this.numeracion = numeracion;
        this.estado = estado;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Asiento{" + "numeracion=" + numeracion + ", estado=" + estado + '}';
    }

    
    
}
