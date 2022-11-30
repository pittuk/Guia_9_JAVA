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

public class Voto {
    private Alumno alumno;
    private ArrayList<Alumno> alumnosVoto;

    public Voto() {
    }

    public Voto(Alumno alumno, ArrayList<Alumno> alumnosVoto) {
        this.alumno = alumno;
        this.alumnosVoto = alumnosVoto;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Alumno> getAlumnosVoto() {
        return alumnosVoto;
    }

    public void setAlumnosVoto(ArrayList<Alumno> alumnosVoto) {
        this.alumnosVoto = alumnosVoto;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", alumnosVoto=" + alumnosVoto + '}';
    }
    
    
    

}
