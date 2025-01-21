package GestionDispositivos.Modelo;

import GestionDispositivos.Utilidades.Mensajes;

public class BuzonMensajes {

    public static class MensajeTipoTelefono implements Mensajes {

        @Override
        public void mostrarMensajePersonalizado(){
            System.out.println("Ingresa el tipo de telefono que quieres crear: ");
        }
    }
}
