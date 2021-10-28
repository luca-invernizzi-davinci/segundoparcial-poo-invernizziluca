package problema;

public class Vector3D {

    //Atributos
    Punto3D puntoInicial;
    Punto3D puntoFinal;

    //Metodos constructores
    public Vector3D(Punto3D puntoInicial, Punto3D puntoFinal) {
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
    }

    public Vector3D(Punto3D puntoFinal) {
        this.puntoFinal = puntoFinal;
        this.puntoInicial = new Punto3D(0,0,0);
    }

    //Metodos
    public double magnitudVector() {
        return Math.sqrt(Math.pow(puntoFinal.x-puntoInicial.x,2) + Math.pow(puntoFinal.y-puntoInicial.y,2) + Math.pow(puntoFinal.z-puntoInicial.z,2));
    }

    public void mostrarComponentes() {
        System.out.println("Componente 1: " + (puntoFinal.x - puntoInicial.x));
        System.out.println("Componente 2: " + (puntoFinal.y - puntoInicial.y));
        System.out.println("Componente 3: " + (puntoFinal.z - puntoInicial.z));
    }

    @Override
    public String toString() {
        return "El vector comienza en el punto " + puntoInicial + " y termina en el punto " + puntoFinal + ".";
    }
}
