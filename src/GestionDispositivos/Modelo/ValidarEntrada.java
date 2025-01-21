package GestionDispositivos.Modelo;

import GestionDispositivos.Utilidades.Validar;
import GestionDispositivos.Utilidades.Mensajes;
import java.util.Scanner;

public class ValidarEntrada{ 

    public static class ValidarDatoVacio implements Validar {

        @Override
        public <T> boolean validarEntrada(T entrada){
            return !entrada.equals("");
        }

        @Override
        public void mensaje(){
            System.out.println("No ingresaste ningun dato, intentalo de nuevo");
        }
    } 
}
