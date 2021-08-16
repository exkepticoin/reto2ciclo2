package registroestudiante;

public class Pregrado extends Estudiante{
    
    String cantidad_creditos;
    
    public Pregrado(String nombre, String edad, String programa, String tipo_etnia, String cantidad_creditos){
        super(nombre, edad, programa, tipo_etnia, cantidad_creditos);
        this.cantidad_creditos = cantidad_creditos;
    }

    public String toString(){
        return "tEstudiante Pregrado\n" +
               "\tNombre: " + Estudiante.nombre + "\n" +
               "\tEdad: "+Estudiante.edad+" años\n" +
               "\tPrograma: " + Estudiante.programa + "\n" +
               "\tEtnia: " + Estudiante.tipo_etnia + "\n" +
               "tCréditos aprobados: " + cantidad_creditos;
    }
}