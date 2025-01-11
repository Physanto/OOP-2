package GestionBibliotecas.Modelo;

import java.util.ArrayList;

public class Usuario {

    private String ID;
    private String nombre;
    private byte edad;
    private ArrayList<Libro> listaLibros;

    public Usuario(){};

    public Usuario(String ID, String nombre, byte edad){
        this.ID = ID;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Usuario(String ID, String nombre, byte edad, ArrayList<Libro> lista){
        this.ID = ID;
        this.nombre = nombre;
        this.edad = edad;
        this.listaLibros = lista;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "ID='" + ID + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", listaLibros=" + listaLibros +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public ArrayList<Libro> getListaLibros(){
       return listaLibros; 
    }

    public void setListaLibros(ArrayList<Libro> lista){
        this.listaLibros = lista;
    }
}
