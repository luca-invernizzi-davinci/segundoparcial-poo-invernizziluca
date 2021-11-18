package problema;

import java.util.ArrayList;

public class Profesor extends Usuario{

    //Atributos
    private ArrayList<String> comisiones= new ArrayList<String>();

    //Constructor
    public Profesor(int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
    }

    //Getter
    public ArrayList<String> getComisiones() {
        return comisiones;
    }

    //Setter
    public void setComisiones(ArrayList<String> comisiones) {
        this.comisiones = comisiones;
    }

    //Metodos
    public void imprimirComisiones(){
        System.out.println("Comisiones " + getComisiones());
    }
}
