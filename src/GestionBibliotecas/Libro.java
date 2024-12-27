package GestionBibliotecas;

public class Libro {

    private String ISBN;
    private String titulo;
    private String autor;
    private String anno;
    private short numCopias;
    private boolean disponible;

    public Libro(){};
    public Libro(String ISBN, String titulo, String autor, String anno, short numCopias, boolean disponible){
       this.ISBN = ISBN;
       this.titulo = titulo;
       this.autor = autor;
       this.anno = anno;
       this.numCopias = numCopias;
       this.disponible = disponible;
    }

}
