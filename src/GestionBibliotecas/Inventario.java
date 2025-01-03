package GestionBibliotecas;

import GestionBibliotecas.Interfaces.Buscador;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Libro> listaLibros;
    Buscador buscadore;

    public Inventario(){
        this.listaLibros = new ArrayList<>();
    }

    public void almacenarLibros(Libro libro){
        listaLibros.add(libro);
    }

    public boolean buscarPorTitulo(Buscador buscador, String titulo){
        return buscador.buscarCriterio(listaLibros, titulo);
    }

    public boolean buscarPorAutor(String autor){
        return buscador.buscarCriterio(autor);
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
