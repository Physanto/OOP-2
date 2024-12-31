package GestionBibliotecas;

import GestionBibliotecas.Interfaces.Mensajes;
import GestionBibliotecas.Interfaces.ValidadorDatos;

import java.util.Scanner;

public class GestionBiblioteca {

    private Libro libro;
    private Scanner stdin;
    private Biblioteca biblioteca;

    public GestionBiblioteca(){
        this.stdin = new Scanner(System.in);
        this.biblioteca = new Biblioteca();
    }

    public static void main(String[] args){
        GestionBiblioteca gestionBiblioteca = new GestionBiblioteca();
        gestionBiblioteca.menuPrincipal();
    }
    /***
     * Esta funcion muestra el menu principal del Sistema de Gestion de Biblioteca
     *
     */
    public void menuPrincipal(){
        Scanner stdin = new Scanner(System.in);
        char opcion;

        do{
            limpiadorPantalla();
            System.out.println("**************** MENU PRINCIPAL ***************");
            System.out.println("1._ Ver libros disponibles \n" +
                    "2._ Consultar historial de prestamos \n" +
                    "3._ Prestar libro \n" +
                    "4._ Devolver libro \n" +
                    "5._ Reservar libro \n" +
                    "6._ Ver libros reservados \n" +
                    "7._ Agregar un nuevo libro \n" +
                    "8._ Salir \n" +
                    "*********************************************** \n\n");
            System.out.print("Por favor ingresar una opcion, (1-8): ");

            opcion = stdin.next().charAt(0);

            switch (opcion){

                case '1':
                    librosDisponibles();
                    break;

                case '2':
                    buscarLibro();
                    break;

                case '3':
                    break;

                case '4':
                    break;

                case '5':
                    break;

                case '6':
                    break;

                case '7':
                    crearLibro();
                    break;

                case '8':
                    break;

                default:
                    System.out.println("Ingresa una opcion correcta");
                    break;
            }
        }
        while (opcion != 8);
    }

    public String solicitarDatos(Scanner stdin, Mensajes mensaje, ValidadorDatos validadorDatos){

        String entrada;
        do{
            mensaje.mensajeEntrada();
            entrada = stdin.nextLine();

            if(validadorDatos.validarEntrada(entrada)){
                return entrada;
            }
            validadorDatos.mensajeError();
        }
        while(true);
    }

    public void crearLibro(){

        String ISBN = solicitarDatos(stdin, new BuzonMensajes.MensajeISBN(), new Validadores.ValidarISBN());
        String titulo = solicitarDatos(stdin, new BuzonMensajes.MensajeTitulo(), new Validadores.ValidarDatoVacio());
        String autor = solicitarDatos(stdin, new BuzonMensajes.MensajeAutor(), new Validadores.ValidarDatoVacio());
        short anno = Short.parseShort(solicitarDatos(stdin, new BuzonMensajes.MensajeAnno(), new Validadores.ValidarAnno()));
        short numCopias = Short.parseShort(solicitarDatos(stdin, new BuzonMensajes.MensajeNumCopias(), new Validadores.ValidarNumCopias()));

        biblioteca.almacenarLibro(new Libro(ISBN, titulo, autor, anno, numCopias, true));
        System.out.println("Libro creado exitosamente");
    }

    public void buscarLibro(){
        limpiadorPantalla();

        System.out.println("----------Buscador de Libros----------\n");
        String nombre = solicitarDatos(stdin, new BuzonMensajes.MensajeTitulo(), new Validadores.ValidarDatoVacio());
        biblioteca.buscarLibro(nombre);
    }

    public void librosDisponibles(){
        limpiadorPantalla();
        System.out.println("----------Libros disponibles en la biblioteca----------\n");
        biblioteca.librosDisponibles();
    }

    public static void limpiadorPantalla() {
        for (byte i = 0; i < 100; i++) { System.out.println(""); }
    }
}
