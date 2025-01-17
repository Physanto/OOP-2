package GestionDispositivos.Modelo;

import java.util.ArrayList;

public class Laptop extends Dispositivo {

    private ArrayList<Laptop> listaLaptos;

    public Laptop(){}

    public Laptop(String tipo, String marca, String modelo, String almacenamiento, String conectividad){
        super(tipo, marca, modelo, almacenamiento, conectividad);
        this.listaLaptos = new ArrayList<>();
    }

    @Override
    public boolean encenderDispositivo(){
        return true;
    }

    @Override
    public boolean apagarDispositivo(){
        return true;
    }
}
