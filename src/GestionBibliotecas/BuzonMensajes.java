package GestionBibliotecas;

import GestionBibliotecas.Interfaces.Mensajes;

public class BuzonMensajes {

    public static class MensajeISBN implements Mensajes {

        @Override
        public void mensajeEntrada(){
           System.out.print("Ingresa el ISBN del libro (13 digitos): ");
        }
    }

    public static class MensajeTitulo implements Mensajes {

        @Override
        public void mensajeEntrada(){
            System.out.print("Ingresa el titulo del libro: ");
        }
    }

    public static class MensajeAutor implements Mensajes {

        @Override
        public void mensajeEntrada(){
            System.out.print("Ingresa el autor del libro: ");
        }
    }
    public static class MensajeAnno implements Mensajes {

        @Override
        public void mensajeEntrada(){
            System.out.print("Ingresa el anno de publicacion del libro: ");
        }
    }
    public static class MensajeNumCopias implements Mensajes {

        @Override
        public void mensajeEntrada(){
            System.out.print("Ingresa el numero de copias para este libro (1-1000): ");
        }
    }
    
    public static class MensajeDisponible implements Mensajes {

        @Override
        public void mensajeEntrada(){
            System.out.print("Ingresa 1 - disponible, 0 - no disponible: ");
        }
    }
}
