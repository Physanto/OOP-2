package leccion01;

public class Coche {
    private String marca;
    private String modelo;
    private short anno;
    
    public Coche(String marca, String modelo, short anno){
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public short getAnno(){
        return anno;
    }

    public void setAnno(short anno){
        this.anno = anno;
    }

    public void mostrarDetalle(){
        System.out.println("Coche con marca : " + marca + " model: " + modelo + " anno: " + anno);
    }
}
