/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Luciana
 */
public class Alumno {

    private String nombre;
    private ArrayList<Double> notas = new ArrayList();
    private String auxiliar="";

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    /*0public void mostrarNotas() {
        
        for (double n : notas) {
            System.out.println(n);
            auxiliar+=""+n;
        }
        
    }
*/
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", auxiliar=" + auxiliar + '}';
    }
    

}
