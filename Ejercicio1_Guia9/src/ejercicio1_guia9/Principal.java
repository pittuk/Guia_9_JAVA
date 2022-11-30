package ejercicio1_guia9;

//@author pittu
import Entidad.Perro;
import Entidad.Persona;
import Enumeraciones.DisponibilidadPerro;
import Enumeraciones.Raza;
import Enumeraciones.TamanioPerro;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        HashSet<Perro> perrera = new HashSet();
        perrera.add(new Perro("Chiquito", Raza.Pastor, 5, TamanioPerro.Grande, true));
        perrera.add(new Perro("Chiquito", Raza.Callejero, 2, TamanioPerro.Mediano, true));
        perrera.add(new Perro("Filomena", Raza.Cocker, 1, TamanioPerro.Grande, true));
        perrera.add(new Perro("Lola", Raza.Pitbull, 10, TamanioPerro.Mediano, true));
        perrera.add(new Perro("Luna", Raza.Cocker, 12, TamanioPerro.Pequeño, true));
        perrera.add(new Perro("Dominic", Raza.Pastor, 6, TamanioPerro.Grande, true));

        HashSet<Persona> gentio = new HashSet();
        gentio.add(new Persona("Luis", "Cruz", 45, 98525635, null));
        gentio.add(new Persona("Jose", "Torres", 40, 98554235, null));
        gentio.add(new Persona("Juan", "Lopez", 60, 56825635, null));
        gentio.add(new Persona("Lautaro", "Martinez", 21, 84535635, null));
        gentio.add(new Persona("Facundo", "Cruz", 20, 86935635, null));

        //String opcion="";
        for (Persona aux : gentio) {
            System.out.println("Hola " + aux.getNombre() + " ¿Quieres adoptar una mascota? S/N");

            if (leer.next().equalsIgnoreCase("s")) {
                System.out.println("---------------------------------------");
                System.out.println("Esta es la lista de mascotas");
                System.out.println("---------------------------------------");
                for (Perro perro : perrera) {

                    System.out.println(perro.getNombre() + " - Raza: " + perro.getRaza());

                }
                System.out.println("---------------------------------------");
                System.out.println("Indicanos el nombre del perro");
                System.out.println("---------------------------------------");
                String opcion = leer.next();
                int cont = 0, cont2 = 0;
                for (Perro perro : perrera) {
                    if (opcion.equalsIgnoreCase(perro.getNombre())) {
                        if (perro.getDisponible() == true) {
                            System.out.println("Felicidades, adoptaste a " + perro.getNombre());
                            perro.setDisponible(false);
                            aux.setPerro(perro);
                            cont++;
                        } else {
                            cont2++;

                        }

                    }

                }

                if (cont2 > 0) {
                    System.out.println("El perro ya no esta disponible");

                }

            }

        }
        
        System.out.println("-------------------------");
        System.out.println("lista de personas");
        System.out.println("-------------------------");
        for (Persona persona : gentio) {
            System.out.println(persona);
            
        }

    }

}
