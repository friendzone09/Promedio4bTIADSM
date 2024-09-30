public class estudiante {
    private String matricula;
    private String nombre;
    private double evaluacion;
    private double estructuras;
    private double ingles;
    private double promedio;

    //Constructor
    public estudiante(String m, String n){
        //Construye el obrjeto e inicializa al objeto
        this.matricula = m;
        this.nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public double getEstructuras() {
        return estructuras;
    }

    public void setEstructuras(double estructuras) {
        this.estructuras = estructuras;
    }

    
    public double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(double evaluacion) {
        this.evaluacion = evaluacion;
    }

    public double getIngles() {
        return ingles;
    }

    public void setIngles(double ingles) {
        this.ingles = ingles;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matric) {
        this.matricula = matric;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio() {
        this.promedio = (this.estructuras+ this.evaluacion + this.ingles) /3 ;
    }

    @Override
    public String toString() {
        return "estudiante [matricula=" + matricula + ", nombre=" + nombre + ", promedio=" + promedio + "]";
    }

    
}

