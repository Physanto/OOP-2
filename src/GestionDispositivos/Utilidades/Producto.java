package GestionDispositivos.Utilidades;

public interface Producto<T> {

    public <E> boolean agregarDispositivo(T e);
    public <E> boolean eliminarDispositivo(T e); 
    public void mensaje();
}
