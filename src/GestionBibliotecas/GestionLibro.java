package GestionBibliotecas;

import GestionBibliotecas.Interfaces.ValidadorDatos;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionLibro implements ValidadorDatos{

    Scanner stdin = new Scanner(System.in);
    ArrayList<Libro> listaLibros = new ArrayList<>();

    @Override
    public boolean validarDatos(String entrada){
        return !entrada.isEmpty();
    }

    public String SolicitarDatos(Scanner stdin, String mensaje){

        String entrada;
        do{
            System.out.print(mensaje + ": ");
            entrada = stdin.nextLine();

            if(validarDatos(entrada)){
                return entrada;
            }
            System.out.println("Dato incorrecto, Intentalo de nuevo.");
        }
        while(true);
    }

    public void pedirInfoLibro(){

        String ISBN;
        String nombre;
        String autor;
        String anno;
        short numCopias;
        do{
            System.out.print("Ingresa el ISBN del libro: ");
            ISBN = stdin.nextLine();

            System.out.print("Ingresa el nombre del libro: ");
            nombre = stdin.nextLine();

            System.out.print("Ingresa el autor del libro: ");
            autor = stdin.nextLine();

            System.out.print("Ingresa el anno de publicacion del libro: ");
            anno = stdin.nextLine();

            if(anno)

            System.out.print("Ingresa la cantidad de copias disponibles: ");
            numCopias = stdin.nextShort();
        }
        while(true);


        listaLibros.add(new Libro(ISBN, nombre, autor, anno,  numCopias, true));
    }

}