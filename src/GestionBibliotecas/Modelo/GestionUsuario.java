package GestionBibliotecas.Modelo;

import GestionBibliotecas.Utils.Validador;

import java.util.ArrayList;

public class GestionUsuario{

    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Libro> listaLibrosUsuario;

    public GestionUsuario(){
        this.listaUsuarios = new ArrayList<>();
        this.listaLibrosUsuario = new ArrayList<>();
    }

    public void prestarLibro(Libro libro){
        listaLibrosUsuario.add(libro);
    }

    public void devolverLibro(String nombreLibro){
        
    }  

    public boolean validarInformacion(String id){

        Validador validadorDatos = new ValidarDatos.ValidarDatoVacio();

        return validadorDatos.validarIdRepetido(listaUsuarios, id);
    }

    public void crearUsuario(String id, String nombre, String edad){

        listaUsuarios.add(new Usuario(id, nombre, Byte.parseByte(edad)));
    }

    public ArrayList<Usuario> listarTodosUsuarios(){
        return listaUsuarios;
    }
}
