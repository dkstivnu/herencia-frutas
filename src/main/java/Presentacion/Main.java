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
            imprimirmenu();
            System.out.println("Seleccione una opcion");
            System.out.println("1.Seleccionar el tipo de fruta e ingresar sus datos. ");
            System.out.println("2. Calcular el total de calorías aportadas");
            System.out.println("3. Modificar los datos de las frutas");
            System.out.print("4.Mostrar la información de las frutas ");

            opcion=sc.nextInt();

            switch (opcion){
                case 1:{
                    System.out.println("¿que tipo de fruta es?");
                    System.out.println("1.Citrica?");
                    System.out.println("2.Normal");
                    int tipo=sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el nombre:");
                    String nombre=sc.nextLine();
                    System.out.println("Ingrese el peso:");
                    double peso=sc.nextDouble();
                    System.out.println("Ingrese las caloriasxgramo:");
                    double caloriasxgramo=sc.nextDouble();

                    if(tipo==1){
                        frutaNormal = new Fruta(nombre, peso, caloriasxgramo);
                    } else if (tipo==2) {
                        System.out.println("Ingrese el ph:");
                        double ph=sc.nextDouble();
                        frutaCitrica=new FrutaCitrica(nombre,peso,caloriasxgramo,ph);
                    }else{
                        System.out.println("no es valido");
                    }
                    break;
                    case 2:{
                        if (frutaNormal != null) {
                            double caloriasTotales= frutaNormal.calcCaloriasTotal();
                            if (caloriasTotales < 0) {
                                System.out.println("Las calorías calculadas son negativas");
                            } else {
                                System.out.println("Calorías totales: " + caloriasTotales);
                            }
                        } else {
                            System.out.println("Primero debes ingresar una fruta.");
                        } else if (frutaCitrica != null) {
                            double calorias = frutaCitrica.calcCaloriasTotal();
                            if (calorias >= 0) {
                                System.out.println("Calorías totales: " + calorias);
                            } else {
                                System.out.println("Invalido");
                            }
                        } else {
                            System.out.println("Primero debes ingresar una fruta.");
                        }
                        break;
                        case 3:{
                            if (frutaNormal != null) {
                                System.out.println("Nuevo nombre:");
                                frutaNormal.setNombre(sc.nextLine());
                                System.out.print("Nuevo peso: ");
                                frutaNormal.setPeso(sc.nextDouble());
                                System.out.print("Nuevas calorías por gramo: ");
                                frutaNormal.setCaloriasPorGramo(sc.nextDouble());
                            } else if (frutaCitrica != null) {
                                System.out.print("Nuevo nombre: ");
                                frutaCitrica.setNombre(sc.nextLine());
                                System.out.print("Nuevo peso: ");
                                frutaCitrica.setPeso(sc.nextDouble());
                                System.out.print("Nuevas caloríasxgramo: ");
                                frutaCitrica.setCaloriasPorGramo(sc.nextDouble());
                                System.out.print("Nuevo ph: ");
                                //quiero llamar a ph..pero sale error con el setPh
                            } else {
                                System.out.println("No hay fruta para modificar.");
                            }
                            break;
                            case 4:{
                                if (frutaNormal != null) {
                                    System.out.println(frutaNormal.toString());
                                } else if (frutaCitrica != null) {
                                    System.out.println(frutaCitrica.toString());
                                } else {
                                    System.out.println("No hay fruta registrada.");
                                }
                                break;
                            }

                            }

                        }


                    }




                }
            }

        }

    }

    public void imprimirmenu(){

    }
    }




}


