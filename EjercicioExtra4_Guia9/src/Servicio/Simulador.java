/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class Simulador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    int cantidad=0;

    public ArrayList<String> listadoAlumnos() {
        

        
        String[] nombre = {"Andrea", "Luis", "Candela", "Fernando", "Florencia", "David", "Gimena", "Marcos", "Cecilia", "Gabriel", "Pedro", "Jose", "Augusto", "Guillermo", "Karla", "Roxana"};
        String[] apellido = {"Chiquito", "Guerrero", "Cardenas", "Cardona", "Palermo", "Riquelme", "Maradona", "Castro", "Gonzalez", "Iriarte", "Cruz", "Rivadeneira", "Castro", "Perez", "Fernandez", "Mendez"};
        ArrayList<String> nombres = new ArrayList();

        for (int i = 0; i < cantidad; i++) {
            int ran1 = (int)( Math.random() * 16);
            int ran2 = (int) (Math.random() * 16);
            nombres.add(nombre[ran1] + " " + apellido[ran2]);

        }
        return nombres;
    }

    public ArrayList<Integer> numerosDni() {
        ArrayList<Integer> dnis = new ArrayList();

        for (int i = 0; i < cantidad; i++) {
            Integer ran3 = (int) (Math.random() * 30000000 + 20000000);

            while (dnis.contains(ran3)) {
                ran3 = (int) (Math.random() * 30000000 + 20000000);
            }
            dnis.add(ran3);

        }
        /*for (Integer dni : dnis) {
            System.out.print(dnis);
        }*/
        return dnis;
    }
    
   public ArrayList<Alumno> crearAlumnos(){
      System.out.println("Cuantos Alumnos desea crear");
       cantidad = leer.nextInt();
       
       ArrayList<String>nombres=listadoAlumnos();
       ArrayList<Integer>dnis=numerosDni();
       ArrayList<Alumno>alumnos=new ArrayList();
       
       for (int i = 0; i < cantidad; i++) {
          Alumno a1=new Alumno();
           a1.setDni(dnis.get(i));
           a1.setNombreCompleto(nombres.get(i));
           alumnos.add(a1);
           
       }
    return alumnos;
   }

}
