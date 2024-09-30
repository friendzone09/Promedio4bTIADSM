import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class promedio {
  /* promedio que calcula el promedio de un grupo
   * El tamaño de grupp ed N*/  
   //Las calificaciones se leen y se almacenan en un arreglo de tamaño N/
    
    public static void main(String[] args) throws IOException{
        int N;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double[] calificaciones;
            double suma = 0;
            double promedio;
            
        System.out.println("Programa que calgula promedio de grupo");  
        System.out.println("Escribe tamaño del grupo: ");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);
        
        //contruimos el arreglo de calificaciones
        
        calificaciones = new double[N];
        //leer las calificaciones de cada alumno
            for (int i =0; i<calificaciones.length; i++){
                System.out.println("Escribe la calificación del alumno: " + (i+1) + ": ");
                entrada = bufer.readLine();
                calificaciones[i] = Double.parseDouble(entrada);
                suma += calificaciones[i];
            }
        promedio = suma / N;
        System.out.println("Las calificaciones del grupp son: ");
        for(int i = 0; i< calificaciones.length;i++){
            System.out.println(calificaciones[i]);
        }
        System.out.println("El promedio del grupo es: " + promedio);
    }
    
}