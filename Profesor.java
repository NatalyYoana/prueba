
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.time.*;


public class Profesor{
    private int id; 
    private String nombre;
    private ArrayList<Curso>cursos = new ArrayList<Curso>(); 
    private int salario;
    
    
    public Profesor(String nombre,int salario){
        this.nombre=nombre;
        this.salario=salario;
        this.cursos = new ArrayList<>();
        

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


    public int getSalario() {
        return salario;
    }


    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Curso getCurso(int pos) {
        return cursos.get(pos);
    }

    public int getSizeCursos(){
        return cursos.size();
    }

    public void setCurso(int pos, Curso curso) {
        cursos.set(pos, curso);
    }

    public void addCurso(Curso curso){
        this.cursos.add(curso);
    }


    public ArrayList<Curso> getCursos() {
        return cursos;
    }


    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }


}
