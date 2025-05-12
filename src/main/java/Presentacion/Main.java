package Presentacion;

import java.util.Scanner;

import Negocio.Fruta;
import Negocio.FrutaCitrica;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        sc.nextLine();

        do{
            imprimirmenu();
            System.out.println("\nSeleccione una opcion");
            opcion=sc.nextInt();

            switch (opcion){
                case 1:{
                    System.out.println("Ingrese el nombre:");
                    String nombre=sc.nextLine();
                    System.out.println("Ingrese el peso:");
                    double peso=sc.nextDouble();
                    System.out.println("Ingrese las caloriasxgramo:");
                    double caloriasxgramo=sc.nextDouble();

                    








                }
            }

        }

    }

    public void imprimirmenu(){

    }
    public void datosFruta() {
        System.out.println("Ingrese el tipo de fruta:");
        String tipo=sc.nextLine().toLowerCase();
        if(tipo.equals("citrica")){
            System.out.println("ingrese el ph");
            double ph=sc.nextdouble;
            sc.nextline;
            double ph = sc.nextDouble();
            sc.nextLine();



        }
    }




}


