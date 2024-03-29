package Entidad;

/**
 *
 * @author Luciana
 */
public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public boolean disparo(Revolver r) {
        if (r.mojar()) {
            return true;
        } else {
            r.siguienteChorro();
            return false;
        }
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

}
