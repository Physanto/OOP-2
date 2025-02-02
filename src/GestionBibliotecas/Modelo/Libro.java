package GestionBibliotecas.Modelo;

public class Libro {

    private String ISBN;
    private String titulo;
    private String autor;
    private short anno;
    private short numCopias;
    private boolean disponible;

    public Libro(){}

    public Libro(String ISBN, String titulo, String autor, short anno, short numCopias, boolean disponible){
       this.ISBN = ISBN;
       this.titulo = titulo;
       this.autor = autor;
       this.anno = anno;
       this.numCopias = numCopias;
       this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anno='" + anno + '\'' +
                ", numCopias=" + numCopias +
                ", disponible=" + disponible +
                '}';
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public short getNumCopias() {
        return numCopias;
    }

    public void setNumCopias(short numCopias) {
        this.numCopias = numCopias;
    }

    public short getAnno() {
        return anno;
    }

    public void setAnno(short anno) {
        this.anno = anno;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
