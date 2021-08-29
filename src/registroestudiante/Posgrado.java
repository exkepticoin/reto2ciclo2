package registroestudiante;

//Creo la clase Posgrado.
public class Posgrado extends Estudiante{
    
    //Declaro la variable modalidad.
    private String modalidad;

    //Creo el método constructor.
    public Posgrado(String modalidad, String nombre, String edad, String programa, String tipo_etnia) {
        super(nombre, edad, programa, tipo_etnia);
        this.modalidad = modalidad;
    }
    
    //Sobre escribo el método toString para ajustarlo al formato pedido, aprovechando el toString de la clase padre Estudiante.
    @Override
    public String toString() {
        return "\tEstudiante Posgrado\n" +
               super.toString() + "\n{" +
               "\tModalidad: " + modalidad + "\n";
    }
}