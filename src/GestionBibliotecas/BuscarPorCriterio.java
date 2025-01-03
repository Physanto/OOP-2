package GestionBibliotecas;

import java.util.ArrayList;

import GestionBibliotecas.Interfaces.Buscador;

public class BuscarPorCriterio {

    public static class BuscarPorTitulo implements Buscador {

        @Override
        public boolean buscarCriterio(ArrayList<Libro> listaLibros, String nombre){

            for(Libro libro : listaLibros){

                if(libro.getTitulo().equalsIgnoreCase(nombre)){ 
                    return true; 
                }
            }
        return false;
        }

        @Override
        public void mostrarMensaje(){
            System.out.println("Libro no encontrado con ese titulo.");
        }
    }

    public static class BuscarPorAutor implements Buscador {

        @Override
        public boolean buscarCriterio(ArrayList<Libro> listaLibros, String autor){

            for(Libro libro : listaLibros){

                if(libro.getAutor().equalsIgnoreCase(autor)){ 
                    return true; 
                }
            }
        return false;
        }

        @Override
        public void mostrarMensaje(){
            System.out.println("Libro no encontrado con ese autor.");
        }
    }

    public static class BuscarPorISBN implements Buscador {

        @Override
        public boolean buscarCriterio(ArrayList<Libro> listaLibros, String ISBN){

            for(Libro libro : listaLibros){

                if(libro.getISBN().equalsIgnoreCase(ISBN)){ 
                    return true; 
                }
            }
        return false;
        }

        @Override
        public void mostrarMensaje(){
            System.out.println("Libro no encontrado con ese ISBN.");
        }
    }

    public static class BuscarPorAnno implements Buscador {

        @Override
        public boolean buscarCriterio(ArrayList<Libro> listaLibros, String dato){
            short anno = Short.parseShort(dato);

            for(Libro libro : listaLibros){

                if(libro.getAnno() == anno){ 
                    return true; 
                }
            }
        return false;
        }

        @Override
        public void mostrarMensaje(){
            System.out.println("Libro no encontrado con ese anno.");
        }
    }
}
