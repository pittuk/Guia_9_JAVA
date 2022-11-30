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

    public Asiento[][] crearSala() {
        Asiento[][] asientos = new Asiento[8][6];
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                Asiento a1 = new Asiento();
                if (i == 0) {
                    if (j == 0) {
                        a1.setNumeracion("8A");
                        a1.setEstado(false);

                    } else if (j == 1) {
                        a1.setNumeracion("8B");
                        a1.setEstado(false);

                    } else if (j == 2) {
                        a1.setNumeracion("8C");
                        a1.setEstado(false);

                    } else if (j == 3) {
                        a1.setNumeracion("8D");
                        a1.setEstado(false);

                    } else if (j == 4) {
                        a1.setNumeracion("8E");
                        a1.setEstado(false);

                    } else if (j == 5) {
                        a1.setNumeracion("8F");
                        a1.setEstado(false);

                    }
                    asientos[i][j] = a1;
                } else if (i == 1) {
                    if (j == 0) {
                        a1.setNumeracion("7A");
                        a1.setEstado(false);

                    } else if (j == 1) {
                        a1.setNumeracion("7B");
                        a1.setEstado(false);

                    } else if (j == 2) {
                        a1.setNumeracion("7C");
                        a1.setEstado(false);

                    } else if (j == 3) {
                        a1.setNumeracion("7D");
                        a1.setEstado(false);

                    } else if (j == 4) {
                        a1.setNumeracion("7E");
                        a1.setEstado(false);

                    } else if (j == 5) {
                        a1.setNumeracion("7F");
                        a1.setEstado(false);

                    }
                    asientos[i][j] = a1;
                } else if (i == 2) {
                    if (j == 0) {
                        a1.setNumeracion("6A");
                        a1.setEstado(false);

                    } else if (j == 1) {
                        a1.setNumeracion("6B");
                        a1.setEstado(false);

                    } else if (j == 2) {
                        a1.setNumeracion("6C");
                        a1.setEstado(false);

                    } else if (j == 3) {
                        a1.setNumeracion("6D");
                        a1.setEstado(false);

                    } else if (j == 4) {
                        a1.setNumeracion("6E");
                        a1.setEstado(false);

                    } else if (j == 5) {
                        a1.setNumeracion("6F");
                        a1.setEstado(false);

                    }
                    asientos[i][j] = a1;
                } else if (i == 3) {
                    if (j == 0) {
                        a1.setNumeracion("5A");
                        a1.setEstado(false);

                    } else if (j == 1) {
                        a1.setNumeracion("5B");
                        a1.setEstado(false);

                    } else if (j == 2) {
                        a1.setNumeracion("5C");
                        a1.setEstado(false);

                    } else if (j == 3) {
                        a1.setNumeracion("5D");
                        a1.setEstado(false);

                    } else if (j == 4) {
                        a1.setNumeracion("5E");
                        a1.setEstado(false);

                    } else if (j == 5) {
                        a1.setNumeracion("5F");
                        a1.setEstado(false);

                    }
                    asientos[i][j] = a1;
                } else if (i == 4) {
                    if (j == 0) {
                        a1.setNumeracion("4A");
                        a1.setEstado(false);

                    } else if (j == 1) {
                        a1.setNumeracion("4B");
                        a1.setEstado(false);

                    } else if (j == 2) {
                        a1.setNumeracion("4C");
                        a1.setEstado(false);

                    } else if (j == 3) {
                        a1.setNumeracion("4D");
                        a1.setEstado(false);

                    } else if (j == 4) {
                        a1.setNumeracion("4E");
                        a1.setEstado(false);

                    } else if (j == 5) {
                        a1.setNumeracion("4F");
                        a1.setEstado(false);

                    }
                    asientos[i][j] = a1;
                } else if (i == 5) {
                    if (j == 0) {
                        a1.setNumeracion("3A");
                        a1.setEstado(false);

                    } else if (j == 1) {
                        a1.setNumeracion("3B");
                        a1.setEstado(false);

                    } else if (j == 2) {
                        a1.setNumeracion("3C");
                        a1.setEstado(false);

                    } else if (j == 3) {
                        a1.setNumeracion("3D");
                        a1.setEstado(false);

                    } else if (j == 4) {
                        a1.setNumeracion("3E");
                        a1.setEstado(false);

                    } else if (j == 5) {
                        a1.setNumeracion("3F");
                        a1.setEstado(false);

                    }
                    asientos[i][j] = a1;
                } else if (i == 6) {
                    if (j == 0) {
                        a1.setNumeracion("2A");
                        a1.setEstado(false);

                    } else if (j == 1) {
                        a1.setNumeracion("2B");
                        a1.setEstado(false);

                    } else if (j == 2) {
                        a1.setNumeracion("2C");
                        a1.setEstado(false);

                    } else if (j == 3) {
                        a1.setNumeracion("2D");
                        a1.setEstado(false);

                    } else if (j == 4) {
                        a1.setNumeracion("2E");
                        a1.setEstado(false);

                    } else if (j == 5) {
                        a1.setNumeracion("2F");
                        a1.setEstado(false);

                    }
                    asientos[i][j] = a1;
                } else if (i == 7) {
                    if (j == 0) {
                        a1.setNumeracion("1A");
                        a1.setEstado(false);

                    } else if (j == 1) {
                        a1.setNumeracion("1B");
                        a1.setEstado(false);

                    } else if (j == 2) {
                        a1.setNumeracion("1C");
                        a1.setEstado(false);

                    } else if (j == 3) {
                        a1.setNumeracion("1D");
                        a1.setEstado(false);

                    } else if (j == 4) {
                        a1.setNumeracion("1E");
                        a1.setEstado(false);

                    } else if (j == 5) {
                        a1.setNumeracion("1F");
                        a1.setEstado(false);

                    }
                    asientos[i][j] = a1;
                }
            }
        }
        //String[][] sala = {{"8A", "|8B", "|8C", "|8D", "|8E", "|8F"}, {"7A", "|7B", "|7C", "|7D", "|7E", "|7F"}, {"6A", "|6B", "|6C", "|6D", "|6E", "|6F"}, {"5A", "|5B", "|5C", "|5D", "|5E", "|5F"}, {"4A", "|4B", "|4C", "|4D", "|4E", "|4F"}, {"3A", "|3B", "|3C", "|3D", "|3E", "|3F"}, {"2A", "|2B", "|2C", "|2D", "|2E", "|2F"}, {"1A", "|1B", "|1C", "|1D", "|1E", "|1F"}};
        /* for (int i = 0; i < c1.getSala().length; i++) {
            for (int j = 0; j < c1.getSala()[i].length; j++) {
                System.out.print(sala[i][j]);
                
            }
            System.out.println("");
        }*/
        return asientos;
    }

    public Espectador crearEpectador() {
        Espectador e1 = new Espectador();
        //edad aleatoria entre 16 y 20
        Integer edad = (int) Math.floor(Math.random() * (15 - 20 + 1) + 20);
        e1.setEdad(edad);

        // nombres aleatorios de un vector string
        Random r = new Random();
        String[] nombre = {"juan", "pedro", "jose", "antonio", "karla", "jose", "maria", "roxana", "miguel", "roberto", "lautaro", "facundo", "gilberto", "adrian", "jimena", "rosa", "ernesto", "ricardo", "amalia", "wanda", "messi", "carlos", "ana", "filomena", "Bronzon", "atamaica", "queretaro", "simon"};
        int aux = r.nextInt(nombre.length);
        e1.setNombre(nombre[aux]);

        //dinero que tiene aleatorio
        Double dinero = Math.random() * (100 - 200) + 200;
        e1.setDineroTiene(dinero);
        return e1;
    }

    public Pelicula crearPelicula() {
        Pelicula p1 = new Pelicula();
        System.out.println("Ingrese nombre de la pelicula:");
        p1.setTitulo(leer.next());
        System.out.println("Ingrese la duracion:");
        p1.setDuracion(leer.nextDouble());
        System.out.println("Ingrese la edad minima:");
        p1.setEdadMinima(leer.nextInt());
        System.out.println("Ingres el director:");
        p1.setDirector(leer.next());

        return p1;
    }

    public void mostrarSala(Cine c1) {
        //MOSTRAMOS LA SALA
        for (int i = 0; i < c1.getSala().length; i++) {
            for (int j = 0; j < c1.getSala()[i].length; j++) {
                System.out.print("[" + c1.getSala()[i][j].getNumeracion() + "]");
            }
            System.out.println("");
        }
    }

    public void iniciarFuncion(Cine c1) {

        ArrayList<String> asientosAleatorios = new ArrayList();

        for (int i = 0; i < c1.getSala().length; i++) {
            for (int j = 0; j < c1.getSala()[i].length; j++) {
                asientosAleatorios.add(c1.getSala()[i][j].getNumeracion());//Ingresamos los asientos en ArrayList para poder mezclarlos 
            }
        }
        Collections.shuffle(asientosAleatorios);// mezcalmos el arraylist
        //recorremos el arraylist de asientos aleatorios
        for (Espectador e1 : c1.getEspectadores()) {
            if (e1.getDineroTiene() < c1.getPrecioEntrada() || e1.getEdad() < c1.getPelicula().getEdadMinima()) {
                if (e1.getDineroTiene() < c1.getPrecioEntrada() && e1.getEdad() < c1.getPelicula().getEdadMinima()) {

                    System.out.println("Hola " + e1.getNombre() + ", Lo sentimos, no tiene el dinero ni la edad suficiente para esta funcion");

                } else if (e1.getDineroTiene() < c1.getPrecioEntrada()) {
                    System.out.println("Hola " + e1.getNombre() + ", Lo sentimos, no tiene el dinero suficiente para esta funcion");

                } else if (e1.getEdad() < c1.getPelicula().getEdadMinima()) {
                    System.out.println("Hola " + e1.getNombre() + ", Lo sentimos, no tiene la edad minima requerida para ver esta pelicula");

                }

            } else {
                // RECORREMOS LOS ASIENTOS ALEATORIOS
                System.out.println("Hola "+ e1.getNombre() + " te ha tocado el asiento "+ asientosAleatorios);      
                            
                            
                       
                

            }

        }

    }

}
