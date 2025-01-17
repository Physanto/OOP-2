package GestionDispositivos.Modelo;

import java.util.ArrayList;

public class Reloj extends Dispositivo {

    private ArrayList<Reloj> listaRelojs;

    public Reloj(){}

    public Reloj(String tipo, String marca, String modelo, String almacenamiento, String conectividad){
        super(tipo, marca, modelo, almacenamiento, conectividad);
        this.listaRelojs = new ArrayList<>();
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
