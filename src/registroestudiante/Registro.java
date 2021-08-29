package registroestudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class Registro{
    
    public static void main(String[] args){
        
    }
    
    protected ArrayList<Estudiante> estudiantes;
    protected Estudiante est;
    

    public Registro(Estudiante est) {
        estudiantes.add(est);
    }
    
    public void agregarEstudiante(String[] enter){
        if (enter[1].equals("Pregrado")){
            Estudiante estu = new Pregrado(enter[2], enter[3], enter[4], enter[5], enter[6]);
        }else {
            Estudiante estu = new Posgrado(enter[2], enter[3], enter[4], enter[5], enter[6]);
        }
        Estudiante est = new Registro(estu);
    }
    
    public String listarEstudiantes (){
        return "***Listado de Estudiantes***\n" +
               super.toString();
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

}