package com.UPChiapas.Examen.models;

import java.util.Scanner;


public class Tienda {
    private static int opcion=0;
    private static Scanner entrada=new Scanner(System.in);

    public static void Menu(){
        do{
            switch (opcion){
                case 1:
                    agregarPedido();
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Adios, gracias por usar el programa");
                    break;
            }

        }while(opcion!=3);
    }

    public static void agregarPedido() {
        String nombre, tipoPizza;
        System.out.println("Ingre el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.println("Menu");
        System.out.println("Pizza Peperoni");
        System.out.println("Pizza Hawaiana");
        System.out.println("Pizza Europea");
        System.out.println("Pizza Mexicana");
        System.out.println("Elija el tipo de pizza");
        tipoPizza = entrada.next();
    }
}
