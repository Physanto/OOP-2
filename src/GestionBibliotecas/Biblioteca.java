package GestionBibliotecas;

import java.util.Scanner;

public class Biblioteca {

    Scanner stdin;
    private Inventario inventario;

    public Biblioteca(){
        this.stdin = new Scanner(System.in);
        this.inventario = new Inventario();
    }

    public void almacenarLibro(Libro libro){
        inventario.almacenarLibros(libro);
    }

    public void buscarLibro(String dato, char option){

        switch(option){

            case '1': 
                inventario.buscarPorTitulo(new BuscarPorCriterio.BuscarPorTitulo(), dato);
                break;

            case '2':
                break;

            case '3':
                break;

            case '4':
                break;

            case '5':
                break;

            default:

                break;
        }
    }
    
    public void librosDisponibles(){
        inventario.librosDisponibles();
    }
}
