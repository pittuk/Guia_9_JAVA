package ejercicio_03;

//@author Facundo Cruz
import ejercicio_03.entidades.Baraja;
import ejercicio_03.servicio.MazoService;

import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio_03 {

    public static void main(String[] args) {
        Baraja b1 = new Baraja();
        MazoService sv = new MazoService();
        LinkedList<Baraja> cartas = sv.crearBaraja();
        LinkedList<Baraja> monton = new LinkedList();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        do {
            System.out.println("\t.:Menu:.");
            System.out.println("1 - Barajar");
            System.out.println("2 - Cartas disponibles");
            System.out.println("3 - Dar cartas");
            System.out.println("4 - Dar siguiente carta");
            System.out.println("5 - Cartas monton");
            System.out.println("6 - Cartas principal");
            System.out.println("7 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    sv.barajar(cartas);
                    System.out.println("Baraja mezclada con exito!! ");
                    break;
                case 2:
                    System.out.println(sv.mostrarCartas(cartas));
                    ;
                    break;
                case 3:
                    sv.darCartas(cartas, monton);
                    

                    break;
                case 4:
                    sv.siguienteCarta(cartas, monton);
                    System.out.println("Siguiente carta enviada con éxito");
                    break;
                case 5:
                    sv.cartasMonton(monton);
                    break;
                case 6:
                    sv.mostrarBaraja(cartas);
                    break;
                case 7:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 7));
    }

}
