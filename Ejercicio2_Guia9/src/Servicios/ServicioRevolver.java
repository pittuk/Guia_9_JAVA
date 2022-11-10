/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;

import Entidad.RevolverDeAgua;

/**
 *
 * @author pittu
 */

public class ServicioRevolver {
    
    
    //le pone los valores de posición actual y de posición del agua. Los valores deben ser aleatorios.
    public RevolverDeAgua llenarRevolver(){
        RevolverDeAgua r1=new RevolverDeAgua();
        r1.setPosicionActual((int)(Math.random()*6));
        r1.setPosicionAgua((int)(Math.random()*6));
        return r1;
      }
    
    public Boolean mojar(RevolverDeAgua r1){
        return (r1.getPosicionActual()==r1.getPosicionAgua());
    }
    
    public void siguienteChorro(RevolverDeAgua r1){
        if (r1.getPosicionActual()==5) {
            r1.setPosicionActual(0);
        } else{
            r1.setPosicionActual(r1.getPosicionActual()+1);
        }
    
    
    }
    
    public void mostrarRevolver(RevolverDeAgua r1){
        System.out.println(r1);
    }

}
