package GestionBibliotecas;

import java.util.Scanner;

public class GestionBiblioteca {

    /***
     * Esta funcion muestra el menu principal del Sistema de Gestion de Biblioteca
     *
     */
    public void MenuPrincipal(){
        Scanner stdin = new Scanner(System.in);
        char opcion;

        do{
            System.out.println("**************** MENU PRINCIPAL ***************");
            System.out.println("1._ Ver libros disponibles \n" +
                    "2._ Consultar historial de prestamos \n" +
                    "3._ Prestar libro \n" +
                    "4._ Devolver libro \n" +
                    "5._ Reservar libro \n" +
                    "6._ Ver libros reservados \n" +
                    "7._ Agregar un nuevo libro \n" +
                    "8._ Salir" +
                    "*********************************************** \n\n" +
                    "Por favor ingresar una opcion, (1-8): ");

            opcion = stdin.next().charAt(0);

            switch (opcion){

                case '1':
                    break;

                case '2':
                    break;

                case '3':
                    break;

                case '4':
                    break;

                case '5':
                    break;

                case '6':
                    break;

                case '7':
                    break;

                case '8':
                    break;

                default:
                    System.out.println("Ingresa una opcion correcta");
                    break;
            }
        }
        while (opcion != 8);
    }
}
