package com.UPChiapas.Examen.models;

public class Pedido {
    private String cliente;
    private static Cliente [] listaCliente =  new Cliente[5];

    public boolean addPersona(Cliente cliente){
        byte indice = 0;
        boolean status = false;
        while (indice < listaCliente.length &&
                listaCliente[indice] != null)
            indice++;
        if (indice < listaCliente.length) {
            listaCliente[indice] = cliente;
            status = true;
        }
        return status;
    }

    public void imprimirPedido(){
        byte indice=0;
        while (indice < listaCliente.length &&
                listaCliente[indice] != null) {
            System.out.println(listaCliente[indice]);
            indice++;
        }
        if (indice == 0)
            System.out.println("No existen registros almacenados");
    }
}
