package com.UPChiapas.Examen.models;

public class Pizza {
    private String tipopizza;
    private String tamaño;
    private float precio;
    private byte numero;
    private byte numeroPizza;
    private static CatalogoPizza []listaPizza;

    public Pizza(String tipopizza, String tamaño, float precio) {
        this.tipopizza = tipopizza;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String getTipopizza() {
        return tipopizza;
    }

    public void setTipopizza(String tipopizza) {
        this.tipopizza = tipopizza;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTamaño() {
        return tamaño;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tipopizza='" + tipopizza + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", precio=" + precio +
                ", numero=" + numero +
                ", numeroPizza=" + numeroPizza +
                '}';
    }
}
