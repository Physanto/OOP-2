package GestionDispositivos.Modelo;

import GestionDispositivos.Utilidades.Mensajes;
import GestionDispositivos.Utilidades.Validar;
import GestionDispositivos.Vista.Aplicacion;

import java.util.Scanner;


public class GestionAplicacion {
    Telefono telefono;
    Aplicacion aplicacion;
    Scanner stdin;

    public GestionAplicacion(){
        stdin = new Scanner(System.in);
        aplicacion = new Aplicacion();
        telefono = new Telefono();
    }

    public void inicioAplicacion(){
        solicitarOpcion();
    }

    private String solicitarDatosObjetos(Mensajes mensaje, Validar validarDatos){

        String entradaDatos;
        do{
            mensaje.mostrarMensajePersonalizado();
            entradaDatos = stdin.nextLine();

            if(validarDatos.validarEntrada(entradaDatos)){
                return entradaDatos;
            }

        }
        while(true);
    }

    private void solicitarOpcion(){

        byte opcion;
        do{
            aplicacion.mostrarMenuOpciones();
            System.out.print("Ingresa una opcion (1-6): ");
            opcion = stdin.nextByte();

            switch(opcion){
                
                case 1:
                    agregarDispositivo();
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Opcion incorrecta, recuerda (1-6)");
            }
        }
        while(opcion != 6);
        stdin.close();
    }

    private void agregarDispositivo(){
        String tipo = solicitarDatosObjetos(new BuzonMensajes.MensajeTipoTelefono(), new ValidarEntrada.ValidarDatoVacio());
        String marca = solicitarDatosObjetos(new BuzonMensajes.MensajeTipoTelefono(), new ValidarEntrada.ValidarDatoVacio());
        String modelo = solicitarDatosObjetos(new BuzonMensajes.MensajeTipoTelefono(), new ValidarEntrada.ValidarDatoVacio());
        String almacenamiento = solicitarDatosObjetos(new BuzonMensajes.MensajeTipoTelefono(), new ValidarEntrada.ValidarDatoVacio());
        String conectividad = solicitarDatosObjetos(new BuzonMensajes.MensajeTipoTelefono(), new ValidarEntrada.ValidarDatoVacio());
        String estado = solicitarDatosObjetos(new BuzonMensajes.MensajeTipoTelefono(), new ValidarEntrada.ValidarDatoVacio());

        telefono.agregarDispositivo(new Telefono(tipo, marca, modelo, almacenamiento, conectividad));
        
    }

}
