package Presentacion;

import java.util.Scanner;

import Negocio.Fruta;
import Negocio.FrutaCitrica;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Fruta frutaNormal=null;
        Fruta frutaCitrica=null;
        sc.nextLine();

        do{
            System.out.println("Seleccione una opcion");
            System.out.println("1.Seleccionar el tipo de fruta e ingresar sus datos. ");
            System.out.println("2. Calcular el total de calorías aportadas");
            System.out.println("3. Modificar los datos de las frutas");
            System.out.print("4.Mostrar la información de las frutas ");
            System.out.print("Salir");

            opcion=sc.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("¿Qué tipo de fruta es?");
                    System.out.println("1. Cítrica");
                    System.out.println("2. Normal");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el peso: ");
                    double peso = sc.nextDouble();
                    System.out.print("Ingrese las caloríasxgramo: ");
                    double caloriasxgramo = sc.nextDouble();

                    if (tipo == 1) {
                        System.out.print("Ingrese el ph: ");
                        double ph = sc.nextDouble();
                        frutaCitrica = new FrutaCitrica(nombre, peso, caloriasxgramo, ph);
                        frutaNormal = null;
                    } else if (tipo == 2) {
                        frutaNormal = new Fruta(nombre, peso, caloriasxgramo);
                        frutaCitrica = null;
                    } else {
                        System.out.println("Tipo de fruta no válido.");
                    }
                    break;
                }

                case 2: {
                    if (frutaNormal != null) {
                        double calorias = frutaNormal.calcCaloriasTotal();
                        System.out.println("Calorías totales: " + calorias);
                    } else if (frutaCitrica != null) {
                        double calorias = frutaCitrica.calcCaloriasTotal();
                        System.out.println("Calorías totales: " + calorias);
                    } else {
                        System.out.println("Primero debes ingresar una fruta.");
                    }
                    break;
                }

                case 3: {
                    if (frutaNormal != null) {
                        System.out.print("Nuevo nombre: ");
                        frutaNormal.setNombre(sc.nextLine());
                        System.out.print("Nuevo peso: ");
                        frutaNormal.setPeso(sc.nextDouble());
                        System.out.print("Nuevas calorías por gramo: ");
                        frutaNormal.setCaloriasPorGramo(sc.nextDouble());
                        sc.nextLine();
                    } else if (frutaCitrica != null) {
                        System.out.print("Nuevo nombre: ");
                        frutaCitrica.setNombre(sc.nextLine());
                        System.out.print("Nuevo peso: ");
                        frutaCitrica.setPeso(sc.nextDouble());
                        System.out.print("Nuevas calorías por gramo: ");
                        frutaCitrica.setCaloriasPorGramo(sc.nextDouble());
                        System.out.print("Nuevo pH: ");
                        double nuevoPh = sc.nextDouble();
                        frutaCitrica.setPh("nuevoph");//no se porque el set no funciona...
                        sc.nextLine();
                    } else {
                        System.out.println("No hay fruta para modificar.");
                    }
                    break;
                }

                case 4: {
                    if (frutaNormal != null) {
                        System.out.println(frutaNormal);
                    } else if (frutaCitrica != null) {
                        System.out.println(frutaCitrica);
                    } else {
                        System.out.println("No hay fruta registrada.");
                    }
                    break;
                }

                case 5:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}



















