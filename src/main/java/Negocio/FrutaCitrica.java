package Negocio;

public class FrutaCitrica extends Fruta {

    // Atributo

    private double ph;

    // Constructor

    public FrutaCitrica(String nombre, double peso, double caloriasPorGramo, double ph) {
        super(nombre, peso, caloriasPorGramo);
        this.ph = ph;
    }

    public FrutaCitrica() {
        super();
        this.ph = 7;
    }

    public double getPh() {
        return ph;
    }

    public void setPh(double ph) {
        this.ph = ph;
    }

    //Metodos propios

    @Override
    public double calcCaloriasTotal() {
        return super.calcCaloriasTotal() - (7 - ph) * getCaloriasPorGramo();
    }


    @Override
    public String toString() {
        return "---- Fruta: " + getNombre() + " ----" +
                "Tipo: Citrica" +
                "\npeso: " + getPeso() +
                "\nCalorias por gramo: " + getCaloriasPorGramo() +
                "\nPh: " + ph;
    }
}
