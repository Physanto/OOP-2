package GestionDispositivos.Vista;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static private Scanner stdin = new Scanner(System.in);

    public Main(){
    }

    public static void main(String[] args){

    }

    public static void mostrarMenuOpciones(){
        System.out.println("--------------------Gestion de Dispositivos Electronicos-------------------\n\n");
        System.out.println("1._ Agregar Dispositivo");
        System.out.println("2._ Eliminar Dispositivo");
        System.out.println("3._ Listar Dispositivos");
        System.out.println("4._ Encender Dispositivo");
        System.out.println("5._ Apagar Dispositivo");
        System.out.println("6._ Salir\n");
    }

    public static void menuPrincipal(){

        byte opcion;
        do{
            mostrarMenuOpciones();
            System.out.print("Ingresa una opcion (1-6): ");
            opcion = stdin.nextByte();

            switch(opcion){
                
                case 1:
                    agregarDispositivo();
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Opcion incorrecta, recuerda (1-6)");
            }
        }
        while(opcion != 6);
    }

    public static void agregarDispositivo(){

    }
}
