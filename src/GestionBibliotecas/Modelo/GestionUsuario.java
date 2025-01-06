package GestionBibliotecas.Modelo;

import GestionBibliotecas.Utils.Mensajes;
import GestionBibliotecas.Utils.ValidadorDatos;

import java.util.Scanner;
import java.util.ArrayList;

public class GestionUsuario{

    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Libro> listaLibrosUsuario;
    Scanner stdin;

    public GestionUsuario(){
        this.listaUsuarios = new ArrayList<>();
        this.listaLibrosUsuario = new ArrayList<>();
    }

    public void prestarLibro(Libro libro){
        listaLibrosUsuario.add(libro);
    }

    public void devolverLibro(String nombreLibro){
        
    }

    public String solicitarDatos(Mensajes mensajes, ValidadorDatos validadorDatos){

        String entrada;

        do{
            mensajes.mensajeEntrada();
            entrada = stdin.nextLine();

            if(validadorDatos.validarEntrada(entrada)){
                return entrada;
            }
            validadorDatos.mensajeError();
        }
        while(true);
    }

    public String solicitarDatosParaPrestarLibro(){

        System.out.println("\n\nIngresa el isbn del libro a prestar: ");
        String isbn = stdin.nextLine();

        return isbn; 
    }

    public void crearUsuario(){

        String id = solicitarDatos(new BuzonMensajes.MensajeId(), new Validadores.ValidarDatoVacio());
        String nombre = solicitarDatos(new BuzonMensajes.MensajeNombre(), new Validadores.ValidarDatoVacio());
        String edad = solicitarDatos(new BuzonMensajes.MensajeEdad(), new Validadores.ValidarEdad());

        if(validarInformacion(id)){
            listaUsuarios.add(new Usuario(id, nombre, Byte.parseByte(edad)));
            System.out.println("Usuario agregado correctamente.");
        }
        else{
            System.out.println("El usuario no se pudo agregar");
        }
    }

    public boolean validarInformacion(String id){

        ValidadorDatos validadorDatos = new Validadores.ValidarDatoVacio();

        return validadorDatos.validarIdRepetido(listaUsuarios, id);
    }
}
