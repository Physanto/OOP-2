package GestionDispositivos.Modelo;

import java.util.ArrayList;

public class Telefono extends Dispositivo {

    private ArrayList<Telefono> listaTelefonos;

    public Telefono(){}

    public Telefono(String tipo, String marca, String modelo, String almacenamiento, String conectividad){
        super(tipo, marca, modelo, almacenamiento, conectividad);
        this.listaTelefonos = new ArrayList<>();
    }

    @Override
    public boolean encenderDispositivo(){
        return true;
    }

    @Override
    public boolean apagarDispositivo(){
        return true;
    }

    public void agregarDispositivo(Telefono telefono){
        listaTelefonos.add(telefono);
    }
}
