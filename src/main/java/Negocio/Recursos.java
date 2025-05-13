package Negocio;

import java.util.LinkedList;

public class Recursos {

    // Atributos

    private LinkedList<Fruta> frutas;
    private LinkedList<FrutaCitrica> frutasCitric;

    // Constructor

    public Recursos() {
        this.frutas = new LinkedList<>();
        this.frutasCitric = new LinkedList<>();
    }

    // Metodos getter y setter

    public LinkedList<Fruta> getFrutas() {
        return frutas;
    }

    public void setFrutas(LinkedList<Fruta> frutas) {
        this.frutas = frutas;
    }

    public LinkedList<FrutaCitrica> getFrutasCitric() {
        return frutasCitric;
    }

    public void setFrutasCitric(LinkedList<FrutaCitrica> frutasCitric) {
        this.frutasCitric = frutasCitric;
    }

    // Metodos propios

    public void cargarFrutas() {

        //Lista de frutas ordinarias

        frutas.add(new Fruta("Cerezas", 100, 50));
        frutas.add(new Fruta("Ciruelas", 50, 30));
        frutas.add(new Fruta("Melocotón", 50, 49));
        frutas.add(new Fruta("Fresas", 100, 35));
        frutas.add(new Fruta("Frambuesa", 150, 75));
        frutas.add(new Fruta("Higos", 50, 22));
        frutas.add(new Fruta("Kiwi", 50, 51));
        frutas.add(new Fruta("Mandarina", 50, 44));
        frutas.add(new Fruta("Mango", 50, 56));
        frutas.add(new Fruta("Manzana", 50, 53));
        frutas.add(new Fruta("Melon", 200, 80));
        frutas.add(new Fruta("Moras", 100, 59));
        frutas.add(new Fruta("Naranja", 50, 38));
        frutas.add(new Fruta("Nisperos", 100, 45));
        frutas.add(new Fruta("Pera", 50, 58));
        frutas.add(new Fruta("Platano", 50, 108));
        frutas.add(new Fruta("Sandia", 200, 47));
        frutas.add(new Fruta("Uva", 100, 67));

        //Lista de frutas citricas

        frutasCitric.add(new FrutaCitrica("Limones", 50, 65, 2.3));
        frutasCitric.add(new FrutaCitrica("Toronja", 50, 73, 3.3));
        frutasCitric.add(new FrutaCitrica("Naranja", 50, 70, 3.8));

    }

    public boolean agregarFruta(Fruta fruta) {
        for (Fruta frutal : frutas) {
            if (fruta.getNombre().equals(frutal.getNombre())) {
                return false;
            }
        }
        return frutas.add(fruta);
    }

    public boolean agregarFrutaCitrica(FrutaCitrica fruta) {
        for (Fruta frutal : frutasCitric) {
            if (fruta.getNombre().equals(frutal.getNombre())) {
                return false;
            }
        }
        return frutasCitric.add(fruta);
    }
}
