package registrodeestudiantes;

import java.util.Scanner;

public class Registro{

    public static void main(String[] args){
        
        protected Estudiante estudiante;
        
        public Registro(Estudiante estudiante){
            this.estudiante = estudiante;
        }
        
        public void agregarEstudiante(String[] enter){
            String nombre = enter[2];
            String edad = enter[3];
            String programa = enter[4];
            String etnia = enter[5];
        }
        
        public String listarEstudiantes(){
            System.out.println("***Listado de estudiantes***");
            for (Estudiante estudiante : estudiantes){
                System.out.println(estudiante);
            }
        }
        
        public void procesarComandos(){
            Scanner sc = new Scanner(System.in);
            String[] entrada = sc.nextLine().split("&");
            switch (entrada[0]){
                case "1":
                    agregarEstudiante(entrada);
                case "2":
                    listarEstudiante();
                case "3":
                    System.exit(0);
            }
        }
        
    }

}