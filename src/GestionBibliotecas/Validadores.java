package GestionBibliotecas;

import GestionBibliotecas.Interfaces.ValidadorDatos;

public class Validadores {

    public static class ValidarISBN implements ValidadorDatos<String>{

        @Override
        public boolean validarDato(String dato){
            final int LONGITUD_MAX = 13;
            return dato.length() <= LONGITUD_MAX;
        }

        @Override
        public void mensajeError(){
            System.out.println("Ingresa un valor valido para el ISBN.");
        }
    }

    public static class ValidarDatoVacio implements ValidadorDatos<String>{

        @Override
        public boolean validarDato(String dato){
            return !dato.trim().isEmpty();
        }

        @Override
        public void mensajeError(){
            System.out.println("Ingresa un valor no vacio.");
        }
    }
    public static class ValidarAnno implements ValidadorDatos<String>{

        @Override
        public boolean validarDato(String dato){
            short anno = Short.parseShort(dato);
            return anno >= 1805 && anno<= 2024;
        }

        @Override
        public void mensajeError(){
            System.out.println("Ingresa un valor valido para el anno.");
        }
    }

    public static class ValidarNumCopias implements ValidadorDatos<String>{

        @Override
        public boolean validarDato(String dato){
            short numCopias = Short.parseShort(dato);
            return numCopias >= 1 && numCopias <= 1000;
        }

        @Override
        public void mensajeError(){
            System.out.println("Ingresa un valor entre 1 y 1000");
        }
    }
}
