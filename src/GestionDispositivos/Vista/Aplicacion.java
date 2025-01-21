package GestionDispositivos.Vista;


import java.util.ArrayList;

import GestionDispositivos.Modelo.BuzonMensajes;
import GestionDispositivos.Utilidades.Mensajes;

public class Aplicacion {

    public Aplicacion(){
    } 

    public void mostrarMenuOpciones(){
        System.out.println("--------------------Gestion de Dispositivos Electronicos-------------------\n\n");
        System.out.println("1._ Agregar Dispositivo");
        System.out.println("2._ Eliminar Dispositivo");
        System.out.println("3._ Listar Dispositivos");
        System.out.println("4._ Encender Dispositivo");
        System.out.println("5._ Apagar Dispositivo");
        System.out.println("6._ Salir\n");
    }  
}
