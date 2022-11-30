/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_03.servicio;

import ejercicio_03.entidades.Baraja;
import ejercicio_03.enumeradores.Palo;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

//@author Facundo Cruz
public class MazoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public LinkedList<Baraja> crearBaraja() {
        LinkedList<Baraja> cartas = new LinkedList();

        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                cartas.add(new Baraja(i, Palo.ESPADAS));
            }
        }
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                cartas.add(new Baraja(i, Palo.COPAS));
            }
        }
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                cartas.add(new Baraja(i, Palo.OROS));
            }
        }
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                cartas.add(new Baraja(i, Palo.BASTOS));
            }
        }

        return cartas;
    }

    public void barajar(LinkedList<Baraja> cartas) {
        Collections.shuffle(cartas);

    }

    public void siguienteCarta(LinkedList<Baraja> cartas, LinkedList<Baraja> monton) {
        if (cartas.isEmpty()) {
            System.out.println("¡¡No hay más cartas!!");
        } else {
            monton.add(cartas.getLast());
            cartas.removeLast();
            
        }
    }

    public String mostrarCartas(LinkedList<Baraja> cartas) {
        return "Quedan " + cartas.size() + " cartas";
    }

    public void darCartas(LinkedList<Baraja> cartas, LinkedList<Baraja> monton) {
        System.out.println("¿Cuántas cartas vas a agarrar?");
        int cant = leer.nextInt();
        if (cant > cartas.size()) {
            System.out.println("No hay cartas suficientes :(");
        } else {
            for (int i = 0; i < cant; i++) {
                siguienteCarta(cartas, monton);
            }
            System.out.println("Cartas pasadas con éxito");
        }
    }

    public void cartasMonton(LinkedList<Baraja> monton) {
        if (monton.isEmpty()) {
            System.out.println("No ha salido ninguna carta del mazo principal");
        } else {
            for (Baraja aux : monton) {
                System.out.println(aux);
            }
        }
    }
    public void mostrarBaraja(LinkedList<Baraja> cartas) {
        if (cartas.isEmpty()) {
            System.out.println("Ya salieron todas las cartukis :')");
        } else {
            for (Baraja aux : cartas) {
                System.out.println(aux);
            }
        }
    }
}
