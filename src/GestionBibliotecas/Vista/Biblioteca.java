package GestionBibliotecas.Vista;

import GestionBibliotecas.Modelo.*;
import GestionBibliotecas.Utils.Buscador;
import GestionBibliotecas.Utils.ListaBuscadores;
import GestionBibliotecas.Utils.ListaMensajes;
import GestionBibliotecas.Utils.ListaValidadores;
import GestionBibliotecas.Utils.Mensajes;
import GestionBibliotecas.Utils.Validador;

import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca {

    private Scanner stdin;
    private GestionBiblioteca gestionBiblioteca;
    private GestionUsuario gestionUsuario;

    public Biblioteca(){
        this.stdin = new Scanner(System.in);
        this.gestionBiblioteca = new GestionBiblioteca();
        this.gestionUsuario = new GestionUsuario();
    }

    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.menuPrincipal();
    }
    
    public void mostrarMenu(){

        System.out.println("**************** MENU PRINCIPAL ***************");
        System.out.println("1._ Ver libros disponibles \n" +
                           "2._ Consultar historial de prestamos - Buscar Libro \n" +
                           "3._ Prestar libro \n" +
                           "4._ Devolver libro \n" +
                           "5._ Reservar libro \n" +
                           "6._ Ver libros reservados \n" +
                           "7._ Agregar un nuevo libro \n" +
                           "8._ Ver todos los libros agregados \n" +
                           "9._ Crear un Usuario\n" + 
                           "10._ Ver todos los usuarios creados\n" + 
                           "11._ Salir \n" +
                           "*********************************************** \n\n");
        System.out.print("Por favor ingresar una opcion, (1-11): ");
    }
    /***
     * Esta funcion muestra el menu principal del Sistema de Gestion de GestionBiblioteca
     *
     */
    public void menuPrincipal(){
        byte opcion;

        do{ 
            Genericos.limpiadorPantalla();
            
            mostrarMenu();
            opcion = stdin.nextByte();
            stdin.nextLine(); 
            Genericos.limpiadorPantalla();

            switch (opcion){

                case 1: 
                    mostrarLibrosPorDisponibilidad("1"); 
                    break;

                case 2:
                    listarHistorialPrestamos();
                    //buscarLibros();
                    break;

                case 3:
                    prestarLibro();
                    break;

                case 4:
                    devolverLibro();
                    break;

                case 5:
                    reservarLibro();
                    break;

                case 6:
                    break;

                case 7:
                    crearLibro();
                    break;

                case 8:
                    listarTodosLosLibros();
                    break;
                
                case 9:
                    crearUsuario();
                    break;

                case 10:
                    listarTodosUsuarios();
                    break;
                
                case 11:
                    break;

                default:
                    System.out.println("Ingresa una opcion correcta");
                    break;
            }
        }
        while (opcion != 11);
        stdin.close();
    }

    public String solicitarDatos(Mensajes mensaje, Validador validador){

        String entrada;
        do{
            mensaje.mensajeEntrada();
            entrada = stdin.nextLine();

            if(validador.validarEntrada(entrada)){
                return entrada;
            }
            validador.mensajeError();
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

        gestionBiblioteca.almacenarLibro(new Libro("mnbvcxzlkjhgf", "morales", "andrea", (short)1900, (short)100, true));
        Libro libro = new Libro("qwertyuiopasd", "Viaje al centro de la tierra", "Julio Verne", (short)1995, (short)100, true);
        Libro libro2 = new Libro("mnbvcxzlkjhgt", "Un Abismo en el Cielo", "Vince Verne", (short)2001, (short)200, true);
        Libro libro3 = new Libro("qwer123mn4h32", "Cronicas de una Muerte", "Gabriel Garcia", (short)1800, (short)210, true);
        Libro libro4 = new Libro("qwer123mn4h75", "Cronicas de una muerte anunciada", "Gabriel Garcia fadsfsdf", (short)2010, (short)500, true);
        Libro libro5 = new Libro("lkmbnd712kvd4", "Un Fuego en el Infierno", "Dr Paul", (short)2010, (short)500, false);
        Libro libro6 = new Libro("lkmbnd712kvd2", "Viaje al centro de la tierra", "Junior Julio Verne", (short)2010, (short)500, false);

        // if(verificarInformacion(isbn, titulo, autor)){
        //     GestionBiblioteca.almacenarLibro(new Libro(isbn, titulo, autor, anno, numCopias, disponibles));
        //     System.out.println("Libro agregado exitosamente");
        // }
        // else{
        //     System.out.println("Libro no se agrego, porque este ya existe");
        // }
        gestionBiblioteca.almacenarLibro(libro);
        gestionBiblioteca.almacenarLibro(libro2);
        gestionBiblioteca.almacenarLibro(libro3);
        gestionBiblioteca.almacenarLibro(libro4);
        gestionBiblioteca.almacenarLibro(libro5);
        gestionBiblioteca.almacenarLibro(libro6);
        
        // if(verificarInformacion("qwertyuiopasd", "Viaje al centro de la tierra", "Julio Verne")){
        //     GestionBiblioteca.almacenarLibro(libro);
        //     System.out.println("Libro creado exitosamente");
        // }
        //
        // if(verificarInformacion("mnbvcxzlkjhgf", "Un Abismo en el Cielo", "Vince Verne")){
        //     GestionBiblioteca.almacenarLibro(libro2);
        //     System.out.println("Libro creado exitosamente");
        // }
        //
        // if(verificarInformacion("qwer123mn4h32", "Cronicas de una Muerte", "Gabriel Garcia")){
        //     GestionBiblioteca.almacenarLibro(libro3);
        //     System.out.println("Libro creado exitosamente");
        // }
        //
        // if(verificarInformacion("qwer123mn4h32", "Cronicas", "Gabriel Garcia fadsfsdf")){
        //     GestionBiblioteca.almacenarLibro(libro4);
        //     System.out.println("Libro creado exitosamente");
        // }
        //
        // if(verificarInformacion("lkmbnd712kvd4", "Un Abismo en el Cielo", "Dr Paul")){
        //     GestionBiblioteca.almacenarLibro(libro5);
        //     System.out.println("Libro creado exitosamente");
        // }
        //
        // if(verificarInformacion("lkmbnd712kvd2", "Viaje al centro de la tierra", "Julio Verne")){
        //     GestionBiblioteca.almacenarLibro(libro6);
        //     System.out.println("Libro creado exitosamente");
        // }
        // System.out.println("Este libro ya existe");
        stdin.nextLine();
    }

    public boolean verificarInformacion(String isbn, String titulo, String autor){

        ArrayList<Libro> listaLibros = gestionBiblioteca.getListaLibros();

        Validador validadorDatos = new ValidarDatos.ValidarISBN();

        return validadorDatos.ValidarIsbnTituloAutorRepetido(listaLibros, isbn, titulo, autor); 
    } 

    public void buscarLibros(){
        
        ArrayList<Buscador<Libro, String>> listaBuscadores = ListaBuscadores.getListaBuscadores(); //estudia mas...
        ArrayList<Validador> listaValidadores = ListaValidadores.getListaValidadores(); //estas 3 listas las puedo encapsular en un contenedor para que sea mas legible.
        ArrayList<Mensajes> listaMensajes = ListaMensajes.getListaMensajes(); //creando una clase que instancia los objetos y una clase que actue como contenedora.

        char option = solicitarDatosBusqueda();
        int indice = option - '1';

        String dato = solicitarDatos(listaMensajes.get(indice), listaValidadores.get(indice));
        Buscador<Libro, String> buscador = listaBuscadores.get(indice);

        ArrayList<Libro> listaLibrosEncontrados = gestionBiblioteca.buscarLibro(buscador, dato);
        mostrarLibroEncontrado(listaLibrosEncontrados, buscador);
    }

    public void mostrarLibroEncontrado(ArrayList<Libro> lista, Buscador<Libro, String> buscador){

        if(!lista.isEmpty()) {
            for(Libro libro : lista){
                System.out.println(libro.toString());
            }
        }
        else {
            buscador.mostrarMensajeError();
        }
        stdin.nextLine();
    }

    public char solicitarDatosBusqueda(){

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
            option = stdin.next().charAt(0);//peligro: al declarlo como char y diciendole que tome solo el primer caracter charAt(0), si se digita 43 lo va pasar como true.
            stdin.nextLine();
        }
        while(option < '1' || option > '5'); 

        return option; 
    }

    public ArrayList<Libro> librosPorDisponibilidad(String disponibilidad){

        ArrayList<Libro> listaLibros = gestionBiblioteca.librosDisponibles(new BuscarPorCriterio.BuscarDisponible(), disponibilidad);

        return listaLibros;
    }

    public void mostrarLibrosPorDisponibilidad(String disponibilidad){

        final String DISPONIBLE = "1";

        if(disponibilidad.equals(DISPONIBLE)){
            System.out.println("----------Libros disponibles en la Biblioteca----------\n");
        }
        else{
            System.out.println("----------Libros no disponibles en la Biblioteca----------\n");
        }

        ArrayList<Libro> listaLibros = librosPorDisponibilidad(disponibilidad);

        if(listaLibros.isEmpty()){
            System.out.println("No hay libros en existencia");
            stdin.nextLine();
            return;
        }

        for(Libro libro : listaLibros){
            System.out.println(libro);
        }
        stdin.nextLine();
    }

    public void listarTodosLosLibros(){

        ArrayList<Libro> lista = gestionBiblioteca.getListaLibros();

        if(lista.isEmpty()){
            System.out.println("No hay libros anadidos");
            stdin.nextLine();
            return;
        }
        for(Libro libro : lista){
            System.out.println("Libros prestado");
            System.out.println(libro);
        }
        stdin.nextLine();
    }

    public void prestarLibro(){

        System.out.println("--------------------Prestador de libros--------------------\n\n\n");

        if(librosPorDisponibilidad("1").isEmpty()){
            System.out.println("No hay libros agregados actualmente");
            stdin.nextLine();
            return;
        }

        mostrarLibrosPorDisponibilidad("1");

        String isbn = solicitarDatos(new BuzonMensajes.MensajeISBN(), new ValidarDatos.ValidarISBN());
        String id = solicitarDatos(new BuzonMensajes.MensajeId(), new ValidarDatos.ValidarDatoVacio());
        ArrayList<Libro> listaLibro = gestionBiblioteca.buscarLibro(new BuscarPorCriterio.BuscarPorISBN(), isbn);
        ArrayList<Usuario> listaUsuario = gestionUsuario.buscarUsuario(new BuscarPorCriterio.BuscarPorId(), id);

        if(listaLibro.isEmpty() || listaUsuario.isEmpty()){
            System.out.println("El libro o usuario ingresado no se encuentra en la base de datos");
            stdin.nextLine();
            return;
        }

        gestionBiblioteca.modificarEstadoLibro(listaLibro.getFirst(), false);
        gestionUsuario.almacenarLibroPrestado(listaLibro.getFirst(), listaUsuario.getFirst());
        System.out.println("Libro prestado correctamente");
        stdin.nextLine();
    }

    public void crearUsuario(){

        String id = solicitarDatos(new BuzonMensajes.MensajeId(), new ValidarDatos.ValidarDatoVacio());
        String nombre = solicitarDatos(new BuzonMensajes.MensajeNombre(), new ValidarDatos.ValidarDatoVacio());
        String edad = solicitarDatos(new BuzonMensajes.MensajeEdad(), new ValidarDatos.ValidarEdad());

        if(gestionUsuario.crearUsuario(id, nombre, edad)){
            System.out.println("Usuario Creado satisfactoriamente");
        }
        else{
            System.out.println("Usuario no creado");
        }
        stdin.nextLine();
    }

    public void listarTodosUsuarios(){

        System.out.println("----------Usuarios registrados en la biblioteca----------\n");

        ArrayList<Usuario> listaUsuarios = gestionUsuario.listarTodosUsuarios();

        if(listaUsuarios.isEmpty()){
            System.out.println("No se han agregado usuarios");
            stdin.nextLine();
            return;
        }

        for(Usuario usuario : listaUsuarios){
            System.out.println(usuario);
        }
        stdin.nextLine();
    } 

    public void devolverLibro(){

        System.out.println("------------------------Menu para devolver libros----------------------");

        String id = solicitarDatos(new BuzonMensajes.MensajeId(), new ValidarDatos.ValidarDatoVacio()); 
        ArrayList<Usuario> listaUsuario = gestionUsuario.buscarUsuario(new BuscarPorCriterio.BuscarPorId(), id);

        if(listaUsuario.isEmpty()){
            System.out.println("No existe el usuario ingresado");
            stdin.nextLine();
            return;
        }

        Usuario usuario = listaUsuario.getFirst(); 
        System.out.println("Libros prestados por el usuario " + usuario.getNombre() + "\n");

        ArrayList<Libro> lista = gestionUsuario.mostrarListaLibrosPorUsuario(usuario);

        for(Libro libro : lista){
            System.out.println(libro);
        }

        String isbn = solicitarDatos(new BuzonMensajes.MensajeISBN(), new ValidarDatos.ValidarISBN());
        ArrayList<Libro> listaLibro = gestionBiblioteca.buscarLibro(new BuscarPorCriterio.BuscarPorISBN(), isbn);
        Libro libro = listaLibro.getFirst();

        if(listaLibro.isEmpty()){
            System.out.println("No existe este libro en la lista");
            stdin.nextLine();
            return;
        } 
        gestionBiblioteca.modificarEstadoLibro(libro, true);
        gestionUsuario.devolverLibro(usuario, libro);
    }

    public <T> boolean validarListaVacia(ArrayList<T> lista, byte tipo){
        
        final byte TIPO = 1; //tipo=1 es para la lista Usuario y 0 para la lista libro
        
        if(lista.isEmpty() && tipo == TIPO){
            stdin.nextLine();
            return true;
        }
        return false;
    }

    public void reservarLibro(){

        mostrarLibrosPorDisponibilidad("0");
        
        System.out.println("------------------------Menu para reservar Libros----------------------");

        String id = solicitarDatos(new BuzonMensajes.MensajeId(), new ValidarDatos.ValidarDatoVacio()); 
        ArrayList<Usuario> listaUsuario = gestionUsuario.buscarUsuario(new BuscarPorCriterio.BuscarPorId(), id);

        if(gestionUsuario.validarListaVacia(listaUsuario)){
            System.out.println("El usuario ingresado no existe");
        }
        
        String isbn = solicitarDatos(new BuzonMensajes.MensajeISBN(), new ValidarDatos.ValidarISBN());
        ArrayList<Libro> listaLibro = gestionBiblioteca.buscarLibro(new BuscarPorCriterio.BuscarPorISBN(), isbn);

        System.out.println("aqui estoy yo");

    }

    public void listarHistorialPrestamos(){
        gestionUsuario.listarUsuariosConLibrosPrestados();
        stdin.nextLine();
    }
}
