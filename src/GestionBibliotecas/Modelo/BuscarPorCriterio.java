package GestionBibliotecas.Modelo;

import java.util.ArrayList;

import GestionBibliotecas.Utils.Buscador;

public class BuscarPorCriterio {

    public static class BuscarPorTitulo implements Buscador<Libro, String> {

        @Override
        public ArrayList<Libro> buscarCriterio(ArrayList<Libro> listaLibros, String titulo){

            ArrayList<Libro> lista = new ArrayList<>();

            for(Libro libro : listaLibros){

                if(libro.getTitulo().equalsIgnoreCase(titulo)){ 
                    lista.add(libro);
                }
            }
            return lista;
        }

        @Override
        public void mostrarMensajeError(){
            System.out.println("Libro no encontrado con ese titulo.");
        }
    }

    public static class BuscarPorAutor implements Buscador<Libro, String> {

        @Override
        public ArrayList<Libro> buscarCriterio(ArrayList<Libro> listaLibros, String autor){

            ArrayList<Libro> lista = new ArrayList<>();

            for(Libro libro : listaLibros){

                if(libro.getAutor().equalsIgnoreCase(autor)){ 
                    lista.add(libro); 
                }
            }
        return lista;
        }

        @Override
        public void mostrarMensajeError(){
            System.out.println("Libro no encontrado con ese autor.");
        }    
    }

    public static class BuscarPorISBN implements Buscador<Libro, String> {

        @Override
        public ArrayList<Libro> buscarCriterio(ArrayList<Libro> listaLibros, String ISBN){

            ArrayList<Libro> lista = new ArrayList<>();
            for(Libro libro : listaLibros){

                if(libro.getISBN().equalsIgnoreCase(ISBN)){ 
                    lista.add(libro); 
                }
            }
        return lista;
        }

        @Override
        public void mostrarMensajeError(){
            System.out.println("Libro no encontrado con ese ISBN.");
        }
    }

    public static class BuscarPorAnno implements Buscador<Libro, String> {

        @Override
        public ArrayList<Libro> buscarCriterio(ArrayList<Libro> listaLibros, String dato){

            ArrayList<Libro> lista = new ArrayList<>();
            short anno = Short.parseShort(dato);

            for(Libro libro : listaLibros){

                if(libro.getAnno() == anno){ 
                    lista.add(libro); 
                }
            }
        return lista;
        }

        @Override
        public void mostrarMensajeError(){
            System.out.println("Libro no encontrado con ese anno.");
        }
    }

    public static class BuscarDisponible implements Buscador<Libro, String> {

        @Override
        public ArrayList<Libro> buscarCriterio(ArrayList<Libro> listaLibros, String generico){

            ArrayList<Libro> lista = new ArrayList<>();
            boolean disponible = ("1".equals(generico)) ? true : false;

            for(Libro libro : listaLibros){
                if(libro.getDisponible() == disponible){
                    lista.add(libro);
                }
            }
            return lista;
        }

        @Override
        public void mostrarMensajeError(){
            System.out.println("Libro no encontrado por disponibilidad");
        }
    }

    public static class BuscarPorId implements Buscador<Usuario, String> {

        @Override
        public ArrayList<Usuario> buscarCriterio(ArrayList<Usuario> listaUsuarios, String dato){

            ArrayList<Usuario> lista = new ArrayList<>();

            for(Usuario usuario : listaUsuarios){
                if(usuario.getID().equalsIgnoreCase(dato)){
                    lista.add(usuario);
                }
            }
            return lista;
        }

        @Override
        public void mostrarMensajeError(){
            System.out.println("Usuario no encontrado por Id");
        }
    }
}
