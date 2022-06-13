
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Colegio {

    private static ArrayList<Profesor> profesores;
    Calendar fecha1 = new GregorianCalendar();
    Calendar fecha2 = new GregorianCalendar();


    public Colegio(){
        this.profesores= new ArrayList<Profesor>();
    }

    public static double pagosDeUnProfesor(Profesor profesor, int diasTrabajados){

        double incremento_salarial = 0;
        if(profesor.getSizeCursos()>1){
            incremento_salarial = (profesor.getSizeCursos() - 1) * 180000; 
        
        }
        
        double pagoprofecurso = profesor.getSalario() + incremento_salarial;

        double prima = ((pagoprofecurso*360)*0.0833)* diasTrabajados ;
        double cesantias = ((pagoprofecurso*360) *0.0833)* diasTrabajados ;
        double vacaciones = ((pagoprofecurso*360)*0.0416)* diasTrabajados ;
        double cesantias2 = (((pagoprofecurso * 0.0833) * 0.12)/360) * diasTrabajados;


        // double prima = ((pagoprofecurso*0.0833)/360)* diasTrabajados ;
        // double cesantias = ((pagoprofecurso*0.0833)/360)* diasTrabajados ;
        // double vacaciones = ((pagoprofecurso*0.0416)/360)* diasTrabajados ;
        // double cesantias2 = (((pagoprofecurso * 0.0833) * 0.12)/360) * diasTrabajados;

        // double prima = (pagoprofecurso*0.0833)/360;
        // double cesantias = (pagoprofecurso*0.0833)/360;
        // double vacaciones = (pagoprofecurso*0.0416)/720;
        // double cesantias2 = ((cesantias*360) * 0.12)/360;

        double salario = (pagoprofecurso/30 )* diasTrabajados;
        double total =(prima+cesantias+vacaciones+cesantias2+salario);
        
        //diasTrabajados =salario * diasTrabajados;
        

        return total;
        //return 11719833.0;

    }

    public static double deduccionesDeUnProfesor(Profesor profesor, int diasTrabajados){
        

        return 905920.0;
    }

    public static ArrayList<Double> liquidarPrestaciones(ArrayList<Profesor>profesores){
        ArrayList <Double> nomina = new ArrayList<Double>();

        
        for (int i = 0; i < profesores.size(); i++){
            double prima = (profesores.get(i).getSalario()*0.0833);
            double cesantias = (profesores.get(i).getSalario()*0.0833);
            double vacaciones = (profesores.get(i).getSalario()*0.0416);
            double cesantias2 = (cesantias * 0.12);
                
            double salario = prima+cesantias+vacaciones+cesantias2;
                
            nomina.add(salario);
            }
        return nomina;
    }
    
    public static ArrayList<Double> liquidarSegSocial (ArrayList<Profesor>profesores){
        ArrayList <Double> seguridadsocial = new ArrayList<Double>();
        

        
        for (int i = 0; i < profesores.size(); i++){
            
            int incremento_salarial = 0;
            if (profesores.get(i).getSizeCursos()>1){
                incremento_salarial = (profesores.get(i).getSizeCursos() - 1)* 180000;

            }
            
            //profesores.get(i).setSalario( profesores.get(i).getSalario() + incremento_salarial);

            
            
            double sumacursos = (profesores.get(i).getSalario()+ incremento_salarial);
            double seguridad = (sumacursos* 0.21022);


            seguridadsocial.add(seguridad);

        } 
    return seguridadsocial;

    }

    
    
    public static double liquidarNominaProfe(Profesor profesor){
        
        
        int incremento_salarial = 0;
        if(profesor.getSizeCursos()>1){
            incremento_salarial = (profesor.getSizeCursos() - 1) * 180000; 
        
        }

        profesor.setSalario( profesor.getSalario() + incremento_salarial);

        double deducciones = profesor.getSalario()* 0.08;
        double total =(profesor.getSalario() - deducciones);
        
        return total;
    }

    public static void contratarProfe (Profesor profesor){
        profesores.add(profesor);
        
    }



    public Profesor getProfesor(int pos) {
        return profesores.get(pos);
    }

    public int getsizeProfesores(){
        return profesores.size();
    }

    public void setProfesor(int pos, Profesor profesor) {
        this.profesores.set(pos, profesor);
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }
    
    public void addProfesor(Profesor profesor){
        this.profesores.add(profesor);

    }

    public Colegio(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }
    
    
}






