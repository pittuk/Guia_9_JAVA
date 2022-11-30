package ejercicioextra2_guia9;

//@author pittu
import Entidad.Cine;
import Entidad.Espectador;
import Servicio.ServicioCine;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioCine accion = new ServicioCine();
        Cine c1 = new Cine();

        int opcion;
        do {
            System.out.println("-------------------------");
            System.out.println("\tCINE PRINCIPAL ");
            System.out.println("-------------------------");
            System.out.println("1 - Ingresar Pelicula");
            System.out.println("2 - Mostrar Pelicula");
            System.out.println("3 - Crear Espectadores");
            System.out.println("4 - Mostrar Espectadores");
            System.out.println("5 - Crear Sala");
            System.out.println("6 - Mostrar Sala");
            System.out.println("7 - Iniciar la funcion");
            System.out.println("8 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    
                    c1.setPelicula(accion.crearPelicula());
                    System.out.println("Ingrese el precio de la entrada");
                    c1.setPrecioEntrada(leer.nextDouble());
                    System.out.println("LA PELICULA FUE CREADA CON EXITO");

                    break;
                case 2:
                    if (c1.getPelicula() == null) {
                        System.out.println("La pelicula no ha sido creada, por favor ¡Ingrese una pelicula! ");

                    } else {
                        System.out.println("------------------------------");
                        System.out.println("La pelicula para el día de hoy es:");
                        System.out.println(c1.getPelicula().getTitulo());
                        System.out.println("Director: " + c1.getPelicula().getDirector());
                        System.out.println("Duración: " + c1.getPelicula().getDuracion());
                        System.out.println("Edad Minima: " + c1.getPelicula().getEdadMinima());
                        System.out.println("Pecio de entrada: " + c1.getPrecioEntrada());
                    }

                    break;
                case 3:
                    //creamos los espectadores

                    ArrayList<Espectador> espec1 = new ArrayList();
                    int cantidad = 10;
                    for (int i = 0; i < cantidad; i++) {
                        Espectador e1 = accion.crearEpectador();
                        espec1.add(e1);
                    }
                    c1.setEspectadores(espec1);
                    System.out.println("LOS ESPECTADORES FUERON CREADOS CON EXITO");
                    break;
                case 4:
                    if (c1.getEspectadores().size() == 0) {
                        System.out.println("Los especatoddres no han sido creados, por favor ¡Cree los especadores!");
                    } else {

                        System.out.println("Hay " + c1.getEspectadores().size() + " personas en la fila:");
                        System.out.println("---------------------------");
                        for (Espectador aux : c1.getEspectadores()) {
                            System.out.println(aux);
                        }

                    }
                    break;
                case 5:
                    //creamos la sala
                    c1.setSala(accion.crearSala());
                    System.out.println("LA SALA FUE CREADA CON EXITO");
                    break;
                case 6:

                    if (c1.getSala() == null) {
                        System.out.println("La sala no ha sido creada, por favor ¡Cree una sala! ");

                    } else {
                        //MOSTRAMOS LA SALA
                        System.out.println("-------------------------");
                        System.out.println("SALA DEL CINE PRINCIPAL");
                        accion.mostrarSala(c1);
                    }
                    break;
                case 7:
                    if (c1.getSala() == null || c1.getEspectadores().size() == 0 || c1.getPelicula() == null) {
                        if (c1.getSala() == null && c1.getEspectadores().size() == 0 && c1.getPelicula() == null) {
                            System.out.println("La pelicula, los espectadores y la sala no han sido creados, por favor ¡Debe crearlos!");
                        } else if (c1.getSala() == null) {
                            System.out.println("La sala no ha sido creada, por favor ¡Cree una sala!");
                        } else if (c1.getEspectadores().size() == 0) {
                            System.out.println("Los especatoddres no han sido creados, por favor ¡Cree los especadores!");

                        } else if (c1.getPelicula() == null) {
                            System.out.println("La pelicula no ha sido creada, por favor ¡Debe crearla!");

                        }

                    } else {

                        accion.iniciarFuncion(c1);
                    }

                    break;

                case 8:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 8));

        //MOSTRAMOS LA SALA
        accion.mostrarSala(c1);

    }
}
