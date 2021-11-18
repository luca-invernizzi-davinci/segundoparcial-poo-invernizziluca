package problema;

import org.w3c.dom.ls.LSOutput;

import javax.xml.namespace.QName;

import static java.lang.System.*;

public abstract class Usuario {

    //Atributos
    private int dni;
    private String nombre;
    private String apellido;
    private String name= getClass().getSimpleName();

    //Constructor
    public Usuario(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getters
    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    //Setters
    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "El dni del " + name + " es  " + dni;
    }
}
