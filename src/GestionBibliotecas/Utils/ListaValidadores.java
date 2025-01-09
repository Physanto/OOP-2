package GestionBibliotecas.Utils;

import java.util.ArrayList;
import GestionBibliotecas.Modelo.ValidarDatos;

public class ListaValidadores {

    public static ArrayList<Validador> getListaValidadores(){

        ArrayList<Validador> listaValidadores = new ArrayList<>();

        listaValidadores.add(new ValidarDatos.ValidarISBN());
        listaValidadores.add(new ValidarDatos.ValidarDatoVacio());
        listaValidadores.add(new ValidarDatos.ValidarDatoVacio());
        listaValidadores.add(new ValidarDatos.ValidarAnno());
        listaValidadores.add(new ValidarDatos.ValidarDisponible());
        listaValidadores.add(new ValidarDatos.ValidarNumCopias());
        listaValidadores.add(new ValidarDatos.ValidarEdad());

        return listaValidadores;
    }
}
