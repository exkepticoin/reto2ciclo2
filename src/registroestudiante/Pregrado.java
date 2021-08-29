package registroestudiante;

//Creo la clase Pregrado.
public class Pregrado extends Estudiante{
    
    //Declaro la variable cantidad_creditos para guardar los créditos del estudiante de pregrado.
    private String cantidad_creditos;
    
    //Creo el método constructor.
    public Pregrado(String nombre, String edad, String programa, String tipo_etnia, String cantidad_creditos) {
        super(nombre, edad, programa, tipo_etnia);
        this.cantidad_creditos = cantidad_creditos;
    }
    
    //Sobre escribo el método toString para ajustarlo al formato pedido, aprovechando el toString de la clase padre Estudiante.
    @Override
    public String toString() {
        return "\tEstudiante Pregrado\n" +
               super.toString() + "\n{" +
               "\tCreditos aprobados: " + cantidad_creditos + "\n";
    }

}