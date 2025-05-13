import Negocio.Recursos;

public class Test {
    public static void main(String[] args) {
        Recursos r = new Recursos();
        r.cargarFrutas();

        int[] indiceReciente = new int[2];
        indiceReciente[0] = 1;
        indiceReciente[1] = r.getFrutas().size();

        System.out.println(indiceReciente[1]);
    }
}
