

package ejercicioextra4_guia9;

//@author pittu

import Entidad.Alumno;
import Servicio.Simulador;
import java.util.ArrayList;


public class Principal {

    public static void main(String[] args) {
        Simulador accion=new Simulador();
        
        
        //ArrayList<String>nombres=accion.listadoAlumnos();
        //ArrayList<Integer>dnis=accion.numerosDni();
         ArrayList<Alumno>alumnos=accion.crearAlumnos();
         
         
        // System.out.println(accion.numerosDni());
         
         
         for (Alumno aux : alumnos) {
             System.out.println(aux);
            
        }
         
        
        
        
        
       
        
        
        
    }

}
