package problema;

public class Main {
    public static void main(String[] args) {

        //Objetos
        Profesor primerProfesor = new Profesor(100, "Jhon", "Doe");
        Estudiante primerEstudiante= new Estudiante(43160763, "Luca", "Invernizzi", "Analista");

        primerEstudiante.getMateriasAprobadas().add("POO");
        primerEstudiante.getMateriasAprobadas().add("Avanzada");
        primerEstudiante.getMateriasAprobadas().add("Sistemas");

        primerEstudiante.getMateriasInscriptas().add("Empresarial");
        primerEstudiante.getMateriasInscriptas().add("Matematica");

        System.out.println(primerEstudiante);
        System.out.println(primerProfesor);

        primerEstudiante.imprimirMateriasAprobadas();
        primerEstudiante.imprimirMateriasInscriptas();

    }
}
