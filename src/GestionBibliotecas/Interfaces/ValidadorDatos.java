package GestionBibliotecas.Interfaces;

public interface ValidadorDatos<T>{

    boolean validarDato(T entrada);
    void mensajeError();
    default boolean validarDatoVacio(String dato){
        return !dato.trim().isEmpty();
    }
}
