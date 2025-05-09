package Negocio;

public class Fruta {

    // Atributos
    protected String nombre;
    protected double peso; // en gramos
    protected double caloriasPorGramo;

    // Constructores

    public Fruta(String nombre, double peso, double caloriasPorGramo) {
        this.nombre = nombre;
        this.peso = peso;
        this.caloriasPorGramo = caloriasPorGramo;
    }

    public Fruta() {
        nombre = "";
        peso = 0.0;
        caloriasPorGramo = 0.0;
    }

    // Metodos setter y getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCaloriasPorGramo() {
        return caloriasPorGramo;
    }

    public void setCaloriasPorGramo(double caloriasPorGramo) {
        this.caloriasPorGramo = caloriasPorGramo;
    }

    // Metodos propios

    public double calcCaloriasTotal() {
        return caloriasPorGramo * peso;
    }

    @Override
    public String toString() {
        return "---- Fruta: " + nombre + " ----"+
                "\npeso: "+peso+
                "\nCalorias por gramo: "+caloriasPorGramo;
    }
}
