package GestionBibliotecas.Modelo;

import GestionBibliotecas.Utils.Validador;
import GestionBibliotecas.Utils.Buscador;

import java.util.ArrayList;

public class GestionUsuario{

    private ArrayList<Usuario> listaUsuarios;
    private GestionLibro gestionLibro;

    public GestionUsuario(){
        this.listaUsuarios = new ArrayList<>();
        this.gestionLibro = new GestionLibro();
    }

    public void listaRelacionUsuarioLibro(String isbn, String id){
        ArrayList<Libro> libroPrestado = gestionLibro.buscarLibro(new BuscarPorCriterio.BuscarPorISBN(), isbn);
        ArrayList<Usuario> usuarioRegistrado = buscarUsuario(new BuscarPorCriterio.BuscarPorId(), id);

        if(usuarioRegistrado.isEmpty()){
            System.out.println("Esta vacia la lista");
            return;
        }

        usuarioRegistrado.getFirst().setListaLibros(libroPrestado);

        for(Usuario usuario : listarTodosUsuarios()){
            System.out.println(usuario + "   " + usuario.getListaLibros().getFirst());
        }
    }

    public ArrayList<Usuario> buscarUsuario(Buscador<Usuario, String> buscador, String dato){
        return buscador.buscarCriterio(listaUsuarios, dato);
    }


    public void devolverLibro(String nombreLibro){
        
    }  

    public boolean validarInformacion(String id){

        Validador validadorDatos = new ValidarDatos.ValidarDatoVacio();

        return validadorDatos.validarIdRepetido(listaUsuarios, id);
    }

    public boolean crearUsuario(String id, String nombre, String edad){

        if(validarInformacion(id)){
            listaUsuarios.add(new Usuario(id, nombre, Byte.parseByte(edad)));
            return true;
        }
        return false;
    }

    public ArrayList<Usuario> listarTodosUsuarios(){
        return listaUsuarios;
    }
}
