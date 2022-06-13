import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
        
        Profesor profe = new Profesor("Raul", 1875000);
        Curso curso = new Curso("Biologia");
        Curso curso2 = new Curso("Mates");
        Curso curso3 = new Curso("Espanol");

        profe.addCurso(curso);
        profe.addCurso(curso2);
        profe.addCurso(curso3);

        double r = Colegio.pagosDeUnProfesor(profe, 153);
        System.out.println(r);
    }
    
}