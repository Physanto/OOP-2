package GestionBibliotecas;

import GestionBibliotecas.Utils.Buscador;
import GestionBibliotecas.Utils.Mensajes;
import GestionBibliotecas.Utils.ValidadorDatos;

import java.util.Scanner;
import java.util.ArrayList;

public class GestionBiblioteca {

    private Scanner stdin;
    private Biblioteca biblioteca;
    private GestionUsuario gestionUsuario;

    public GestionBiblioteca(){
        this.stdin = new Scanner(System.in);
        this.biblioteca = new Biblioteca();
        this.gestionUsuario = new GestionUsuario();
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
            Genericos.limpiadorPantalla();
            System.out.println("**************** MENU PRINCIPAL ***************");
            System.out.println("1._ Ver libros disponibles \n" +
                    "2._ Consultar historial de prestamos - Buscar Libro \n" +
                    "3._ Prestar libro \n" +
                    "4._ Devolver libro \n" +
                    "5._ Reservar libro \n" +
                    "6._ Ver libros reservados \n" +
                    "7._ Agregar un nuevo libro \n" +
                    "8._ Ver todos los libros agregados \n" +
                    "9._ Salir \n" +
                    "*********************************************** \n\n");
            System.out.print("Por favor ingresar una opcion, (1-8): ");

            opcion = stdin.next().charAt(0);

            switch (opcion){

                case '1':
                    librosDisponibles();
                    break;

                case '2':
                    buscarLibros();
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
                    listarTodosLosLibros();
                    break;
                
                case '9':
                    break;

                default:
                    System.out.println("Ingresa una opcion correcta");
                    break;
            }
        }
        while (opcion != '8');
        stdin.close();
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

        // String isbn = solicitarDatos(stdin, new BuzonMensajes.MensajeISBN(), new Validadores.ValidarISBN());
        // String titulo = solicitarDatos(stdin, new BuzonMensajes.MensajeTitulo(), new Validadores.ValidarDatoVacio());
        // String autor = solicitarDatos(stdin, new BuzonMensajes.MensajeAutor(), new Validadores.ValidarDatoVacio());
        // short anno = Short.parseShort(solicitarDatos(stdin, new BuzonMensajes.MensajeAnno(), new Validadores.ValidarAnno()));
        // short numCopias = Short.parseShort(solicitarDatos(stdin, new BuzonMensajes.MensajeNumCopias(), new Validadores.ValidarNumCopias()));
        // String disponible = solicitarDatos(stdin, new BuzonMensajes.MensajeDisponible(), new Validadores.ValidarDisponible());
        // System.out.println("este es el valor " + disponible);
        // 
        // boolean disponibles = ("1".equals(disponible)) ? true : false;

        biblioteca.almacenarLibro(new Libro("mnbvcxzlkjhgf", "morales", "andrea", (short)1900, (short)100, true));
        Libro libro = new Libro("qwertyuiopasd", "Viaje al centro de la tierra", "Julio Verne", (short)1995, (short)100, true);
        Libro libro2 = new Libro("mnbvcxzlkjhgt", "Un Abismo en el Cielo", "Vince Verne", (short)2001, (short)200, true);
        Libro libro3 = new Libro("qwer123mn4h32", "Cronicas de una Muerte", "Gabriel Garcia", (short)1800, (short)210, true);
        Libro libro4 = new Libro("qwer123mn4h75", "Cronicas de una muerte anunciada", "Gabriel Garcia fadsfsdf", (short)2010, (short)500, true);
        Libro libro5 = new Libro("lkmbnd712kvd4", "Un Fuego en el Infierno", "Dr Paul", (short)2010, (short)500, true);
        Libro libro6 = new Libro("lkmbnd712kvd2", "Viaje al centro de la tierra", "Junior Julio Verne", (short)2010, (short)500, true);

        // if(verificarInformacion(isbn, titulo, autor)){
        //     biblioteca.almacenarLibro(new Libro(isbn, titulo, autor, anno, numCopias, disponibles));
        //     System.out.println("Libro agregado exitosamente");
        // }
        // else{
        //     System.out.println("Libro no se agrego, porque este ya existe");
        // }
        biblioteca.almacenarLibro(libro);
        biblioteca.almacenarLibro(libro2);
        biblioteca.almacenarLibro(libro3);
        biblioteca.almacenarLibro(libro4);
        biblioteca.almacenarLibro(libro5);
        biblioteca.almacenarLibro(libro6);
        
