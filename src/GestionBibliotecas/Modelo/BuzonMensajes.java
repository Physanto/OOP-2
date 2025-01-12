package GestionBibliotecas.Modelo;

import GestionBibliotecas.Utils.Mensajes;

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
            System.out.print("Ingresa 1 para los disponibles / 0 para los no disponible: ");
        }
    }

    public static class MensajeId implements Mensajes {

        @Override
        public void mensajeEntrada(){
            System.out.print("Ingresa el Id para el usuario: ");
        }
    }

    public static class MensajeNombre implements Mensajes {

        @Override
        public void mensajeEntrada(){
            System.out.print("Ingresa el nombre para el usuario: ");
        }
    }

    public static class MensajeEdad implements Mensajes {

        @Override
        public void mensajeEntrada(){
            System.out.print("Ingresa la edad para el usuario: ");
        }
    }
}
