package GestionBibliotecas;

public class Validador {

    public boolean validarDatoVacio(String dato){
        return !dato.trim().isEmpty();
    }

    public boolean validarISBN(String dato){
        return dato.trim().length() == 13;
    }

    public boolean validarAnno(String dato){

        short anno = Short.parseShort(dato);
        return anno >= 1805 && anno<= 2024;
    }

    public boolean validarNumCopias(short dato){
        return dato >= 0;
    }
}
