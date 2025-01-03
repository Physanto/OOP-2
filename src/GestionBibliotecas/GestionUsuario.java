package GestionBibliotecas;

public class GestionUsuario{
    private Libro libro;

    public void prestarLibro(String nombreLibro){

        if(!libro.getDisponible()){ 
            System.out.println("El libro actualmente no esta disponible para ser prestado.");
            return;
        }
        System.out.println("Disfrute de su libro.");
        libro.setDisponible(false);
    }

    public void devolverLibro(String nombreLibro){
        
    }
}
