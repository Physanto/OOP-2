package GestionDispositivos.Modelo;

import java.util.ArrayList;

public class Tablet extends Dispositivo {

    private ArrayList<Tablet> listaTablets;

    public Tablet(){}

    public Tablet(String tipo, String marca, String modelo, String almacenamiento, String conectividad){
        super(tipo, marca, modelo, almacenamiento, conectividad);
        this.listaTablets = new ArrayList<>();
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
