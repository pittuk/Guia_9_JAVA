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

public class Pelicula {
    private String titulo;
    private Double duracion;
    private Integer edadMinima;
    private String Director;

    public Pelicula() {
    }

    public Pelicula(String titulo, Double duracion, Integer edadMinima, String Director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.Director = Director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edadMinima=" + edadMinima + ", Director=" + Director + '}';
    }
    
    

}
