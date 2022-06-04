package com.UPChiapas.Examen.models;

public class CatalogoPizza {

    public static void catalogoPizza() {
        Pizza Peperoni = new Pizza("Peperoni", "Mediana", 150.45F);
        Pizza Hawaiana = new Pizza("Hawaillana", "mediana", 150.50F);
        Pizza Europea = new Pizza("Europea", "Grande", 186.86F);
        Pizza Mexicana = new Pizza("Mexicana", "Chica", 89.99F);
        Pizza [] listapizza={Peperoni,Hawaiana,Europea,Mexicana};
    }

}