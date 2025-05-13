package Presentacion;

import java.util.Scanner;

import Negocio.Fruta;
import Negocio.FrutaCitrica;
import Negocio.Recursos;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Recursos r = new Recursos();
        r.cargarFrutas();

        int[] indiceReciente = new int[2];

        // Si es 1 indica que pertence a la lista de frutas, 2 en caso de ser la lista de frutas citricas
        indiceReciente[0] = 1;

        // Es el indice del ultimo elemento de la lista
        indiceReciente[1] = r.getFrutas().size() - 1;

        int opcion;
        Fruta fruta = new Fruta();
        FrutaCitrica frutaCitrica = new FrutaCitrica();

        do {
            imprimirMenu();

            System.out.println("Seleccione una opcion: ");
            opcion = getAnInt(sc);

            switch (opcion) {
                case 1: {
                    System.out.println("¿Qué tipo de fruta es?");
                    System.out.println("1. Cítrica");
                    System.out.println("2. Normal");

                    int tipo = getAnInt(sc);

                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc.next();
                    System.out.print("Ingrese el peso: ");
                    double peso = getADouble(sc);
                    System.out.print("Ingrese las calorías por gramo: ");
                    double calPorGramo = getADouble(sc);


                    if (tipo == 1) { // Si es una fruta citrica.
                        System.out.print("Ingrese el ph: ");
                        double ph = getADouble(sc);
                        frutaCitrica = new FrutaCitrica(nombre, peso, calPorGramo, ph);
                        if (r.agregarFrutaCitrica(frutaCitrica)) {
                            System.out.println("Fruta Citrica agregada correctamente!");
                            indiceReciente[0] = 2;
                            indiceReciente[1] = r.getFrutasCitric().size() - 1;
                        } else {
                            System.out.println("Esta fruta citrica ya existe!");
                        }

                    } else if (tipo == 2) { // Si es una fruta normal o ordinaria.
                        fruta = new Fruta(nombre, peso, calPorGramo);
                        if (r.agregarFruta(fruta)) {
                            System.out.println("Fruta agregada correctamente!");
                            indiceReciente[0] = 1;
                            indiceReciente[1] = r.getFrutas().size() - 1;
                        } else {
                            System.out.println("Esta fruta ya existe!");
                        }
                    } else {
                        System.out.println("Tipo de fruta no válido.");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Se ha seleccionado la ultima fruta o fruta citrica que ingresaste");
                    System.out.println("1. Continuar\n 0. Salir");

                    if (getAnInt(sc) == 1) {
                        Fruta ultimaFruta;
                        switch (indiceReciente[0]) {
                            case 1: {
                                ultimaFruta = r.getFrutas().get(indiceReciente[1]);
                                System.out.println("Las calorias totales de la fruta " + ultimaFruta.getNombre() +
                                        " Son " + ultimaFruta.calcCaloriasTotal() + " cal");
                            }
                            break;
                            case 2: {
                                ultimaFruta = r.getFrutasCitric().get(indiceReciente[1]);
                                System.out.println("Las calorias totales de la fruta " + ultimaFruta.getNombre() +
                                        " Son " + ultimaFruta.calcCaloriasTotal() + " cal");
                            }
                            break;
                            default: {
                                System.out.println("ERROR - NO SE PUDO RECUPERAR LA ULTIMA FRUTA");
                            }
                            break;
                        }

                    } else {
                        System.out.println("Saliendo...");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Selecciona el tipo de fruta que quieres modificar: ");
                    System.out.println("1. Fruta Ordinaria");
                    System.out.println("2. Fruta Citrica");
                    int tipo = getAnInt(sc);
                    System.out.println("Selecciona el indicador (indice) de la fruta: ");
                    int indice = getAnInt(sc);



                    if (tipo == 1 && indice < r.getFrutas().size()) {
                        System.out.print("Nuevo nombre: ");
                        r.getFrutas().get(indice).setNombre(sc.next());
                        System.out.print("Nuevo peso: ");
                        r.getFrutas().get(indice).setPeso(getADouble(sc));
                        System.out.print("Nuevas calorías por gramo: ");
                        r.getFrutas().get(indice).setCaloriasPorGramo(getADouble(sc));

                    }else if (tipo == 2 && indice < r.getFrutasCitric().size()) {
                        System.out.print("Nuevo nombre: ");
                        r.getFrutasCitric().get(indice).setNombre(sc.next());
                        System.out.print("Nuevo peso: ");
                        r.getFrutasCitric().get(indice).setPeso(getADouble(sc));
                        System.out.print("Nuevas calorías por gramo: ");
                        r.getFrutasCitric().get(indice).setCaloriasPorGramo(getADouble(sc));
                        System.out.print("Nuevo pH: ");
                        r.getFrutasCitric().get(indice).setPh(getADouble(sc));

                    } else {
                        System.out.println("tipo e indice de fruta no valido, intente nuevamente!");
                    }
                    break;
                }
                case 4: {
                    System.out.println("--- LISTA DE FRUTAS ---");
                    for (Fruta frutal : r.getFrutas()) {
                        System.out.println(frutal);
                    }
                    System.out.println("--- LISTA DE FRUTAS CITRICAS---");
                    for (Fruta frutal : r.getFrutasCitric()) {
                        System.out.println(frutal);
                    }
                    break;
                }
                case 5:{
                    System.out.println("Cerrando el programa...");
                    break;}
                default:{
                    System.out.println("Opción no válida.");}
            }

        } while (opcion != 5);

        sc.close();
    }

    private static double getADouble(Scanner sc) {
        double numero;
        boolean valido = true;
        do{
            numero = sc.nextInt();
            if (numero < 0){
                System.out.println(" El numero no puede ser negativo o igual a cero");
                valido = false;
            }else valido = true;

        }while (!valido);
        return numero;
    }

    private static int getAnInt(Scanner sc) {
        int numero;
        boolean valido = true;
         do{
             numero = sc.nextInt();
             if (numero < 0){
                 System.out.println(" El numero no puede ser negativo o igual a cero");
                 valido = false;
             }else valido = true;

         }while (!valido);
         return numero;
    }

    private static void imprimirMenu() {
        System.out.println("------ MENU ------");
        System.out.println("1. Seleccionar el tipo de fruta e ingresar sus datos. ");
        System.out.println("2. Calcular el total de calorias aportadas");
        System.out.println("3. Modificar los datos de las frutas");
        System.out.println("4. Mostrar la información de las frutas ");
        System.out.println("5. Salir");
        System.out.println("------ MENU ------");
    }
}



















