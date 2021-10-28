package problema;

public class Punto3D {

    //Atributos
    double x;
    double y;
    double z;

    //Metodos constructores
    public Punto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Punto3D(double w) {
        this.x = w;
        this.y = w;
        this.z = w;
    }

    public Punto3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    //Metodos
    public double distanciaDesdeElOrigen() {
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
    }

    public double distanciaDesdeOtroPunto(double x, double y, double z) {
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2)+Math.pow(this.z-z,2));
    }

    public double distanciaDesdeOtroPunto(Punto3D otroPunto3D) {
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2)+Math.pow(this.z-z,2));
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
