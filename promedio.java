import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class promedio {
  /* promedio que calcula el promedio de un grupo
   * El tamaño de grupp ed N*/  
   //Las calificaciones se leen y se almacenan en un arreglo de tamaño N/

   //Arreglo de un tipo de dato abtracto(TDA)
   public static estudiante[] estudiantes;

   public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

   public static void leerEstudiantes() throws IOException{
    String matricula, nombre;

    for( int i = 0; i<estudiantes.length; i++){
        System.out.println("==============================================================================");
        System.out.println("Informacion del estudiante [" + (i+0) + "]");
        System.out.println("Matricula: ");
        entrada = bufer.readLine();
        matricula = entrada;
        System.out.println("Nombre: ");
        entrada =  bufer.readLine();
        nombre = entrada;
        estudiante e = new estudiante(matricula, nombre);

        System.out.println("Escriba  calificacion de estructuras: ");
        entrada = bufer.readLine();
        e.setEstructuras(Double.parseDouble(entrada));

        System.out.println("Escriba  calificacion de evalucaion: ");
        entrada = bufer.readLine();
        e.setEvaluacion(Double.parseDouble(entrada));

        System.out.println("Escriba  calificacion de ingles: ");
        entrada = bufer.readLine();
        e.setIngles(Double.parseDouble(entrada));
        e.setPromedio();
        estudiantes[i] = e;
    
    }
   }
    
    public static void main(String[] args) throws IOException{
        int N;
        
        

        //Arreglo de tipo de dato primitiva(double)
        double[] calificaciones;
        double suma = 0;
        double promedio;
            
        System.out.println("Programa que calgula promedio de grupo");  
        System.out.println("Escribe tamaño del grupo: ");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);

        //Construyendo el areeglo de estudiantes
        estudiantes = new estudiante[N];

        //contruimos el arreglo de calificaciones 
        calificaciones = new double[N];

        
        //leer las calificaciones de cada alumno
        //     for (int i =0; i<calificaciones.length; i++){
        //         System.out.println("Escribe la calificación del alumno: " + (i+1) + ": ");
        //         entrada = bufer.readLine();
        //         calificaciones[i] = Double.parseDouble(entrada);
        //         suma += calificaciones[i];
        //     }
        // promedio = suma / N;


        System.out.println("Las calificaciones del grupp son: ");
        for(int i = 0; i< calificaciones.length;i++){
            System.out.println(calificaciones[i]);
        }
        System.out.println("El promedio del grupo es: " + promedio);
    }
    
}