        // if(verificarInformacion("qwertyuiopasd", "Viaje al centro de la tierra", "Julio Verne")){
        //     biblioteca.almacenarLibro(libro);
        //     System.out.println("Libro creado exitosamente");
        // }
        //
        // if(verificarInformacion("mnbvcxzlkjhgf", "Un Abismo en el Cielo", "Vince Verne")){
        //     biblioteca.almacenarLibro(libro2);
        //     System.out.println("Libro creado exitosamente");
        // }
        //
        // if(verificarInformacion("qwer123mn4h32", "Cronicas de una Muerte", "Gabriel Garcia")){
        //     biblioteca.almacenarLibro(libro3);
        //     System.out.println("Libro creado exitosamente");
        // }
        //
        // if(verificarInformacion("qwer123mn4h32", "Cronicas", "Gabriel Garcia fadsfsdf")){
        //     biblioteca.almacenarLibro(libro4);
        //     System.out.println("Libro creado exitosamente");
        // }
        //
        // if(verificarInformacion("lkmbnd712kvd4", "Un Abismo en el Cielo", "Dr Paul")){
        //     biblioteca.almacenarLibro(libro5);
        //     System.out.println("Libro creado exitosamente");
        // }
        //
        // if(verificarInformacion("lkmbnd712kvd2", "Viaje al centro de la tierra", "Julio Verne")){
        //     biblioteca.almacenarLibro(libro6);
        //     System.out.println("Libro creado exitosamente");
        // }
        // System.out.println("Este libro ya existe");
        stdin.nextLine();
    }

    public boolean verificarInformacion(String isbn, String titulo, String autor){

        ArrayList<Libro> listaLibros = biblioteca.getListaLibros();

        ValidadorDatos validadorDatos = new Validadores.ValidarISBN();

        return validadorDatos.ValidarIsbnTituloAutorRepetido(listaLibros, isbn, titulo, autor); 
    }

    public void buscarLibros(){
        Genericos.limpiadorPantalla();

        Buscador buscador = null;
        String dato = null;
        char option = solicitarDatosBusqueda(stdin);

        switch(option){

            case '1': 
                dato = solicitarDatos(stdin, new BuzonMensajes.MensajeISBN(), new Validadores.ValidarISBN());
                buscador = new BuscarPorCriterio.BuscarPorISBN(); 
                break;

            case '2':
                dato = solicitarDatos(stdin, new BuzonMensajes.MensajeTitulo(), new Validadores.ValidarDatoVacio());                  
                buscador = new BuscarPorCriterio.BuscarPorTitulo();
                break;

            case '3':
                dato = solicitarDatos(stdin, new BuzonMensajes.MensajeAutor(), new Validadores.ValidarDatoVacio());
                buscador = new BuscarPorCriterio.BuscarPorAutor();
                break;

            case '4':
                dato = solicitarDatos(stdin, new BuzonMensajes.MensajeAnno(), new Validadores.ValidarAnno());
                buscador = new BuscarPorCriterio.BuscarPorAnno();
                break;

            case '5':
                dato = solicitarDatos(stdin, new BuzonMensajes.MensajeDisponible(), new Validadores.ValidarDisponible());
                buscador = new BuscarPorCriterio.BuscarDisponible();
        }

        ArrayList<Libro> lista = biblioteca.buscarLibro(buscador, dato);

        libroEncontrado(lista, buscador);
        stdin.nextLine();
    }

    public void libroEncontrado(ArrayList<Libro> lista, Buscador buscador){

        if(!lista.isEmpty()) {
            for(Libro libro : lista){
                System.out.println(libro.toString());
            }
        }
        else {
            buscador.mostrarMensajeError();
        }
    }

    public char solicitarDatosBusqueda(Scanner stdin){

        char option;
        do{
            Genericos.limpiadorPantalla();
            System.out.println("----------Buscador de Libros----------\n\n" +
                           "1._ Isbn\n" +
                           "2._ Titulo\n" +
                           "3._ Autor\n" +
                           "4._ Anno\n" +
                           "5._ disponibilidad\n");
            System.out.print("Ingresa el metodo por el cual quieres hacer la busqueda (1-5): ");
            option = stdin.next().charAt(0);
            stdin.nextLine();
        }
        while(option < '1' || option > '5'); 

        return option; 
    }

    public void librosDisponibles(){
        Genericos.limpiadorPantalla();

        System.out.println("----------Libros disponibles en la biblioteca----------\n");
        String dato = "1";

        ArrayList<Libro> listaLibros = biblioteca.librosDisponibles(new BuscarPorCriterio.BuscarDisponible(), dato);

        for(Libro libro : listaLibros){
            System.out.println(libro.toString());
        }
        stdin.nextLine();
    }

    public void listarTodosLosLibros(){
        ArrayList<Libro> lista = biblioteca.getListaLibros();
        for(Libro libro : lista){
            System.out.println(libro);
        }
    }

    public void prestarLibro(){

        Buscador buscador = new BuscarPorCriterio.BuscarPorISBN(); 

        Genericos.limpiadorPantalla();
        librosDisponibles();

        String isbn = solicitarDatosPrestarLibro();

        ArrayList<Libro> lista = biblioteca.buscarLibro(buscador, isbn);
        Libro libroPrestado = lista.getFirst();

        if(libroPrestado.getDisponible() == false){
            System.out.println("Este libro ya esta prestado");
            return;
        }

        gestionUsuario.prestarLibro(libroPrestado);
        biblioteca.libroPrestado(libroPrestado);
        System.out.println("Este es el libro que prestaste: " + libroPrestado);
        stdin.nextLine();


    }

    public String solicitarDatosPrestarLibro(){

       return "";
    }
}
