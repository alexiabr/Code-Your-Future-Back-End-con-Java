
package Entidad;

/**
 *
* @author Luciana
 */
public class Caballo extends Animal {

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    
    
    @Override
    public void Alimentarse() {
        System.out.println("El caballo come " + alimento);
    }
    
}