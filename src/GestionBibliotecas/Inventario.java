package GestionBibliotecas;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Libro> listaLibros;

    public Inventario(){
        this.listaLibros = new ArrayList<>();
    }

    public void almacenarLibros(Libro libro){
        listaLibros.add(libro);
    }

    public void buscarLibro(String dato){

        if(listaLibros.isEmpty()){
            System.out.println("No hay actualmente libros agregados");
            return;
        }

        byte cont = 0;
        for(Libro libro : listaLibros){

            if(libro.getTitulo().equalsIgnoreCase(dato)){
                System.out.println(libro.toString());
                cont++;
            }
        }

        if(cont == 0){ System.out.println("No hay actualmente libros agregados"); }
    }

    public void librosDisponibles(){

        if(listaLibros.isEmpty()){
            System.out.println("No hay actualmente libros agregados");
            return;
        }

        for(Libro libro : listaLibros){
            System.out.println(libro.toString());
        }
    }
}
