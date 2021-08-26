package registroestudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class Registro{
    
    protected Estudiante estudiantes;

    public Registro(Estudiante estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public void agregarEstudiante(String[] enter){
        if (enter[1].equals("Pregrado")){
            Estudiante est = new Pregrado(enter[2], enter[3], enter[4], enter[5], enter[6]);
        }else {
            Estudiante est = new Posgrado(enter[2], enter[3], enter[4], enter[5], enter[6]);
        }
    }
    
    public String listarEstudiantes (){
        return "***Listado de Estudiantes***";
    }
    
    public void procesarComandos(){
            Scanner sc = new Scanner(System.in);
            String[] entrada = sc.nextLine().split("&");
            switch (entrada[0]){
                case "1":
                    agregarEstudiante(entrada);
                case "2":
                    listarEstudiantes();
                case "3":
                    System.exit(0);
            }
        }
    
    
    public static void main(String[] args){
        
        
        
    }

}