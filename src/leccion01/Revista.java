package leccion01;

public class Revista extends MaterialBiblioteca {

    private short numeroEdicion;

    public Revista(String titulo, String autor, short numeroEdicion){
        super(titulo, autor);
        this.numeroEdicion = numeroEdicion;
    }

    public short getNumeroPaginas(){
        return numeroEdicion;
    }
    
    public void setNumeroPaginas(short numeroEdicion){
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Revista: numero de edicion: " + numeroEdicion);
    }
}
