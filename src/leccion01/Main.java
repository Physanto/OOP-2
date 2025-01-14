package leccion01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        MaterialBiblioteca materialBiblioteca = new MaterialBiblioteca("cualquiera", "Jane Doe");

        Libro libro = new Libro("El senor de los anillos", "Tolkien", (short) 600);

        Revista revista = new Revista("Tips para comer", "doc jose", (short) 2020);

        ArrayList<MaterialBiblioteca> materiales = new ArrayList<>();
        materiales.add(libro);
        materiales.add(revista);

        // Mostrar detalles de todos los materiales
        for (MaterialBiblioteca material : materiales) {
            material.mostrarDetalles();
            System.out.println("----------------------------------");
        } 
    }
} 
