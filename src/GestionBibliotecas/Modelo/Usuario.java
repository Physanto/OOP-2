package GestionBibliotecas.Modelo;

public class Usuario {

    private String ID;
    private String nombre;
    private byte edad;

    public Usuario(){};

    public Usuario(String ID, String nombre, byte edad){
        this.ID = ID;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "ID='" + ID + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
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
}
