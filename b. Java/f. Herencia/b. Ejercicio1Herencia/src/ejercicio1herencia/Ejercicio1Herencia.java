
package ejercicio1herencia;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author Luciana
 */
public class Ejercicio1Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro("Stitch", "Carnivoro", 15, "Doberman");
        perro1.Alimentarse();
        
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.Alimentarse();
        
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato1.Alimentarse();
        
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse();
    }
    
}
