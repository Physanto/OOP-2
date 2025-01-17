package GestionDispositivos.Modelo;

public abstract class Dispositivo {

    protected String tipo;
    protected String marca;
    protected String modelo;
    protected String almacenamiento;
    protected String conectividad;
    protected String estado;
    protected static int cantDispositivos;

    public Dispositivo(){}

    public Dispositivo(String tipo, String marca, String modelo, String almacenamiento, String conectividad){
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.conectividad = conectividad;
        this.estado = "apagado";
        cantDispositivos++;
    }

    public String getTipo(){ return tipo; }
    public void setTipo(String tipo){ this.tipo = tipo; }

    public String getMarca(){ return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo(){ return modelo; }
    public void setModelo(String modelo){ this.modelo = modelo; }

    public String getAlmacenamiento(){ return almacenamiento; }
    public void setAlmacenamiento(String almacenamiento){ this.almacenamiento = almacenamiento; }

    public String getConectividad(){ return conectividad; }
    public void setConectividad(String conectividad){ this.conectividad = conectividad; }

    public String getEstado(){ return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public abstract boolean encenderDispositivo();
    public abstract boolean apagarDispositivo();
}
