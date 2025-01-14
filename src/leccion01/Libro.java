package leccion01;

public class Libro extends MaterialBiblioteca {

    private short numeroPaginas;

    public Libro(String titulo, String autor, short numeroPaginas){
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public short getNumeroPaginas(){
        return numeroPaginas;
    }
    
    public void setNumeroPaginas(short numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Libro: numero de paginas: " + numeroPaginas);
    }
}
