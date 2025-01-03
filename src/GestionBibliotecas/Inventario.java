package GestionBibliotecas;

import GestionBibliotecas.Interfaces.Buscador;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Libro> listaLibros;

    public Inventario(){
        this.listaLibros = new ArrayList<>();
    }

    public void almacenarLibros(Libro libro){
        listaLibros.add(libro);
    }

    public Libro buscarLibro(Buscador buscador, String dato){
        if(buscador.buscarCriterio(listaLibros, dato)){
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
