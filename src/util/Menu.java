package util;

import entity.Electrodomestico;
import entity.Nevera;
import entity.Tv;
import entity.valueObject.Consumo;
import entity.valueObject.Procedencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static List<Electrodomestico> construirElectro(){

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        List<Electrodomestico> electrodomesticos = new ArrayList<>();

        System.out.println("Introduce la cantidad de \n" +
                "Electrodomésticos a procesar");

        String num_electros = myObj.nextLine();  // Read

        for (int i=0; Integer.parseInt(num_electros) > i ; i++){
            System.out.println(i);
            System.out.println("Introduce el tipo de \n" +
                    "Electrodoméstico a procesar: \n " +
                    "1. TV \n " +
                    "2. Nevera \n " +
                    "3. Otro tipo\n ");

            String tipo = myObj.nextLine();  // Read

            switch (tipo){
                case "1":
                    electrodomesticos.add(new Tv(seleccionarConsumo(), seleccionarProcedencia(),seleccionarTamaño(),siTdt()));
                    System.out.println("TV Creado");
                    break;
                case "2":
                    electrodomesticos.add(new Nevera(seleccionarConsumo(), seleccionarProcedencia(),seleccionarCapacidad()));
                    System.out.println("Nevera Creada");
                    break;
                case "3":
                    electrodomesticos.add(new Electrodomestico(seleccionarConsumo(), seleccionarProcedencia()));
                    System.out.println("Electrodoméstico Creado");
                    break;
                default:
                    System.out.println("Opcion Errada \n" +
                            "Ingresa un numero correcto");
                    i--;
                    break;

            }

        }

        return electrodomesticos;
    }

    public static double seleccionarCapacidad(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese la capacidad de la nevera");

        return Double.parseDouble(myObj.nextLine());

    }

    public static boolean siTdt(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Introduce si tiene TDT \n " +
                "1. true\n " +
                "Other false");

        String isTdt = myObj.nextLine();

        return isTdt.equals("1");

    }

    public static double seleccionarTamaño(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese el tamaño en Pulgadas del TV");

        return Double.parseDouble(myObj.nextLine());

    }

    public static Procedencia seleccionarProcedencia(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Introduce la Procedencia\n " +
                "1. Internacional \n Otro por defecto");

        String procedencia = myObj.nextLine();

        return getProcedencia(procedencia);

    }

    public static Procedencia getProcedencia(String procedencia){
        if ("1".equals(procedencia)) {
            System.out.println("Internacional");
            return Procedencia.INTERNACIONAL;
        }
        System.out.println("Nacional por defecto");
        return Procedencia.NACIONAL;
    }

    public static Consumo seleccionarConsumo(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Introduce el tipo de consumo\n " +
                "A\n B\n C");

        String consumo = myObj.nextLine();

        return getConsumo(consumo);

    }

    public static Consumo getConsumo(String consumo){
        switch (consumo){
            case "A":
                System.out.println("A");
                return Consumo.A;
            case "B":
                System.out.println("B");
                return Consumo.B;
            case "C":
                System.out.println("C");
                return Consumo.C;
            default:
                System.out.println("Opcion Errada \n" +
                        "C por defecto");
                return Consumo.C;

        }
    }
}
