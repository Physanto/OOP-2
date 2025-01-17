package GestionDispositivos.Modelo;

import GestionDispositivos.Utilidades.Validar;
import GestionDispositivos.Utilidades.Mensajes;
import java.util.Scanner;

public class ValidarEntrada{


    public String solicitarDatos(Scanner stdin, Mensajes mensaje, Validar validarDatos){

        String entradaDatos;
        do{
            mensaje.mostrarMensajePersonalizado();
            entradaDatos = stdin.nextLine();

            if(validarDatos.validarEntrada(entradaDatos)){
                return entradaDatos;
            }

        }
        while(true);
    }

    public static class ValidarDatoVacio implements Validar {

        @Override
        public boolean validarEntrada(String entrada){
            return !entrada.isEmpty();
        }

        @Override
        public void mensaje(){
            System.out.println("No ingresaste ningun dato, intentalo de nuevo");
        }
    } 
}
