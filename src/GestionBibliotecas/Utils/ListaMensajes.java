package GestionBibliotecas.Utils;

import java.util.ArrayList;
import GestionBibliotecas.Modelo.BuzonMensajes;

public class ListaMensajes {

    public static ArrayList<Mensajes> getListaMensajes(){

        ArrayList<Mensajes> listaMensajes = new ArrayList<>();

        listaMensajes.add(new BuzonMensajes.MensajeISBN());
        listaMensajes.add(new BuzonMensajes.MensajeTitulo());
        listaMensajes.add(new BuzonMensajes.MensajeAutor());
        listaMensajes.add(new BuzonMensajes.MensajeAnno());
        listaMensajes.add(new BuzonMensajes.MensajeDisponible());
        listaMensajes.add(new BuzonMensajes.MensajeNumCopias());
        listaMensajes.add(new BuzonMensajes.MensajeDisponible());

        return listaMensajes;
    }
}
