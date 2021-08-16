package registrodeestudiantes;

public class Estudiante {

    protected Registro[] registro;
    public String nombre;
    public String edad;
    public String programa;
    public String tipo_etnia;

    public Estudiante(String nombre, String edad, String programa, String tipo_etnia) {
        this.nombre = nombre;
        this.edad = edad;
        this.programa = programa;
        this.tipo_etnia = tipo_etnia;
    }

    @Override
    public String toString(){
        return "\tNombre: " + nombre + "\n" +
               "\tEdad: "+ edad +" años\n" +
               "\tPrograma: " + programa + "\n" +
               "\tEtnia: " + tipo_etnia + "\n";
    }
    
}
