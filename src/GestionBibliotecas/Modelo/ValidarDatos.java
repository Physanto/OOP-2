package GestionBibliotecas.Modelo;

import GestionBibliotecas.Utils.Validador;

public class ValidarDatos {

    public static class ValidarISBN implements Validador {

        @Override
        public boolean validarEntrada(String dato){
            final int LONGITUD_MAX = 13;
            return !(dato.trim().isEmpty()) && dato.length() == LONGITUD_MAX;
        }

        @Override
        public void mensajeError(){
            System.out.println("Ingresa un valor valido para el ISBN.");
        }
    }

    public static class ValidarDatoVacio implements Validador {

        @Override
        public boolean validarEntrada(String dato){
            return !dato.trim().isEmpty();
        }

        @Override
        public void mensajeError(){
            System.out.println("Ingresa un valor no vacio.");
        }
    }
    public static class ValidarAnno implements Validador {

        @Override
        public boolean validarEntrada(String dato){

            if(!dato.trim().isEmpty()){
                short anno = Short.parseShort(dato);
                return anno >= 1805 && anno<= 2024;
            }
            return false;
        }

        @Override
        public void mensajeError(){
            System.out.println("Ingresa un valor valido para el anno.");
        }
    }

    public static class ValidarNumCopias implements Validador {

        @Override
        public boolean validarEntrada(String dato){

            if(!dato.trim().isEmpty()){
                short numCopias = Short.parseShort(dato);
                return numCopias >= 1 && numCopias <= 1000;
            }
            return false;
        }

        @Override
        public void mensajeError(){
            System.out.println("Ingresa un valor entre 1 y 1000");
        }
    }

    public static class ValidarDisponible implements Validador {

        @Override
        public boolean validarEntrada(String dato){
            return "1".equals(dato) || "0".equals(dato);
        }

        @Override
        public void mensajeError(){
            System.out.println("Ingresa un valor entre 0 y 1");
        }
    } 

    public static class ValidarEdad implements Validador {

        @Override
        public boolean validarEntrada(String dato){

            byte edad = Byte.parseByte(dato);
return edad >= 6 || edad <= 90; 
        }

        @Override
        public void mensajeError(){
            System.out.println("Ingresa una edad valida");
        }
    }
}
