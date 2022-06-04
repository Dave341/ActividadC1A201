package com.UPChiapas.Examen.models;

public class Cliente {
    private static Pizza [] listaPizza = new Pizza[4];
     static String nombre;

     public Cliente(String nombre){
         this.nombre=nombre;
     }

    public boolean addPizza(Pizza pizza){
        byte indice = 0;
        boolean status = false;
        while (indice < listaPizza.length &&
                listaPizza[indice] != null)
            indice++;
        if (indice < listaPizza.length) {
            listaPizza[indice] = pizza;
            status = true;
        }
        return status;
    }

     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
