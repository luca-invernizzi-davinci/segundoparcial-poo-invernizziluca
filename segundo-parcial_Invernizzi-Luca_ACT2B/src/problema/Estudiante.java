package problema;

import java.util.ArrayList;

public class Estudiante extends Usuario{

    //Atributos
    private String carrera;
    private ArrayList<String> materiasAprobadas= new ArrayList<String>();
    private ArrayList<String> materiasInscriptas= new ArrayList<String>();

    //Constructor
    public Estudiante(int dni, String nombre, String apellido, String carrera) {
        super(dni, nombre, apellido);
        this.carrera = carrera;
    }

    //Getters
    public String getCarrera() {
        return carrera;
    }

    public ArrayList<String> getMateriasAprobadas() {
        return this.materiasAprobadas;
    }

    public ArrayList<String> getMateriasInscriptas() {
        return materiasInscriptas;
    }

    //Setters
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setMateriasAprobadas(ArrayList<String> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public void setMateriasInscriptas(ArrayList<String> materiasInscriptas) {
        this.materiasInscriptas = materiasInscriptas;
    }

    //Metodos
    public void imprimirMateriasAprobadas(){
        System.out.println("Materias aprobadas " + getMateriasAprobadas());
    }

    public void imprimirMateriasInscriptas(){
        System.out.println("Materias inscriptas" + getMateriasInscriptas());
    }


}