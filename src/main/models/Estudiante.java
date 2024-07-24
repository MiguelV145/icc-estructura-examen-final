package main.models;

public class Estudiante {

    private String nombre;
    private int calificaciones;

    //Consructor 
    public Estudiante(String nombre, int calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }
    
    //setters y getters
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCalificaciones() {
        return calificaciones;
    }
    
    public void setCalificaciones(int calificaciones) {
        this.calificaciones = calificaciones;
    }

    
    //ToString
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", calificaciones=" + calificaciones + "]";
    }
    
    
    
    
    


    


    
}
