package ejercicio1_guia9;

//@author pittu
import Entidad.Perro;
import Entidad.Persona;
import Enumeraciones.Raza;
import Enumeraciones.TamanioPerro;

public class Principal {

    public static void main(String[] args) {
        
        Perro perro1=new Perro("Chiquito",Raza.Pastor,5,TamanioPerro.Grande);
        Perro perro2=new Perro("Cachorro",Raza.Cocker,1,TamanioPerro.Pequeño);
        Persona p1 = new Persona("Luis","Cruz",45,98525635,perro1);
        Persona p2 = new Persona("Jose","Barrios",20,50525635,perro2);
        
        
        
      
        System.out.println(p1);
        System.out.println("---------------------------------");
        System.out.println(p2);

    }

}
