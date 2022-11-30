package ejercicioextra2_guia9_v2;

//@author pittu
import Entidad.Cine;
import Entidad.Espectador;
import Servicio.ServicioCine;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioCine accion = new ServicioCine();
        Cine c1 = new Cine();

        int opcion;
        do {
            System.out.println("\tMenu ");
            System.out.println("1 - Crear Sala");
            System.out.println("2 - Crear personas");
            System.out.println("3 - Crear película");
            System.out.println("4 - Mostrar Sala");
            System.out.println("5 - Iniciar Función");
            System.out.println("6 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    c1.setSala(accion.crearSala());
                    System.out.println("Sala creada con exito");
                    break;
                case 2:
                    System.out.println("Ingrese el numero de personas");
                    int num = leer.nextInt();
                    for (int i = 0; i < num; i++) {
                        c1.setEspectadores(accion.crearEspectador());
                    }
                    System.out.println("Fila de personas creada con exito");
                    break;
                case 3:
                    c1.setPelicula(accion.crearPelicula());
                    System.out.println("Pelicula creada con exito");
                    break;
                case 4:

                    if (c1.getSala() == null) {
                        System.out.println("la sala no ha sido creada");

                    } else {
                        for (int i = 0; i < c1.getSala().length; i++) {
                            for (int j = 0; j < c1.getSala()[i].length; j++) {
                                System.out.print("[" + c1.getSala()[i][j].getNumeracion() + "]");
                            }
                            System.out.println("");
                        }
                    }
                    break;
                case 5:
                    if (c1.getSala() == null||c1.getEspectadores().size()==0||c1.getPelicula()==null) {
                        if (c1.getSala() == null && c1.getEspectadores().size()==0 && c1.getPelicula()==null) {
                            System.out.println("Para inciar la funcion necesita crear una sala, los espectadores y la pelicula");
                            
                        } else if (c1.getEspectadores().size()==0) {
                            System.out.println("Para iniciar la funcion necesita crear los espectadores");
                            
                        } else if (c1.getPelicula()==null) {
                            System.out.println("Para iniciar la función necesita crear una pelicula");
                            
                        } else if (c1.getSala() == null) {
                            System.out.println("Para inciar la funcion necesita crear una sala");
                        }
                    } else {
                        System.out.println("Ingrese el precio de la entrada para esta funcion");
                        c1.setPrecioEntrada(leer.nextInt());
                    accion.iniciarFuncion(c1);
                    }
                    break;
                case 6:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 6));

        for (Espectador aux : c1.getEspectadores()) {
            System.out.println(aux);

        }

        
    }

}
