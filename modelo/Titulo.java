package modelo;

public class Titulo {
    private String  nombre;
    private int fechaDeLanzamiento;
    private double  evaluacion;
    private boolean incluidoEnElPlanBasico;
    private String  sinopsis;
    private int tiempoDeDuracionEnMinutos;

    public String   getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int   getfechaDeLanzamiento(){
        return fechaDeLanzamiento;
    }

    public void setfechaDeLanzamiento(int   fechaDeLanzamiento){
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public double   getevaluacion(){
        return evaluacion;
    }

    public boolean  getincluidoEnElPlanBasico(){
        return incluidoEnElPlanBasico;
    }

    public void setincluidoEnElPlanBasico(boolean    incluidoEnElPlanBasico){
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public String   getsinopsis(){
        return sinopsis;
    }

    public void setsinopsis(String sinopsis){
        this.sinopsis = sinopsis;
    }

    public int   gettiempoDeDuracionEnMinutos(){
        return tiempoDeDuracionEnMinutos;
    }

    public void settiempoDeDuracionEnMinutos(int   tiempoDeDuracionEnMinutos){
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    public void muestraFichaTecnica(){
        System.out.println("------------------------------");
        System.out.println("****FICHA TECNICA****");
        System.out.println("Nombre del Titulo : " + nombre);
        System.out.println("Fecha de Lanzamiento : "+ fechaDeLanzamiento);
        System.out.println("Tiempo de Duracion : " + gettiempoDeDuracionEnMinutos() + " minutos");

    }
}
