package GestionDispositivos.Modelo;

import GestionDispositivos.Utilidades.Mensajes;
import GestionDispositivos.Utilidades.Validar;
import java.util.Scanner;

public class GestionMain {

    public GestionMain(){

    }

    public <T> String solicitarDatos(Scanner stdin, Mensajes mensaje, Validar<T> validarDatos){

        String entradaDatos;
        do{
            mensaje.mostrarMensajePersonalizado();
            stdin.nextLine();

            if(validar.){
                return entradaDatos;
            }

        }
    }


}
