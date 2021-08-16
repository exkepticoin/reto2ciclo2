package registroestudiante;

public class Posgrado extends Estudiante{
    
    String modalidad;
    
    public Posgrado(String modalidad){
        super();
        this.modalidad = modalidad;
    }

    public String toString(){
        return "tEstudiante Posgrado\n" +
               "\tNombre: " + Estudiante.nombre + "\n" +
               "\tEdad: "+Estudiante.edad+" años\n" +
               "\tPrograma: " + Estudiante.programa + "\n" +
               "\tEtnia: " + Estudiante.tipo_etnia + "\n" +
               "\tModalidad: " + modalidad;
    }
}