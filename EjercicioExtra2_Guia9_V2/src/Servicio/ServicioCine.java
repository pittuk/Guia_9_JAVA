/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicio;

import Entidad.Asiento;
import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pittu
 */

public class ServicioCine {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pelicula crearPelicula(){
        Pelicula p1=new Pelicula();
        System.out.println("Ingrese titulo");
        p1.setTitulo(leer.next());
        System.out.println("Ingrese duracion en horas");
        p1.setDuracion(leer.nextDouble());
        System.out.println("Ingrese edad minima");
        p1.setEdadMinima(leer.nextInt());
        System.out.println("Ingrese director");
        p1.setDirector(leer.next());
        
        return p1;
     }
    
    public Asiento[][] crearSala(){
    Asiento[][] sala=new Asiento[8][6];
    int num=8;
    String[] letras={"A","B","C","D","E","F"};
   
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                String nombre=num +(letras[j]);
                sala[i][j]=new Asiento(nombre, false);
            }
            num--;
        }
    
     return sala;
    }
    
    public Espectador crearEspectador(){
        Espectador e1=new Espectador();
        e1.setEdad((int)(Math.random()* (14 - 21 + 1) + 21));
        e1.setDineroDisponible((int)(Math.random()* (99 - 150 + 1) + 150));
        String[] nombres = {"juan", "pedro", "jose", "antonio", "karla", "jose", "maria", "roxana", "miguel", "roberto", "lautaro", "facundo", "gilberto", "adrian", "jimena", "rosa", "ernesto", "ricardo", "amalia", "wanda", "messi", "carlos", "ana", "filomena", "Bronzon", "atamaica", "queretaro", "simon"};
       // Random r=new Random();
       e1.setNombre(nombres[(int)(Math.random()*nombres.length)]);
       return e1;
    
     }
    
    
    public void iniciarFuncion(Cine c1){
    ArrayList<Asiento> a1=new ArrayList();
        for (int i = 0; i < c1.getSala().length; i++) {
            for (int j = 0; j < c1.getSala()[i].length; j++) {
                a1.add(c1.getSala()[i][j]);
             }
        }
        
        Collections.shuffle(a1);
        int cont=0;
        System.out.println("-----------------------");
        System.out.println("INICIO DE LA FUNCIÓN");
        System.out.println("-----------------------");
        for (Espectador e1 : c1.getEspectadores()) {
            
            if (e1.getDineroDisponible()<c1.getPrecioEntrada()||e1.getEdad()<c1.getPelicula().getEdadMinima()||cont==48) {
                if (e1.getDineroDisponible()<c1.getPrecioEntrada()) {
                    System.out.println(e1.getNombre()+", no tienes el dinero suficiente");
                    
                } else if (e1.getEdad()<c1.getPelicula().getEdadMinima()) {
                    System.out.println(e1.getNombre()+", usted no tiene la edad necesaria");
                    
                } else if (cont==48) {
                    System.out.println(e1.getNombre()+", la sala esta llena");
                    break;
                }
                
            }else{
                System.out.println(e1.getNombre()+", ¡BIENVENIDO(A)! Disfruta la función");
                e1.setAsiento(a1.get(cont));
                a1.get(cont).setEstado(true);
                
                cont++;
                
            }
            
        } 
        System.out.println("Ingresaron "+ cont + " personas a la sala");
        
    }
    
    
    
    
    
    
    
    

}
